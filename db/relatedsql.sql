/*
  This script is used to initalise the project quicker
 */
-- Create the database
CREATE DATABASE IF NOT EXISTS chatroom;
USE chatroom ;

-- Create the admin table
CREATE TABLE IF NOT EXISTS admin (
                                     AdminId INT AUTO_INCREMENT PRIMARY KEY,
                                     Fullname VARCHAR(50) NOT NULL,
                                     Username VARCHAR(30) NOT NULL,
                                     Email VARCHAR(50) NOT NULL,
                                     Password VARCHAR(50) NOT NULL
);

-- Create the users table
CREATE TABLE IF NOT EXISTS users (
                                     ID INT AUTO_INCREMENT PRIMARY KEY,
                                     Username VARCHAR(30) NOT NULL,
                                     Email VARCHAR(50) NOT NULL,
                                     DateOfBirth DATE,
                                     Status ENUM('Active', 'Inactive') NOT NULL,
                                     AuthenticationTime DATETIME,
                                     UserKey VARCHAR(100),
                                     IP VARCHAR(15),
                                     Port INT
);

-- Create the friends table
CREATE TABLE IF NOT EXISTS friends (
                                       reqID INT AUTO_INCREMENT PRIMARY KEY,
                                       ID INT NOT NULL,
                                       ProviderID INT NOT NULL,
                                       FOREIGN KEY (ID) REFERENCES users(ID),
                                       FOREIGN KEY (ProviderID) REFERENCES users(ID)
);

-- Create the messages table
CREATE TABLE IF NOT EXISTS messages (
                                        ID INT AUTO_INCREMENT PRIMARY KEY,
                                        FROMUID INT NOT NULL,
                                        ToUID INT NOT NULL,
                                        SentDt DATETIME NOT NULL,
                                        ReadStatus BOOLEAN,
                                        ReadDt DATETIME,
                                        MessageText TEXT
);

-- Create a trigger to update AuthenticationTime when a new message is sent
DELIMITER //
CREATE TRIGGER IF NOT EXISTS updateAuthenticationTime
    AFTER INSERT ON messages
    FOR EACH ROW
BEGIN
    UPDATE users
    SET AuthenticationTime = NOW()
    WHERE ID = NEW.FROMUID;
END;
//
DELIMITER ;

-- Create a trigger to update UserKey based on user Status
DELIMITER //
CREATE TRIGGER IF NOT EXISTS updateUserKey
    BEFORE UPDATE ON users
    FOR EACH ROW
BEGIN
    IF NEW.Status = 'Active' THEN
        SET NEW.UserKey = CONCAT('active_', NEW.ID);
    ELSE
        SET NEW.UserKey = CONCAT('inactive_', NEW.ID);
    END IF;
END;
//
DELIMITER ;

-- Create a stored procedure for sending messages
DELIMITER //
CREATE PROCEDURE IF NOT EXISTS SendMessage(IN from_user INT, IN to_user INT, IN message_text TEXT)
BEGIN
    INSERT INTO messages (FROMUID, ToUID, SentDt, ReadStatus, MessageText)
    VALUES (from_user, to_user, NOW(), 0, message_text);
END;
//
DELIMITER ;

-- Insert dummy data for admin
INSERT INTO admin (Fullname, Username, Email, Password)
VALUES
    ('Admin1', 'admin1', 'admin1@example.com', 'adminpassword');

-- Insert dummy data for users
INSERT INTO users (Username, Email, DateOfBirth, Status, AuthenticationTime, UserKey, IP, Port)
VALUES
    ('ARUN', 'arun@gmail.com', '2001-01-01', 'Active', NOW(), 'userkey1', '192.168.1.1', 8080),
    ('SUDHANSHU', 'sudhanshu@gmail.com', '2002-02-15', 'Active', NOW(), 'userkey2', '192.168.1.2', 8081),
    ('TARUN', 'tarun@gmail.com', '2003-05-20', 'Active', NOW(), 'userkey3', '192.168.1.3', 8082),
    ('ARU', 'aru@gmail.com', '1998-12-10', 'Inactive', NOW(), 'userkey4', '192.168.1.4', 8083),
    ('MORIN', 'morin@gmail.com', '1999-08-25', 'Active', NOW(), 'userkey5', '192.168.1.5', 8084),
    ('DEVANSHI', 'devanshi@gmail.com', '2002-04-30', 'Active', NOW(), 'userkey6', '192.168.1.6', 8085),
    ('SHEETAL', 'sheetal@gmail.com', '1997-03-05', 'Active', NOW(), 'userkey7', '192.168.1.7', 8086),
    ('MOHAN', 'mohan@gmail.com', '2002-07-12', 'Active', NOW(), 'userkey8', '192.168.1.8', 8087),
    ('RAHUL', 'rahul@gmail.com', '1996-11-18', 'Active', NOW(), 'userkey9', '192.168.1.9', 8088),
    ('Tina', 'tina@gmail.com', '2001-04-02', 'Active', NOW(), 'userkey22', '192.168.1.22', 8101),
    ('Ulysses', 'ulysses@gmail.com', '1997-09-17', 'Active', NOW(), 'userkey23', '192.168.1.23', 8102),
    ('Victor', 'victor@gmail.com', '2000-02-08', 'Inactive', NOW(), 'userkey24', '192.168.1.24', 8103),
    ('Wendy', 'wendy@gmail.com', '1994-06-13', 'Active', NOW(), 'userkey25', '192.168.1.25', 8104),
    ('Xander', 'xander@gmail.com', '1998-01-03', 'Active', NOW(), 'userkey26', '192.168.1.26', 8105),
    ('Yara', 'yara@gmail.com', '2002-06-26', 'Active', NOW(), 'userkey27', '192.168.1.27', 8106),
    ('Zane', 'zane@gmail.com', '1995-11-19', 'Active', NOW(), 'userkey28', '192.168.1.28', 8107),
    ('Amy', 'amy@gmail.com', '2001-07-24', 'Active', NOW(), 'userkey29', '192.168.1.29', 8108),
    ('Ben', 'ben@gmail.com', '1996-12-09', 'Active', NOW(), 'userkey30', '192.168.1.30', 8109);

-- CRUD Operations
-- Create: Insert a new user
INSERT INTO users (Username, Email, DateOfBirth, Status, AuthenticationTime, UserKey, IP, Port)
VALUES ('NEWUSER', 'newuser@example.com', '1990-01-01', 'Active', NOW(), 'newuserkey', '192.168.1.10', 8089);

-- Create: Insert a new message
CALL SendMessage(1, 2, 'Hello, this is a new message.');
