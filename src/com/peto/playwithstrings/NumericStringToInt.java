package com.peto.playwithstrings;

import java.util.regex.Pattern;

public class NumericStringToInt {

	public static void main(String[] args) {
		int num = numericStringToInt("123456");
		System.out.println("num=" + num);
	}

	public static int numericStringToInt(String str) {
		if (str == null || str.length() == 0)
			throw new RuntimeException("Input is not valid");
		Pattern pattern = Pattern.compile(".*\\D.*");

		if (!pattern.matcher(str).matches()) {
			int val = Integer.parseInt(str);
			return val;
		}
		throw new RuntimeException("Input is not valid");
	}
}
