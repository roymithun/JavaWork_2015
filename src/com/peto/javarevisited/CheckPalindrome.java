package com.peto.javarevisited;

import java.util.Scanner;

/**
 * 
 * @author E860252
 *         http://www.programmingsimplified.com/java/source-code/java-program
 *         -check-palindrome
 *
 */
public class CheckPalindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();

		System.out.println("isPalindrome " + (isPalindrome(s)));
	}

	public static boolean isPalindrome(String s) {
		int length = s.length();
		int i, begin, middle, end;
		begin = 0;
		end = length - 1;
		middle = (begin + end) / 2;

		for (i = begin; i < middle; i++) {
			if (s.charAt(begin++) == s.charAt(end--)) {
			} else {
				return false;
			}
		}
		return true;
	}
}
