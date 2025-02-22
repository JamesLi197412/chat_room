package com.jamesli.form;

import com.jamesli.components.ChatBody;
import com.jamesli.components.ChatBottom;
import com.jamesli.components.ChatTitle;

import javax.swing.*;

public class Chat extends JPanel{
    private ChatBody chatBody;
    private ChatBottom chatBottom;
    private ChatTitle chatTitle;

    public Chat(){
        initComponents();
    }
    @SuppressWarnings("unchecked")
    private void initComponents() {
        chatTitle = new ChatTitle();
        chatBottom = new ChatBottom();
        chatBody = new ChatBody();

        setBackground(new java.awt.Color(249, 249, 249));

        GroupLayout chatTitleLayout = new GroupLayout(chatTitle);
        chatTitle.setLayout(chatTitleLayout);
        chatTitleLayout.setHorizontalGroup(
                chatTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 0, Short.MAX_VALUE)
        );
        chatTitleLayout.setVerticalGroup(
                chatTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 40, Short.MAX_VALUE)
        );

        GroupLayout chatBottomLayout = new GroupLayout(chatBottom);
        chatBottom.setLayout(chatBottomLayout);
        chatBottomLayout.setHorizontalGroup(
                chatBottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 0, Short.MAX_VALUE)
        );
        chatBottomLayout.setVerticalGroup(
                chatBottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 60, Short.MAX_VALUE)
        );

        GroupLayout layout = new GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(chatTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(chatBottom, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(chatBody, javax.swing.GroupLayout.DEFAULT_SIZE, 727, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(chatTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(chatBody, javax.swing.GroupLayout.DEFAULT_SIZE, 581, Short.MAX_VALUE)
                                .addGap(0, 0, 0)
                                .addComponent(chatBottom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }
}
