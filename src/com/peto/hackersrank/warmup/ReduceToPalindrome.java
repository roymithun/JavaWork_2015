package com.peto.hackersrank.warmup;

import java.util.Scanner;

public class ReduceToPalindrome {
	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT.
		 * Your class should be named Solution.
		 */
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		sc.nextLine();
		for (int i = 0; i < t; i++) {
			String str = sc.nextLine();
			reduce(str);
		}
	}

	static void reduceToPalindrome(String str) {
		char[] strChar = str.toCharArray();
		int count = 0;
		int str_len = strChar.length;
		int x = str_len - 1;
		for (int i = 0; i <= (str_len / 2) - 1; i++) {
			int i1 = strChar[i];
			int i2 = strChar[x];
			if (i1 != i2) {
				int max = Math.max(i1, i2);
				int high_id = 0;
				int low_id = 0;
				if (i1 == max) {
					high_id = i;
					low_id = x;
				} else {
					high_id = x;
					low_id = i;
				}

				while (strChar[high_id] != strChar[low_id]) {
					count++;
					strChar[high_id] -= 1;
				}
			}

			x--;

		}
		System.out.println("" + count);
	}

	static void reduce(String str) {
		char[] strChar = str.toCharArray();
		int n = strChar.length;
		int i = 0;
		int j = 0;
		int count = 0;
		for (i = 0, j = n - 1; i >= 0 && i < j && j < n; i++, j--) {
			char c1 = strChar[i];
			char c2 = strChar[j];

			if (c1 == c2) {
				continue;
			} else {
				if (c1 > c2) {
					while (c1 != c2) {
						c1--;
						count++;
					}
				} else {
					while (c1 != c2) {
						c2--;
						count++;
					}
				}
				strChar[i] = c1;
				strChar[j] = c2;
			}
		}
		System.out.println("" + count);
	}
}
