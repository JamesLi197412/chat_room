package com.jamesli.components;

import com.jamesli.component.ChatItem;

import javax.swing.*;
import java.awt.*;

public class ChatRight extends JLayeredPane {
    private ChatItem txt;

    public ChatRight() {
        initComponents();
        txt.setBackground(new Color(179, 233, 255));
    }

    public void setText(String text) {

        txt.setText(text);
        txt.setTime(text);


    }

    @SuppressWarnings("unchecked")
    private void initComponents() {
        txt = new ChatItem();
        setLayer(txt, javax.swing.JLayeredPane.DEFAULT_LAYER);

        GroupLayout layout = new GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }
}
