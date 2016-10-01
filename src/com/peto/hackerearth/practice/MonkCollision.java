package com.peto.hackerearth.practice;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class MonkCollision {
	public static void main(String args[]) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		for (int i = 0; i < T; i++) {
			int N = Integer.parseInt(br.readLine());
			String s = br.readLine();
			String[] sa = s.split(" ");

			int[] xa = new int[N];

			for (int j = 0; j < N; j++) {
				xa[j] = Integer.parseInt(sa[j]);
			}

			System.out.println(countCollisions(xa));
		}
	}

	static int countCollisions(int[] a) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();

		for (int x : a) {
			int m = x % 10;
			map.put(m, map.containsKey(m) ? map.get(m) + 1 : 1);
		}

		int count = 0;
		for (int i : map.values()) {
			count += (i-1);
		}
		return count;
	}
}
