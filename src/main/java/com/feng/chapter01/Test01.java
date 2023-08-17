package com.feng.chapter01;

import java.util.Collections;
import java.util.List;

/**
 * @author f
 * @date 2023/8/13 21:13
 */
public class Test01 {

	public static void main(String[] args) {
		List emptyList = Collections.EMPTY_LIST;
		emptyList.stream().map(Object::toString);
	}
}
