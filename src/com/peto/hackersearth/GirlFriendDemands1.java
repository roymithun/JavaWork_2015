package com.peto.hackersearth;

import java.io.BufferedReader;
import java.io.InputStreamReader;

class GirlFriendDemands1 {
	public static void main(String args[]) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String demand = br.readLine();
		int q = Integer.parseInt(br.readLine());
		for (int i = 0; i < q; i++) {
			String input = br.readLine();
			String s[] = input.split(" ");
			long a = Long.parseLong(s[0]);
			long b = Long.parseLong(s[1]);

			System.out.println(chooseAnswer(demand, a, b));
		}
	}

	static String chooseAnswer(String demand, long a, long b) {
		int d = demand.length();

		int p = (int) a % d;
		if (p == 0) {
			p += d;
		}
		int q = (int) b % d;
		if (q == 0) {
			q += d;
		}
		if (demand.charAt(p - 1) == demand.charAt(q - 1))
			return "Yes";
		else
			return "No";
	}
}