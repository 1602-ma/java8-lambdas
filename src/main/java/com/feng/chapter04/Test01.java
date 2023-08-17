package com.feng.chapter04;

import java.util.Optional;

/**
 * @author f
 * @date 2023/7/2 13:16
 */
public class Test01 {

	public static void main(String[] args) {
		Optional<String> t = Optional.ofNullable(null);
		boolean test = "test".equals(t.get());
		System.out.println(test);
		String t2 = null;
		System.out.println("a".equals(t2));
	}
}
