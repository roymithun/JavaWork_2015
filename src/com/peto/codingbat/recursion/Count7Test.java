package com.peto.codingbat.recursion;

public class Count7Test {

	public static void main(String[] args) {
		System.out.println(count7(777576197));
	}
	
	public static int count7(int n) {
		  if(n==0)
		    return 0;
		  if(n%10==7)
		    return 1+count7(n/10);
		  else
		    return count7(n/10);
		}

}
