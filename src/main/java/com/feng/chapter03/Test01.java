package com.feng.chapter03;

import com.feng.chapter01.Artist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/**
 * @author f
 * @date 2023/7/1 12:00
 */
public class Test01 {

    public static void main(String[] args) {
        // for
        List<Artist> list = new ArrayList<>();
        Artist artist = new Artist("gin", "gin", "hang");
        list.add(artist);
        int count = 0;

        for (Artist ar : list) {
            count++;
        }
        System.out.println("num of artist: " + count);

        // iterator
        Iterator<Artist> iterator = list.iterator();
        while (iterator.hasNext()) {
            Artist next = iterator.next();
            if (Objects.equals(next.getName(), "viki")) {
                count++;
            }
        }

        // stream
        long streamCount = list.stream().filter(artist1 -> Objects.equals(artist1.getName(), "lam")).count();
        System.out.println("stream count: " + streamCount);
    }
}
