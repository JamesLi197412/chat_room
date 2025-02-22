package com.jamesli.components;

import javax.swing.*;

public class ChatBottom extends JPanel{
    public ChatBottom() {
        initComponents();
    }


    private void initComponents() {
        setBackground(new java.awt.Color(242, 242, 242));

        GroupLayout layout = new GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 40, Short.MAX_VALUE)
        );
    }


}
