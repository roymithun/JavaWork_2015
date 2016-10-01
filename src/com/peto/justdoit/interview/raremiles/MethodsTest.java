package com.peto.justdoit.interview.raremiles;

public class MethodsTest extends Thread {

	public static void main(String[] args) {
		MethodsTest test = new MethodsTest();
		
//		test.test(500000000);
//		test.start();
		System.out.println(16*4);
		System.out.println(16>>2);
		System.out.println(16/2*2);
		System.out.println(16>>>2);
	}
	
	@Override
	public void run() {
		System.out.println("peto 1");
		yield();
		System.out.println("peto 2");
	}
	public void test(int a) {
		System.out.println("int a");
	}
	
	public void test(long a) {
		System.out.println("long a");
	}
	
	public void test(Integer a) {
		System.out.println("Integer a");
	}
	
}
