package com.feng.chapter01;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author f
 * @date 2023/7/2 12:49
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Album {

    private String name;
    private List<Track> tracks;
    private List<String> musicians;
}
