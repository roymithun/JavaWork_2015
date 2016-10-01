package com.peto.hackersearth;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;

class GirlFriendDemands {
	public static void main(String args[]) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String demand = br.readLine();
		int q = Integer.parseInt(br.readLine());
		for (int i = 0; i < q; i++) {
			String input = br.readLine();
			String s[] = input.split(" ");
			BigInteger a =new BigInteger(s[0]);
			BigInteger b =new BigInteger(s[1]);

			System.out.println(chooseAnswer(demand, a, b));
		}
	}

	static String chooseAnswer(String demand, BigInteger a, BigInteger b) {
		BigInteger d = new BigInteger("" + demand.length());

		int p = a.mod(d).intValue();
		if(p==0) {
			p+=d.intValue();
		}
		int q = b.mod(d).intValue();
		if(q==0) {
			q+=d.intValue();
		}
		if (demand.charAt(p - 1) == demand.charAt(q- 1))
			return "Yes";
		else
			return "No";
	}
}