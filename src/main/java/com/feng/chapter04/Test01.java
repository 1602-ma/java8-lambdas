package com.feng.chapter04;

import jdk.internal.instrumentation.Logger;

import java.util.Objects;
import java.util.Optional;

/**
 * @author f
 * @date 2023/7/2 13:16
 */
public class Test01 {

    public static void main(String[] args) {
        Optional<String> t = Optional.ofNullable(null);
        boolean test = t.get().equals("test");
        System.out.println(test);
        String t2 = null;
        System.out.println(t2.equals("a"));
    }
}
