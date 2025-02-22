package com.jamesli.components;

import javax.swing.*;
import java.awt.*;

public class ChatTitle extends JPanel{
    public ChatTitle() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    private void initComponents() {
        setBackground(new Color(242, 242, 242));

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
