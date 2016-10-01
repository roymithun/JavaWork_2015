package com.peto.hackerearth.practice;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

// Collections.sort is faster than Arrays.sort
public class ReverseSorting {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());

		for (int i = 0; i < n; i++) {
			int x = Integer.parseInt(br.readLine());
//			Integer[] y = new Integer[x];
			ArrayList<Integer> y = new ArrayList<Integer>();
			String s = br.readLine();
			String[] ss = s.split(" ");

			for (int j = 0; j < x; j++) {
				y.add(Integer.valueOf(ss[j]));
//				y[j] = Integer.parseInt(ss[j]);
			}
			reverseSort(y);
			System.out.println(y.toString().replace("[", "").replace("]", "").replace(",", ""));
		}
	}

	static void reverseSort(ArrayList<Integer> arr) {
//		Arrays.sort(arr, Collections.reverseOrder());
		Collections.sort(arr, Collections.reverseOrder());
	}
}
