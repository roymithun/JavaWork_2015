package com.peto.hackerearth.practice;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class PromNight {
	public static void main(String args[]) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		int N = Integer.parseInt(line);
		for (int i = 0; i < N; i++) {
			// get m, n
			String sMN = br.readLine();
			String[] saMN = sMN.split(" ");
			int m = Integer.parseInt(saMN[0]);
			int n = Integer.parseInt(saMN[1]);

			int[] bH = new int[m];
			int[] gH = new int[n];

			// get boys' height
			String b1 = br.readLine();
			String[] b2 = b1.split(" ");
			for (int j = 0; j < m; j++) {
				bH[j] = Integer.parseInt(b2[j]);
			}

			// sort boys' height
			Arrays.sort(bH);

			// get girls' height
			String g1 = br.readLine();
			String[] g2 = g1.split(" ");
			for (int j = 0; j < n; j++) {
				gH[j] = Integer.parseInt(g2[j]);
			}

			// sort girls' height
			Arrays.sort(gH);

			System.out.println(findCouples(bH, gH));
		}
	}

	static String findCouples(int[] boys, int[] girls) {
//		System.out.println(Arrays.toString(boys));
//		System.out.println(Arrays.toString(girls));
		int bl = boys.length;
		int gl = girls.length;
		if (gl < bl)
			return "NO";

		int bc = 0, gc = 0;

		String b = "YES";
		for (int i = 0; i < bl; i++) {
			if(girls[gc] >= boys[i]) return "NO";
			bc++;
			gc++;
		}

		return b;
	}
}
