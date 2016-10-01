package com.peto.justdoit.interviewbit;

import java.util.ArrayList;

public class PalindromeString {

	public static void main(String[] args) {
		System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
	}

	static public int isPalindrome(String a) {
		ArrayList<Character> list = new ArrayList<>();
		char[] chars = a.toCharArray();
		for (char c : chars) {
			if (Character.isLetterOrDigit(c))
				list.add(Character.toLowerCase(c));
		}

		int n = list.size();
		for (int i = 0, j = n-1; i < n / 2; i++, j--) {
			if (list.get(i) != list.get(j))
				return 0;
		}
		return 1;
	}
}
