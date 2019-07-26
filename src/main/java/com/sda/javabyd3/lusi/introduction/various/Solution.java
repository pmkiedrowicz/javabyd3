package com.sda.javabyd3.lusi.introduction.various;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Solution {
	private Double x1;
	private Double x2;

	public Solution(Double x1) {
		this.x1 = x1;
	}
}
