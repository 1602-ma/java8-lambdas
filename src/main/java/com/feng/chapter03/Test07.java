package com.feng.chapter03;

/**
 * @author f
 * @date 2023/8/13 22:30
 */
public class Test07 {

	public static void main(String[] args) {
		BuilderDemo builderDemo = BuilderDemo.builder().age("18").name("an").address("lukas").build();
		System.out.println(builderDemo);
	}
}
