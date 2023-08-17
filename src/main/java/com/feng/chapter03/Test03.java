package com.feng.chapter03;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author f
 * @date 2023/7/2 12:01
 */
public class Test03 {

    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(1, 2);
        List<Integer> list2 = Arrays.asList(3, 4);

        List<Integer> collect = Stream.of(list1, list2)
                .flatMap(Collection::stream)
                .collect(Collectors.toList());
        System.out.println(collect);
    }
}
