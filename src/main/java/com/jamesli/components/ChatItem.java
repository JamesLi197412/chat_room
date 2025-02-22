package com.jamesli.components;

import com.jamesli.swing.JIMSendTextPane;

import javax.swing.*;
import java.awt.*;

public class ChatItem extends JLayeredPane{
    private JIMSendTextPane txt;

    public ChatItem() {
        initComponents();
        txt.setEditable(false);
        txt.setBackground(new Color(0, 0, 0, 0));
        txt.setOpaque(false);
    }

    public void setText(String text) {
        txt.setText(text);
    }

    public void setTime(String time){
        JLabel label = new JLabel(time);
        label.setForeground(new Color(110,110,110));
        add(label);
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {
        txt = new JIMSendTextPane();
        setLayout(new javax.swing.BoxLayout(this, javax.swing.BoxLayout.PAGE_AXIS));

        txt.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 10, 10, 10));
        txt.setSelectionColor(new java.awt.Color(92, 188, 255));
        add(txt);
    }

    @Override
    protected void paintComponent(Graphics grphcs) {
        Graphics2D g2 = (Graphics2D) grphcs;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setColor(getBackground());
        g2.fillRoundRect(0, 0, getWidth(), getHeight(), 15, 15);
        super.paintComponent(grphcs);
    }
}
