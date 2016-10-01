package com.peto.hackersrank.strings;

import java.util.Scanner;

public class PalindromeIndex {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		sc.nextLine();
		for (int i = 0; i < t; i++) {
			System.out.println("" + removeCharAtIndex(sc.nextLine()));
		}
	}

	// baa
	static int removeCharAtIndex(String str) {
		int n = str.length();
		for (int i = 0, j = n - 1; i < j; i++, j--) {
			char c = str.charAt(i);
			char r = str.charAt(j);
			if (c != r) {
				if (c == str.charAt(j - 1)) {
					boolean match = true;
					for (int p = i, q = j - 1; p <= q; p++, q--) {
						if (str.charAt(p) != str.charAt(q)) {
							match = false;
							break;
						}
					}
					if (match)
						return j;
					else
						return i;
				} else if (r == str.charAt(i + 1)) {
					return i;
				}

			}

		}

		return -1;
	}
}
