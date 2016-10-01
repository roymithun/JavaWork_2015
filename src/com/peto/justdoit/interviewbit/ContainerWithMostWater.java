package com.peto.justdoit.interviewbit;

import java.util.ArrayList;
import java.util.Arrays;

public class ContainerWithMostWater {
	public static void main(String[] args) {
		Integer[] a = { 1, 5, 4, 3 };
		System.out.println(maxArea(new ArrayList<>(Arrays.asList(a))));
	}

	// http://www.programcreek.com/2014/03/leetcode-container-with-most-water-java/
	// https://github.com/leetcoders/LeetCode-Java/blob/master/ContainerWithMostWater.java
	static public int maxArea(ArrayList<Integer> height) {
		int n = height.size();
		if (height == null || n < 2) {
			return 0;
		}

		int result = 0;
		int left = 0;
		int right = n - 1;

		while (left < right) {
			result = Math.max(result, (right - left) * Math.min(height.get(left), height.get(right)));
			if (height.get(left) < height.get(right))
				left++;
			else
				right--;
		}

		return result;
	}
}
