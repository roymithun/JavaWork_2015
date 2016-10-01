package com.peto.justdoit.interview;

import java.math.BigInteger;

public class PermutationNumber {

	static boolean hasN = false;
	public static void main(String[] args) {
		permute("", "121");
		System.out.println(hasN);
	}

	static void permute(String prefix, String base) {
		int n = base.length();
		if (n == 0) {
			System.out.println(prefix);
			BigInteger b = new BigInteger(prefix);
			hasN = (b.remainder(new BigInteger("8")).intValue() == 0);
		} else if (n > 0) {
			for (int i = 0; i < n; i++)
				if(!hasN)permute(prefix + base.charAt(i), base.substring(0, i) + base.substring(i + 1, n));
		} 
	}
}
