package com.peto.sortingalgorithms;

import java.util.Arrays;

/**
 * This holds good!!! :)
 * 
 * @author Mithun
 * 
 */
public class BubbleSortTest {

	public static void main(String[] args) {
		// int[] arr = { 3, 7, 4, 4, 6, 5, 8, 2 };
		int[] arr = { 2, 8, 7, 5, 3, 6, 4, 9, 1 };
		bubbleSort(arr);

	}

	public static void bubbleSort(int arr[]) {
		int iteration = 0;
		boolean hasSwap = false;
		do {
			iteration++;
			hasSwap = false;
			for (int i = 0; i < arr.length - 1; i++) {
				if (arr[i] > arr[i + 1]) {
					swap(arr, i);
					hasSwap = true;
				}
			}
			printNumbers(arr);
		} while (hasSwap);
		System.out.println("Iteration required: " + iteration);
	}

	public static void swap(int arr[], int idx) {
		int toSwipe = arr[idx];
		arr[idx] = arr[idx + 1];
		arr[idx + 1] = toSwipe;
	}

	private static void printNumbers(int[] input) {
		System.out.println(Arrays.toString(input));
	}
}
