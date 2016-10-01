package com.peto.codingbat.recursion;

public class CountAbc {

	public static void main(String[] args) {
		System.out.println("count = " + countAbc("ababc"));
	}

	public static int countAbc(String str) {
		if (str.length() == 0)
			return 0;
		if (str.startsWith("abc") || str.startsWith("aba"))
			return 1 + countAbc(str.substring(1));

		return countAbc(str.substring(1));
	}
}
