package com.feng.chapter03;

import java.util.stream.Stream;

/**
 * @author f
 * @date 2023/9/5 22:05
 */
public class Test11 {

	public static void main(String[] args) {
		Integer reduce = Stream.of(1, 2, 30).reduce(1, (acc, e) -> acc * e);
		System.out.println(reduce);
	}
}
