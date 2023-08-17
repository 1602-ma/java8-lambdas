package com.feng.chapter03;

import java.util.stream.Stream;

/**
 * @author f
 * @date 2023/7/2 12:29
 */
public class Test05 {

    public static void main(String[] args) {
        Integer count = Stream.of(1, 2, 3, 4).reduce(0, Integer::sum);
        System.out.println(count);

        Integer integer = Stream.of(1, 2, 3, 4).reduce(Integer::sum).get();
        System.out.println(integer);
    }
}
