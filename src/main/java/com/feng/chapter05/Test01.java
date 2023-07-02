package com.feng.chapter05;

import java.util.function.Function;
import java.util.function.IntConsumer;

/**
 * @author f
 * @date 2023/7/2 13:39
 */
public class Test01 {

    public static void main(String[] args) {
        Function<Artist, String> getName = Artist::getName;
        IntConsumer aNew = String[]::new;
    }
}
