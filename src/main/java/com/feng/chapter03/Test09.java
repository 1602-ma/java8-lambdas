package com.feng.chapter03;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author f
 * @date 2023/9/5 21:45
 */
public class Test09 {

	public static void main(String[] args) {
		List<Integer> collect = Stream.of(Arrays.asList(1, 2, 3), Arrays.asList(1, 1)).flatMap(Collection::stream)
				.collect(Collectors.toList());

		System.out.println(collect);
	}
}
