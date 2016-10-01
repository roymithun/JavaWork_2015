package com.peto.playwithstrings;

import java.util.HashMap;

public class FindAllPalindromes {

	public static void main(String[] args) {

		String target = "aabbaa";
		System.out.printf("distinct palindromes in %s = %d", target, findPalindromes(target));
	}

	static int findPalindromes(String str) {
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		int count = str.length();
		for (int i = 0; i < count; i++) {
			for (int j = i + 1; j < count; j++) {
				String src = str.substring(i, j);
				String rev = ReverseLettersInString.reverseLettersInString1(src);

				if (src.equals(rev))
					map.put(src, map.containsKey(src) ? map.get(src) + 1 : 1);
			}
		}

		return map.size();
	}
}
