package com.peto.hackersrank.strings;

import java.util.Scanner;

public class CavityMap {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] mat = new int[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				int x = sc.nextInt();
				mat[i][j] = x;
			}
		}
		printArray(n, mat);
	}

	static void findCavity(int[][] mat) {
		// printArray(mat);
		// if(mat.length==1 || mat.length==2) {
		// printArray(mat);
		// }
	}

	static void printArray(int n, int[][] mat) {
		// int n=mat.length;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(mat[i][j]);
			}
			System.out.println();
		}
	}
}
