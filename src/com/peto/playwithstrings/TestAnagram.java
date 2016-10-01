package com.peto.playwithstrings;

import java.util.Arrays;

public class TestAnagram {

	public static void main(String[] args) {

		String s1 = "mary";
		String s2 = "army";
		boolean isAnagram = isAnagram3(s1, s2);
		System.out.printf("%s, %s = %b", s1, s2, isAnagram);
	}

	public static boolean isAnagram1(String word, String anagram) {

		if (word == null || anagram == null)
			return false;
		if (word.length() != anagram.length())
			return false;

		char[] charactersWord = word.toCharArray();

		for (char c : charactersWord) {
			int index = anagram.indexOf(c);
			if (index != -1)
				anagram = anagram.substring(0, index) + anagram.substring(index + 1, anagram.length());
			else
				return false;
		}
		return anagram.isEmpty();
	}

	public static boolean isAnagram2(String word, String anagram) {
		if (word == null || anagram == null)
			return false;

		char[] charactersWord = word.toCharArray();
		char[] charactersAnagram = anagram.toCharArray();

		Arrays.sort(charactersWord);
		Arrays.sort(charactersAnagram);

		return Arrays.equals(charactersWord, charactersAnagram);
	}

	public static boolean isAnagram3(String word, String anagram) {
		char[] characters = word.toCharArray();
		StringBuilder sbSecond = new StringBuilder(anagram);
		for (char ch : characters) {
			int index = sbSecond.indexOf("" + ch);
			if (index != -1) {
				sbSecond.deleteCharAt(index);
			} else {
				return false;
			}
		}
		return sbSecond.length() == 0 ? true : false;
	}

}
