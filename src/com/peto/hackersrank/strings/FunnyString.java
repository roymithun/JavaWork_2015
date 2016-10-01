package com.peto.hackersrank.strings;

import java.util.Scanner;

public class FunnyString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		sc.nextLine();
		for (int i = 0; i < t; i++) {
			String s = sc.nextLine();
			isFunnyString(s);
		}
	}

	static void isFunnyString(String str) {
		boolean isFunny = true;
		int l = str.length();
		String rev = reverseString(str);
		for (int i = 1; i < l; i++) {
			int d1 = Math.abs(str.charAt(i) - str.charAt(i - 1));
			int d2 = Math.abs(rev.charAt(i) - rev.charAt(i - 1));
			if (d1 != d2) {
				isFunny = false;
			}
		}
		System.out.println("" + (isFunny ? "Funny" : "Not Funny"));
	}

	static String reverseString(String src) {
		char[] charStr = src.toCharArray();
		char[] revStr = new char[charStr.length];
		int x = 0;
		for (int i = charStr.length - 1; i >= 0; i--) {
			revStr[x++] = charStr[i];
		}
		return new String(revStr);
	}
}
