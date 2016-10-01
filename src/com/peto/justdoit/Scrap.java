package com.peto.justdoit;

import java.math.BigInteger;
import java.util.Scanner;

public class Scrap {

	public static void main(String[] args) {
//		System.out.println(fact(new BigInteger("40")));
		
//		BigInteger n = new BigInteger("100");
//        BigInteger r = new BigInteger("10");
//		System.out.println(fact(n).divide(fact(r).multiply(fact(n.subtract(r)))));
		
		Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
        	String s1 = sc.next("\\?[0-1000]{1} \\?[0-1000]{1}");
        	String[] s = s1.split(" ");
			System.out.println(fact(new BigInteger(s[0])).divide(fact(new BigInteger(s[1])).multiply(fact(new BigInteger(s[0]).subtract(new BigInteger(s[1]))))));
        }
	}

	static BigInteger fact(BigInteger x) {
		System.out.println(x);
    	if(x==BigInteger.ZERO) return new BigInteger("1");
    	return x.multiply(fact(x.subtract(new BigInteger("1"))));
    }
}
