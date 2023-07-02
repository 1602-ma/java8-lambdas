package com.feng.chapter03;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * @author f
 * @date 2023/7/2 12:12
 */
public class Test04 {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(134);
        list.add(154);
        list.add(12);

        Integer integer = list.stream().max(Comparator.comparing(value -> value)).get();
        System.out.println(integer);
    }
}
