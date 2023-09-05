package com.feng.chapter03;

import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author f
 * @date 2023/9/5 21:39
 */
public class Test08 {

	public static void main(String[] args) {
		Set<String> collect = Stream.of("a", "b", "b", "hello").map(String::toUpperCase).collect(Collectors.toSet());
		System.out.println(collect);
	}
}
