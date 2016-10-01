package com.peto.hackersrank.strings;

import java.util.Scanner;
import java.util.TreeSet;

public class CheckChars {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		String[] input = new String[n];
		for (int i = 0; i < n; i++) {
			String s = sc.next();
			input[i] = s;
		}

		String common = input[0];
		for (int i = 1; i < n; i++) {
			common = common.replaceAll("[^" + input[i] + "]", "");
		}

//		System.out.println(common.length());
		 String c = countElements(input, 0);
		 System.out.println(c.length());
		// test();
		 
		 TreeSet<String> set = new TreeSet<String>();
		 for(String s : set) {
			 
		 }
	}

	
	public static void test() {
		String c1 = "abcdde".replaceAll("[^" + "baccd" + "]", "");
		System.out.println(c1);
		String c2 = "eeabg".replaceAll("[^" + c1 + "]", "");
		System.out.println(c2);
	}

	public static String countElements(String[] s, int idx) {
		if (idx == s.length - 1)
			return "";
		String c="";
		if(idx==0)
			c=s[0];
		return c.replaceAll(countElements(s, idx+1), "");
//		return c + countElements(s, c.replaceAll("[^" + s[idx + 1] + "]", ""), idx + 1);
	}

	public static boolean hasChar(String str, char c) {
		if (str.length() == 0)
			return false;
		if (str.charAt(0) == c)
			return true;
		return hasChar(str.substring(1), c);
	}
}

