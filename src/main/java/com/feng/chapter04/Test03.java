package com.feng.chapter04;

import java.util.Optional;

/**
 * @author f
 * @date 2023/7/2 13:34
 */
public class Test03 {

    public static void main(String[] args) {
        Optional<Object> empty = Optional.empty();
        Optional<Object> o = Optional.ofNullable(null);

        System.out.println(empty.isPresent());
    }
}
