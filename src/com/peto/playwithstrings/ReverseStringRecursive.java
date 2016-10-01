package com.peto.playwithstrings;

public class ReverseStringRecursive {

	public static void main(String[] args) {
		System.out.println(reverse("peto"));
	}

	public static String reverse(String s) {
		if (s.length() == 0)
			return s;
		return reverse(s.substring(1))+s.charAt(0);
	}
}
