package com.peto.playwithstrings;

import java.util.Scanner;

public class CountVowelConsonants {

	public static void main(String[] args) {
		System.out.println("Please enter some text");
		Scanner reader = new Scanner(System.in);

		String input = reader.nextLine();
		reader.close();
		int[] arrCount = countVowelConsonants(input);

		System.out.printf("[%s] has vowel=%d, consonant=%d", input, arrCount[0], arrCount[1]);
	}

	public static int[] countVowelConsonants(String str) {
		int cntVowel = 0;
		int cntConsonant = 0;
		if (str == null || str.length()==0) {
			throw new RuntimeException("Input is not valid");
		}

		char[] characters = str.toCharArray();

		for (char c : characters) {
			if (Character.isAlphabetic(c)) {
				switch (c) {
				case 'a':
				case 'e':
				case 'i':
				case 'o':
				case 'u':
					cntVowel++;
					break;

				default:
					cntConsonant++;
					break;
				}
			}
		}
		if (cntVowel == 0 && cntConsonant == 0)
			throw new RuntimeException("Input doesn't contain any vowel/consonant");

		int[] cnt = new int[] { cntVowel, cntConsonant };
		return cnt;
	}
}
