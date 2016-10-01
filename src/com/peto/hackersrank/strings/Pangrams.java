package com.peto.hackersrank.strings;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Pangrams {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		isPangram(s);
	}

	static void isPangram(String str) {
		Set<Character> setChar = new HashSet<Character>();
		char[] charStr = str.toCharArray();
		for (char c : charStr) {
			if(Character.isAlphabetic(c)) {
				setChar.add(Character.toLowerCase(c));
			}
		}
		if (setChar.size() == 26)
			System.out.println("pangram");
		else
			System.out.println("not pangram");
	}
}
