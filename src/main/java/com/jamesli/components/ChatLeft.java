package com.jamesli.components;

import com.jamesli.component.ChatItem;
import javax.swing.GroupLayout;
import javax.swing.*;

public class ChatLeft extends JLayeredPane{
    private ChatItem txt;
    public ChatLeft() {
        initComponents();
        txt.setBackground(new Color(242, 242, 242));;
    }

    public void setText(String text) {

        txt.setText(text);
        txt.setTime("10:30 PM");


    }

    @SuppressWarnings("unchecked")
    private void initComponents() {
        txt = new ChatItem();

        GroupLayout layout = new GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(txt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(0, 0, 0))
        );
    }
}
