package com.peto.hackersrank.warmup;

import java.util.Arrays;

public class DiagonalDifference {

	public static void main(String[] args) {
		int[][] x = new int[3][3];
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (j % 2 == 0)
					x[i][j] = 2 * i + j;
				else
					x[i][j] = i - 2 * j + 7;
			}
		}

		System.out.println(Arrays.deepToString(x));
		int leftSum = sumLeftDiagonal(x, 0, 0);
		int rightSum = sumRightDiagonal(x, 0, 0);
		System.out.println(Math.abs(leftSum - rightSum));
	}

	public static int sumLeftDiagonal(int[][] base, int x, int y) {
		if (x == base.length)
			return 0;
		int d1 = base[x][y] + sumLeftDiagonal(base, x + 1, y + 1);
		return d1;
	}

	public static int sumRightDiagonal(int[][] base, int x, int y) {
		if (x == base.length)
			return 0;
		int d1 = base[x][y + base.length - 1] + sumRightDiagonal(base, x + 1, y - 1);
		System.out.println(d1);
		return d1;
	}
}
