package com.feng.practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Supplier;

/**
 * @author f
 * @date 2023/7/6 21:35
 */
public class Test02 {

    public static void main(String[] args) {
        List<Author> authors = Book.getAuthors();
        Optional<List<Author>> optionalAuthors = Optional.ofNullable(authors);

//        Optional<List<Author>> optionalAuthors1 = Optional.of(authors);
//        optionalAuthors1.ifPresent(au -> au.forEach(System.out::println));

//        optionalAuthors.orElseGet(ArrayList::new).forEach(System.out::println);
//
//        try {
//            List<Author> author = optionalAuthors.orElseThrow((Supplier<Throwable>) () -> new RuntimeException("author为空"));
//        } catch (Throwable throwable) {
//            throwable.printStackTrace();
//        };
    }
}
