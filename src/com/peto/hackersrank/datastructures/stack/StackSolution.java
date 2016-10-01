package com.peto.hackersrank.datastructures.stack;

import java.util.Scanner;
import java.util.Vector;

public class StackSolution {

	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT.
		 * Your class should be named Solution.
		 */
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		long time1 = System.nanoTime();
		System.out.println("" + maxHeight(arr));
		long time2 = System.nanoTime();
		System.out.println("time taken = " + (time2 - time1));
	}

	static int maxHeight(int[] arr) {
		int l = arr.length;
		int lastMax = 0;
		// loop 1
		int set = 1;
		while (set <= l) {
			int step = 0;
			while (set + step <= l) {
				int cursor = step;

				int min = arr[cursor];
				while (cursor < set + step) {
					min = Math.min(min, arr[cursor]);
					cursor++;

				}
				lastMax = Math.max(lastMax, min);
				step++;
			}

			set++;
		}

		return lastMax;
	}
}
