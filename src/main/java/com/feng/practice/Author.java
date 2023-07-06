package com.feng.practice;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

/**
 * @author f
 * @date 2023/7/6 21:08
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class Author implements Serializable {

    private static final long serialVersionUID = 584774544780432414L;

    private Long id;

    private String name;

    private Integer age;

    private String intro;

    private List<Book> books;
}
