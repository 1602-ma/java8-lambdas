package com.feng.practice.arrays;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @author f
 * @date 2023/8/13 16:59
 */
public class Test01 {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2);
		List<Byte> collect = Optional.of(list).orElse(Collections.emptyList()).stream().map(Integer::byteValue).collect(Collectors.toList());

	}
}
