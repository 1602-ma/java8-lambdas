package com.feng.chapter03;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author f
 * @date 2023/8/13 22:29
 */
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class BuilderDemo {

	private String name;
	private String age;
	private String address;
	private String school;
}
