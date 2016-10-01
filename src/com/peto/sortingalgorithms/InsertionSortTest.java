package com.peto.sortingalgorithms;

import java.util.Arrays;

public class InsertionSortTest {

	public static void main(String[] args) {

//		int[] input = { 4, 2, 9, 6, 23, 12, 34, 0, 1 };
		int[] input = { 4, 2, 9, 1 };

		insertionSort(input);
	}

	private static void printNumbers(int[] input) {

		System.out.println(Arrays.toString(input));
	}

	public static void insertionSort(int array[]) {
		int n = array.length;
		for (int j = 1; j < n; j++) {
			int key = array[j];
			int i = j - 1;
			while ((i > -1) && (array[i] > key)) {
				array[i + 1] = array[i];
				i--;
			}
			array[i + 1] = key;
			printNumbers(array);
		}

	}
}
