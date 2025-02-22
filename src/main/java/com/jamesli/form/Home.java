package com.jamesli.form;

import net.miginfocom.swing.MigLayout;

import javax.swing.*;

public class Home extends JLayeredPane  {
    public Home(){
        initComponents();
        init();
    }

    private void init(){
        setLayout(new MigLayout("fillx, filly", "0[200!]5[fill, 100%]5[200!]0", "0[fill]0"));
        this.add(new MenuLeft());
        this.add(new Chat());
        this.add(new MenuRight());
        chat.setVisible(false);
    }


    @SuppressWarnings("unchecked")
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 1007, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 551, Short.MAX_VALUE)
        );
    }
}
