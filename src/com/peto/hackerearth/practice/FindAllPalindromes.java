package com.peto.hackerearth.practice;

public class FindAllPalindromes {

	public static void main(String[] args) {
		int count = 0;
//		System.out.println(Math.ceil(Math.log10(100)));
		for (int i = 0 ; i <= 0; i++) {
			if (isPalindromic(i)) {
				System.out.println(i);
				count++;
			}
		}
		System.out.println(count);
	}

	public static boolean isPalindromic(int i) {
		int len = (int) Math.ceil(Math.log10(i + 1));
		for (int n = 0; n < len / 2; n++) {
			int x = (i / (int) Math.pow(10, n)) % 10;
			int y = (i / (int) Math.pow(10, len - n - 1)) % 10;
//			System.out.println("----------");
//			System.out.println(x);
//			System.out.println(y);
			if (x != y)
				return false;
		}

		return true;
	}
}
