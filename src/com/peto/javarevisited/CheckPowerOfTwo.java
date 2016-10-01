package com.peto.javarevisited;

public class CheckPowerOfTwo {

	public static void main(String[] args) {
		System.out.println(check(124));
	}

	protected static boolean check(int n) {
		if (n <= 0) {
			throw new IllegalArgumentException("number: " + n);
		}

		if ((n & -n) == n) {
			return true;
		}
		return false;
	}
}
