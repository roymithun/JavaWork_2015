package com.peto.sortingalgorithms;

import java.util.Arrays;

//http://geeksquiz.com/merge-sort/
public class MergeSortTest1 {
	private int[] array;
	private int[] tempMergArr;
	private int length;

	public static void main(String a[]) {

		int[] inputArr = { 45, 23, 11, 89, 77, 98, 4, 28, 65, 43 };
		MergeSortTest1 mms = new MergeSortTest1();
		mms.sort(inputArr);

		System.out.println(Arrays.toString(inputArr));
	}

	public void sort(int inputArr[]) {
		this.array = inputArr;
		this.length = inputArr.length;
		this.tempMergArr = new int[length];
		printNumbers(array);
		doMergeSort(0, length - 1);
	}

	private void doMergeSort(int lowerIndex, int higherIndex) {

		if (lowerIndex < higherIndex) {
			int middle = lowerIndex + (higherIndex - lowerIndex) / 2;
			// Below step sorts the left side of the array
			doMergeSort(lowerIndex, middle);
			// Below step sorts the right side of the array
			doMergeSort(middle + 1, higherIndex);
			// Now merge both sides
			mergeParts(lowerIndex, middle, higherIndex);
		}
	}

	private void mergeParts(int lowerIndex, int middle, int higherIndex) {

		for (int x = lowerIndex; x <= higherIndex; x++) {
			tempMergArr[x] = array[x];
		}
		int i = lowerIndex;
		int j = middle + 1;
		int k = lowerIndex;
		// Copy the smallest values from either the left or the right side back
		// to the original array
		while (i <= middle && j <= higherIndex) {
			if (tempMergArr[i] <= tempMergArr[j]) {
				array[k] = tempMergArr[i];
				i++;
			} else {
				array[k] = tempMergArr[j];
				j++;
			}
			k++;
		}
		// Copy the rest of the left side of the array into the target array
		while (i <= middle) {
			array[k] = tempMergArr[i];
			k++;
			i++;
		}

//		System.out.printf("low=%d | middle=%d | high=%d\n", lowerIndex, middle, higherIndex);
//		printNumbers(array);
	}

	private static void printNumbers(int[] input) {

		// for (int i = 0; i < input.length; i++) {
		// System.out.print(input[i] + ", ");
		// }
		// System.out.println("\n");
		System.out.println(Arrays.toString(input));
	}
}
