package com.peto.hackersrank.warmup;

import java.util.Scanner;

public class HalloweenParty {

	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT.
		 * Your class should be named Solution.
		 */
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for (int i = 0; i < t; i++) {
			findPieces(sc.nextInt());
		}
	}

	static void findPieces(int k) {
		int max = 0;
		int i = 0, j = 0;
		for (i = 1, j = k - 1; i <= k; i++, j--) {
			max = Math.max(max, i * j);
		}
		System.out.println("" + max);
	}
}
