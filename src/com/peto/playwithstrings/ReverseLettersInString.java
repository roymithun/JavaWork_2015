package com.peto.playwithstrings;

/**
 * http://javarevisited.blogspot.sg/2012/01/how-to-reverse-string-in-java-using.
 * html
 * 
 * @author Mithun
 *
 */
public class ReverseLettersInString {

	public static void main(String[] args) {
		reverseLettersInString1("peto");
		reverseLettersInString2("peto");
		reverseLettersInString3("peto");

		long start = System.nanoTime();
		reverseRecursively("peto");
		long end = System.nanoTime();
		System.out.println("Time elapsed->" + (end - start));
	}

	/*
	 * My Approach - least expensive
	 */
	public static String reverseLettersInString1(String str) {
		long start = System.nanoTime();
		char[] arrStr = str.toCharArray();
		char[] arrReverse = new char[str.length()];

		int j = 0;
		for (int i = arrStr.length - 1; i >= 0; i--) {
			arrReverse[j++] = arrStr[i];
		}

		long end = System.nanoTime();
		System.out.println("Time elapsed->" + (end - start));
		System.out.print("arrReverse->");
		for (char c : arrReverse)
			System.out.print(c);
		System.out.print("\n");
		return new String(arrReverse);
	}

	/*
	 * 2nd best
	 */
	public static String reverseLettersInString2(String str) {
		long start = System.nanoTime();
		char[] arrStr = str.toCharArray();

		StringBuilder sb = new StringBuilder(str.length());
		for (int i = arrStr.length - 1; i >= 0; i--) {
			sb.append(arrStr[i]);
		}
		long end = System.nanoTime();
		System.out.println("Time elapsed->" + (end - start));
		System.out.println("arrReverse->" + sb.toString());
		return sb.toString();
	}

	/*
	 * 3rd best
	 */
	public static String reverseLettersInString3(String str) {
		long start = System.nanoTime();
		// reversed string using Stringbuffer
		String reverseStr = new StringBuffer(str).reverse().toString();
		long end = System.nanoTime();
		System.out.println("Time elapsed->" + (end - start));
		System.out.println("Reverse String in Java using StringBuffer: " + reverseStr);
		return reverseStr;
	}

	/*
	 * worst case
	 */
	public static String reverseRecursively(String str) {
		System.out.println("str->" + str);
		// base case to handle one char string and empty string
		if (str.length() <= 1) {
			return str;
		}

		return reverseRecursively(str.substring(1)) + str.charAt(0);

	}

}
