package com.feng.chapter02;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @author f
 * @date 2023/6/30 22:10
 */
public class Test01 {


    public static void main(String[] args) {
        Button button = new Button();

        // 匿名内部类
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("button clicked");
            }
        });

        // lambda表达式
        button.addActionListener(event -> {
            System.out.println("button clicked");
            System.out.println(event.getActionCommand());
        });


    }
}
