package com.peto.hackersrank.warmup;

import java.math.BigInteger;

public class ExtraLongFactorials {

	public static void main(String[] args) {
		BigInteger fact = new BigInteger("1");
	}

	public static BigInteger factorial(BigInteger b, int n) {

		return b.multiply(new BigInteger(""+(n-1)));
	}
}
