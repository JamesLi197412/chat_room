package com.jamesli.event;


public interface EventChat {
    public void sendMessage(Model_Send_Message data);

    public void receiveMessage(Model_Receive_Message data);
}
