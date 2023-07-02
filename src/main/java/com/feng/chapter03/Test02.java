package com.feng.chapter03;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author f
 * @date 2023/7/1 13:50
 */
public class Test02 {

    public static void main(String[] args) {
        List<String> collect = Stream.of("a", "b", "c").collect(Collectors.toList());
        System.out.println(collect);

        List<String> strList = Stream.of("a", "b", "c")
                .map(string -> string.toUpperCase())
                .collect(Collectors.toList());
        System.out.println(strList);

        List<String> digitalList = Stream.of("a", "1ab", "ab1")
                .filter(value -> Character.isDigit(value.charAt(0)))
                .collect(Collectors.toList());
        System.out.println(digitalList);
    }
}
