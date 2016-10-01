package com.peto.hackersrank.strings;

import java.util.Scanner;

public class MorganAndAString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		sc.nextLine();
		for (int i = 0; i < t; i++) {
			String a = sc.nextLine();
			String b = sc.nextLine();
			System.out.println(lexicallyArrange(a, b));
		}
	}

	static String lexicallyArrange(String a, String b) {
		int i = 0;
		int j = 0;
		char[] a1 = a.toCharArray();
		char[] b1 = b.toCharArray();
		StringBuilder sb3 = new StringBuilder();

		while (i < a1.length && j < b1.length) {
			char x1 = a1[i];
			char y1 = b1[j];
			if (x1 == y1) {
				sb3.append(x1);
				i++;
			} else if (x1 < y1) {
				sb3.append(x1);
				i++;
			} else if (x1 > y1) {
				sb3.append(y1);
				j++;
			}
		}

		while (i < a1.length) {
			char x1 = a1[i];
			sb3.append(x1);
			i++;
		}

		while (j < b1.length) {
			char y1 = b1[j];
			sb3.append(y1);
			j++;
		}
		return sb3.toString();
	}
}
