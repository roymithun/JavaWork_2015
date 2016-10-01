package com.peto.hackersrank.warmup;

import java.util.Arrays;
import java.util.Scanner;

public class CutTheSticks {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		sc.nextLine();
		String s = sc.nextLine();
		String[] inputs = s.split(" ");
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(inputs[i]);
		}

		cutTheSticks(arr);
	}

	static void cutTheSticks(int sticks[]) {
		if (sticks.length > 0) {
			Arrays.sort(sticks);
			int min = sticks[0];
			int cut = 0;
			int remSticks = 0;
			for (int i = 0; i < sticks.length; i++) {
				cut++;
				sticks[i] = sticks[i] - min;
				if (sticks[i] != 0)
					remSticks++;
			}
			int x = 0;
			int newSticks[] = new int[remSticks];
			for (int i = 0; i < sticks.length; i++) {
				if (sticks[i] == 0)
					continue;
				newSticks[x++] = sticks[i];
			}
			System.out.println("" + cut);
			cutTheSticks(newSticks);
		}
	}
}
