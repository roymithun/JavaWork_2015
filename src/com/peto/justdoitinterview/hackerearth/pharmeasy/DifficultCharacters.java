package com.peto.justdoitinterview.hackerearth.pharmeasy;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.TreeMap;
import java.util.TreeSet;

public class DifficultCharacters {
	static int CHAR_A = 97;
	static int ALPHABET_SIZE = 26;

	public static void main(String args[]) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		int T = Integer.parseInt(line);
		StringBuilder result = new StringBuilder();
		for (int i = 0; i < T; i++) {
			result.append(findDifficulty(br.readLine())).append("\n");
		}

		System.out.println(result.toString());
	}

	static public String findDifficulty(String s) {
		StringBuilder result = new StringBuilder();
		int[] letters = new int[ALPHABET_SIZE];

		for (int i = 0; i < s.length(); i++) {
			// Find index of a letter in letters array
			letters[s.charAt(i) - CHAR_A]++;
		}

		TreeMap<Integer, TreeSet<Character>> map = new TreeMap<>();

		for (int j = ALPHABET_SIZE - 1; j >= 0; j--) {
			int c = letters[j];
			int x = 'a' + j;
			char y = (char) x;

			if (c == 0) {
				result.append(y).append(" ");
			} else {
				TreeSet<Character> set;
				if (!map.containsKey(c)) {
					set = new TreeSet<>();
				} else {
					set = map.get(c);
				}
				set.add(y);
				map.put(c, set);
			}
		}

		for (TreeSet<Character> set : map.values()) {
			for (char c : set.descendingSet()) {
				result.append(c).append(" ");
			}
		}

		return result.toString();
	}
}
