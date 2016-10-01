package com.peto.sortingalgorithms;

import java.util.Arrays;

//http://www.algolist.net/Algorithms/Sorting/Quicksort
public class QuickSortTest {

	public static void main(String[] args) {

		int[] arr = { 2, 6, 8, 1, 9, 5 };
		quickSort(arr, 0, arr.length - 1);
		System.out.println(Arrays.toString(arr));
	}

	private static void quickSort(int[] arr, int left, int right) {
		int index = partition(arr, left, right);
		if (left < index - 1)
			quickSort(arr, left, index - 1);
		if (index < right)
			quickSort(arr, index, right);
	}

	private static int partition(int[] arr, int left, int right) {

		int i = left;
		int j = right;

		int pivot = arr[(i + j) / 2];
		while (i <= j) {
			while (arr[i] < pivot) {
				i++;
			}

			while (arr[j] > pivot) {
				j--;
			}

			if (i <= j) {
				swap(arr, i, j);
				i++;
				j--;
			}
		}
		return i;
	}

	private static void swap(int arr[], int x, int y) {

		int temp = arr[x];
		arr[x] = arr[y];
		arr[y] = temp;
	}

}
