package com.feng.chapter03;

import java.util.stream.Stream;

/**
 * @author f
 * @date 2023/7/2 12:29
 */
public class Test05 {

    public static void main(String[] args) {
        Integer count = Stream.of(1, 2, 3, 4).reduce(2, (acc, element) -> acc + element);
        System.out.println(count);

        Integer integer = Stream.of(1, 2, 3, 4).reduce((acc, ele) -> acc + ele).get();
        System.out.println(integer);
    }
}
