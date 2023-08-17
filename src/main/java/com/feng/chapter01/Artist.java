package com.feng.chapter01;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author f
 * @date 2023/7/1 12:00
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Artist {

    private String name;
    private String members;
    private String origin;
}
