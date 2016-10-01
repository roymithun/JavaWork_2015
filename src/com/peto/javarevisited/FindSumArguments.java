package com.peto.javarevisited;

import java.util.HashSet;
import java.util.Set;

public class FindSumArguments {

	public static void main(String[] args) {
		int[] arr = { 1, 4, 5, 8, 3, 7, 12, 2, 6 };

		long l1 = System.nanoTime();
		printBruteForce(arr, 7);
		long l2 = System.nanoTime();

		System.out.println("time taken = " + (l2 - l1));

		printPairsUsingSet(arr, 7);
		long l3 = System.nanoTime();

		System.out.println("time taken = " + (l3 - l2));
	}

	// complexity - O(n2)
	public static void printBruteForce(int[] numbers, int sum) {
		for (int i = 0; i < numbers.length; i++) {
			for (int j = i + 1; j < numbers.length; j++) {
				int x = numbers[i];
				int y = numbers[j];
				if (numbers[i] + numbers[j] == sum)
					System.out.printf("(%d, %d) %n", x, y);
			}
		}
	}

	// complexity - O(n)
	public static void printPairsUsingSet(int[] numbers, int sum) {
		if (numbers.length < 2) {
			return;
		}
		Set set = new HashSet(numbers.length);

		for (int value : numbers) {
			int target = sum - value;

			// if target number is not in set then add
			if (!set.contains(target)) {
				set.add(value);
			} else {
				System.out.printf("(%d, %d) %n", value, target);
			}
		}
	}

}
