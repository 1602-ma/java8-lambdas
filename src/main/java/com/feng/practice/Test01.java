package com.feng.practice;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

/**
 * @author f
 * @date 2023/7/6 21:16
 */
public class Test01 {

    public static void main(String[] args) {
        List<Author> authors = Book.getAuthors();

//        boolean flag = authors.stream().anyMatch(author -> author.getAge() > 29);
//        System.out.println(flag);

//        boolean flag = authors.stream().allMatch(author -> author.getAge() >= 18);
//        System.out.println(flag);

//        boolean flag = authors.stream().noneMatch(author -> author.getAge() > 100);
//        System.out.println(flag);

//        Optional<Author> optionalAuthor = authors.stream().filter(author -> author.getAge() > 1).findAny();
//        optionalAuthor.ifPresent(author -> System.out.println(author.getName()));

//        Optional<Author> optionalAuthor = authors.stream().min(Comparator.comparingInt(Author::getAge));
//        optionalAuthor.ifPresent(author -> System.out.println(author.getName()));

//        Integer sum = authors.stream().distinct().map(Author::getAge)
//                .reduce(0, Integer::sum);
//        System.out.println(sum);

//        Integer min = authors.stream().map(Author::getAge)
//                .reduce(Integer.MAX_VALUE, (result, element) -> result < element ? result : element);
//        System.out.println(min);
    }
}
