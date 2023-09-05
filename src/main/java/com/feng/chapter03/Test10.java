package com.feng.chapter03;

import com.feng.chapter01.Track;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * @author f
 * @date 2023/9/5 21:51
 */
public class Test10 {

	public static void main(String[] args) {
		List<Track> tracks = Arrays.asList(new Track("Bakai", 524), new Track("violets for Your Furs", 23));

		Track track = tracks.stream().min(Comparator.comparing(Track::getLength)).get();
		System.out.println(track);
	}
}
