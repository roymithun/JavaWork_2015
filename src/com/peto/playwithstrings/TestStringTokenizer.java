package com.peto.playwithstrings;

import java.util.StringTokenizer;

public class TestStringTokenizer {

	public static void main(String[] args) {
		String str = "Welcome to my pathetic world!";

		combineString(str);
	}

	static void testStringTokenizer(String str) {
		StringTokenizer st = new StringTokenizer(str);
		System.out.printf("countTokens= %d\n", st.countTokens());

		while (st.hasMoreTokens()) {
			System.out.println("Token = " + st.nextToken());
		}
	}

	static void combineString(String str) {
		// Method using a StringTokenizer
		StringTokenizer st = new StringTokenizer(str);
		StringBuilder sb2 = new StringBuilder();
		while (st.hasMoreElements()) {
			sb2.append(st.nextToken());
			if (st.hasMoreElements()) {
				sb2.append(", ");
			}
		}
		System.out.println(sb2);
	}
}