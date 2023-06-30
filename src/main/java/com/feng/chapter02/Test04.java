package com.feng.chapter02;

import java.util.function.Predicate;

/**
 * @author f
 * @date 2023/6/30 22:40
 */
public class Test04 {

    public static void main(String[] args) {
        Predicate<Integer> atLeast5 = x -> x > 5;
    }
}
