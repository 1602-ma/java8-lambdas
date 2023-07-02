package com.feng.chapter05;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @author f
 * @date 2023/7/2 13:53
 */
public class Test02 {

    public static void main(String[] args) {
        Set<Integer> numbers = new HashSet<>();
        numbers.add(1);
        numbers.add(4);
        numbers.add(2);
        numbers.add(3);

        List<Integer> collect = numbers.stream().collect(Collectors.toList());
        System.out.println(collect);

        Set<Integer> collect1 = numbers.stream().collect(Collectors.toSet());

        TreeSet<Integer> collect2 = numbers.stream().collect(Collectors.toCollection(TreeSet::new));
    }
}
