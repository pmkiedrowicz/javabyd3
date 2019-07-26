package com.sda.javabyd3.lusi.introduction.various;

public class EquationSolver {
	public Solution calculate(int a, int b, int c) {
		Solution result = new Solution();
		int delta = b * b - 4 * a * c;
		int switchValue = Integer.compare(delta, 0);
		switch (switchValue) {
			case 1:
				result = new Solution((-b - Math.sqrt(delta)) / 2 * a, (-b + Math.sqrt(delta)) / 2 * a);
				break;
			case 0:
				result = new Solution(-b / 2d * a);
				break;
			case -1:
				result = new Solution();
				break;
		}
		return result;
	}
}
