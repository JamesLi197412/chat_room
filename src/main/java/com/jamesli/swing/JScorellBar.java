package com.jamesli.swing;

import javax.swing.*;
import java.awt.*;

public class JScorellBar extends JScrollBar{
    public ScrollBar(){
        setUI(new ModernScrollBarUI());
        setPreferredSize(new Dimension(5,5));
        setBackground(new Color(242,242,242));
        setUnitIncrement(20);
    }
}
