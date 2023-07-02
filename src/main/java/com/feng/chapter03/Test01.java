package com.feng.chapter03;

import java.util.ArrayList;
import java.util.List;

/**
 * @author f
 * @date 2023/7/1 12:00
 */
public class Test01 {

    public static void main(String[] args) {
        List<Artist> list = new ArrayList<>();
        int count = 0;

        for (Artist ar : list) {
            count++;
        }

        list.stream().count();
    }
}
