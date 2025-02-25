package com.jamesli.emoji;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Emogi {

    private static Emogi instance;

    public static Emogi getInstance() {
        if (instance == null) {
            instance = new Emogi();
        }
        return instance;
    }

    public List<Model_Emoji> getStyle1() {
        List<Model_Emoji> list = new ArrayList<>();
        for (int i = 1; i <= 20; i++) {
            list.add(new Model_Emoji(i, new ImageIcon(getClass().getResource("resources/images/icon/" + i + ".png"))));
        }
        return list;
    }

    public List<Model_Emoji> getStyle2() {
        List<Model_Emoji> list = new ArrayList<>();
        for (int i = 21; i <= 40; i++) {
            list.add(new Model_Emoji(i, new ImageIcon(getClass().getResource("resources/images/icon/" + i + ".png"))));
        }
        return list;
    }

    public Model_Emoji getImoji(int id) {
        return new Model_Emoji(id, new ImageIcon(getClass().getResource("resources/images/icon/ + id + ".png")));
    }
}