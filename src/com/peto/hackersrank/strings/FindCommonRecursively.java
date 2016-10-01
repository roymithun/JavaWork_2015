package com.peto.hackersrank.strings;

public class FindCommonRecursively {

	/*
	 * 3 abcdde baccd eeabg
	 */
	public static void main(String[] args) {
		String[] s = { "abcdde", "baccd", "eeabg" };
		String c = findCommonChars(s, 0);
		System.out.println(c);
	}

	public static String findCommonChars(String[] s, int idx) {
		if (idx == s.length - 1)
			return "";
		String c = "";
		if (idx == 0)
			c = s[0];
		String t=findCommonChars(s, idx + 1);
		String x = c.replaceAll("[^" + t + "]", "");
		System.out.println("***** -> "+x);
		return x;
	}
}
