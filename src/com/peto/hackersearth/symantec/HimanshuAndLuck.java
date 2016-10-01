package com.peto.hackersearth.symantec;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class HimanshuAndLuck {

	public static void main(String args[]) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		int N = Integer.parseInt(line);
		for (int i = 0; i < N; i++) {
			System.out.println("hello world");
		}

		System.out.println("Hello World!");
	}

	public int countLuckyNumbers(int a, int b) {
		int cnt = 0;
		if (b < 4)
			return cnt;
		else if (b <= 4)
			return cnt += 1;
		else if (a > 4 && b < 7)
			return cnt;
		else if (b == 7)
			return cnt += 2;
		
		
		return cnt;
	}
}
