package com.peto.playwithstrings;

public class PalindromeWord {

	public static void main(String[] args) {
		System.out.println("isPalindrome->"+isPalindrome("bab"));
	}

	public static boolean isPalindrome(String str) {
		String reverseStr = ReverseLettersInString.reverseLettersInString1(str);
		return reverseStr.equals(str);
	}
}
