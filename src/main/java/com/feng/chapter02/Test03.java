package com.feng.chapter02;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @author f
 * @date 2023/6/30 22:26
 */
public class Test03 {

    public static void main(String[] args) {
//        final String name = "lambda";
        String name = "lambda";
//        name = "see";
        Button button = new Button();
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("hi " + name);
            }
        });

//        button.addActionListener(event -> {
//            System.out.println("hi " + name);
//        });
    }
}
