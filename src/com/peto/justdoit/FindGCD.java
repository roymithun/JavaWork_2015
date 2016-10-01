package com.peto.justdoit;

public class FindGCD {

	public static void main(String[] args) {
		findGCD(3, 6);
	}
	
	public static void findGCD(int a, int b) {
		int x=a;
		int y=b;
		int lcm=0,gcd=0,t=0;
		while(b!=0) {
			t=b;
			b=a%b;
			a=t;
		}
		gcd=a;
		lcm = (x*y)/gcd;

		System.out.println("x="+x+" y="+y+" =gcd="+gcd);
		System.out.println("x="+x+" y="+y+" =gcd="+lcm);
	}
}
