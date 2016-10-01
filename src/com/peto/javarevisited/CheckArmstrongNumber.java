package com.peto.javarevisited;

public class CheckArmstrongNumber {

	public static void main(String[] args) {
		System.out.println(isArmstrong(371));
	}

	static boolean isArmstrong(int n) {
		int nArm = 0;
		int nTemp = n;
		while (nTemp != 0) {
			int rem = nTemp % 10;
			nArm += rem * rem * rem;
			nTemp = nTemp / 10;
		}

		return nArm == n;
	}
}
