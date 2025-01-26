package com.jamesli;

import java.awt.Toolkit;
import java.awt.Dimension;
import window.ComponentResizer

// https://www.cnblogs.com/chenzhenhong/p/14168284.html
// https://www.cnblogs.com/dengyungao/p/7542235.html
// https://www.zuidaima.com/code/tag/2623.htm?p=1&s=3
// https://github.com/laubrence/minchat

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main extends javax.swing.JFrame{

    public Main() {
        initComponents();
        init();
    }

    private void init(){
        int width = 800;
        int height = 500;
        ComponentResizer com = new ComponentResizer();
        com.registerOCmponent(this);
        com.setMinimumSize(new Dimension(800, 500));
        com.setMaximumSize(Toolkit.getDefaultToolkit().getScreenSize());
        com.setSnapSize(new Dimension(10, 10));
    }

    @SuppressWarings("unchecked")
    private int pX;
    private int pY;

    private void titleMouseDragged(java.awt.event.MouseEvent evt){
        this.setLocation(this.getLocation().x + evt.getX() - s)
    }

    private void titleMousePressed(java.awt.event.MouseEvent evt){
        px = evt.getX();
        pv = vet.getY();
    }

    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable(){
            public void run() {
                new Main.setVisible(true);
            }
        })

    }
}