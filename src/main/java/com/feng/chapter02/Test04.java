package com.feng.chapter02;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BinaryOperator;
import java.util.function.Predicate;

/**
 * @author f
 * @date 2023/6/30 22:40
 */
public class Test04 {

    public static void main(String[] args) {
        Map<String, Integer> diamondWordCounts = new HashMap<>(32);
        Map<String, Integer> oldWordCounts = new HashMap<String, Integer>(32);

        Predicate<Integer> atLeast5 = x -> x > 5;

        BinaryOperator<Long> addLongs = Long::sum;

    }
}
