package com.peto.hackersearth.symantec;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class NaviAndBeer {
	public static void main(String args[] ) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		int t = Integer.parseInt(line);
		StringBuilder result = new StringBuilder();
		for (int i = 0; i < t; i++) {
			String input = br.readLine();
			String[] nkm = input.split(" ");
			int N = Integer.parseInt(nkm[0]);
			int K = Integer.parseInt(nkm[1]);
			int M = Integer.parseInt(nkm[2]);

			double cost = cost(N, K);
			result.append((int)(cost - M)).append("\n");
		}

		System.out.println(result.toString());
    }
    
	private static double cost(int N, int K) {
		double sum = Math.pow(N * (N + 1) / 2, 2);
		return K * sum;
	}
}
