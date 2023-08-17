package com.feng.chapter04;

import com.feng.chapter01.Album;

import java.util.IntSummaryStatistics;

/**
 * @author f
 * @date 2023/8/17 22:23
 */
public class Test04 {

	public static void main(String[] args) {
		Album album = new Album();
		IntSummaryStatistics intSummaryStatistics = album.getTracks().stream().mapToInt(track -> track.getName().length())
				.summaryStatistics();

		System.out.println(intSummaryStatistics.getMax());
	}
}
