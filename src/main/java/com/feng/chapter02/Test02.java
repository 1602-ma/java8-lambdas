package com.feng.chapter02;

import java.awt.event.ActionListener;
import java.util.function.BinaryOperator;

/**
 * @author f
 * @date 2023/6/30 22:18
 */
public class Test02 {

    public static void main(String[] args) {
        Runnable noArguments = () -> System.out.println("hello lambda");

        ActionListener oneArgument = event -> System.out.println("button clicked");

        Runnable multiStatement = () -> {
            System.out.println("hello lambda");
        };

        BinaryOperator<Long> add = (x, y) -> x+ y;

        BinaryOperator<Long> addExplicit = (Long x, Long y) -> x + y;

        final String[] arr = {"hello", "lambda"};
    }
}
