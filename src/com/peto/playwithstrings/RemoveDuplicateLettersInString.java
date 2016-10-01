package com.peto.playwithstrings;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateLettersInString {

	public static void main(String[] args) {
		String trimmedStr = null;
		// trimmedStr = removeDuplicateLetters("bananas");
		// System.out.println("Trimmed String->" + trimmedStr);
		trimmedStr = removeDuplicates3("bananas");
		System.out.println("Trimmed removeDuplicates->" + trimmedStr);
		// trimmedStr = removeDuplicates2("bananas");
		// System.out.println("Trimmed String->" + trimmedStr);
	}

	/*
	 * Best solution
	 */
	public static String removeDuplicates1(String str) {
		long start = System.nanoTime();
		boolean seen[] = new boolean[256];
		StringBuilder sb = new StringBuilder(seen.length);

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (!seen[ch]) {
				seen[ch] = true;
				sb.append(ch);
			}
		}
		long end = System.nanoTime();
		System.out.println("Time elapsed(ns)->" + (end - start));
		return sb.toString();
	}

	/*
	 * Maintains alphabetic order - 2nd best
	 */
	public static String removeDuplicates2(String str) {
		long start = System.nanoTime();
		int charsCount[] = new int[256];

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			charsCount[ch]++;
		}

		StringBuilder sb = new StringBuilder(charsCount.length);
		for (int i = 0; i < charsCount.length; i++) {
			if (charsCount[i] > 0) {
				sb.append((char) i);
			}
		}
		long end = System.nanoTime();
		System.out.println("Time elapsed(ns)->" + (end - start));
		return sb.toString();
	}

	/*
	 * My Approach = worst case
	 */
	public static String removeDuplicates3(String str) {
		long start = System.nanoTime();
		StringBuilder sb = new StringBuilder();
		Set<Character> uniqueSet = new LinkedHashSet<Character>();

		char[] arrStr = str.toCharArray();

		long step1 = System.nanoTime();
		System.out.println("Time elapsed(ns) 1->" + (step1 - start));
		for (char c : arrStr) {
			if (!uniqueSet.contains(c)) {
				uniqueSet.add(c);
				sb.append(c);
			}
		}
		long end = System.nanoTime();
		System.out.println("Time elapsed(ns)->" + (end - step1));
		return sb.toString();
	}

}
