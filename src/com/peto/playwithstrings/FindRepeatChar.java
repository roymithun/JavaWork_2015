package com.peto.playwithstrings;

import java.util.HashMap;
import java.util.Map;

public class FindRepeatChar {

	public static void main(String[] args) {
		String source = "adbacdi23544xiijrtpt34466abdxxyyprpijreldjldfoi3e[bvnjhpouvof=werewprew;jjv;l x;ljo uis";
		findRepeatChars1(source);
		findRepeatChars2(source);
		findRepeatChars3(source);
	}

	/*
	 * This approach takes about 1-3 mils (avg-3) - slow I know its bad code --
	 * no need for two loops
	 */
	public static void findRepeatChars1(String str) {
		HashMap<Character, Integer> charMap = new HashMap<Character, Integer>();

		long start = System.currentTimeMillis();
		for (int i = 0; i < str.length(); i++) {
			int count = 1;
			char c1 = str.charAt(i);
			if (Character.isAlphabetic(c1)) {
				if (!charMap.containsKey(c1)) {
					for (int j = 0; j < str.length(); j++) {
						char c2 = str.charAt(j);
						if (i == j)
							continue;
						if (Character.isAlphabetic(c2)) {
							if (c1 == c2) {
								count++;
							}

						}
					}
					charMap.put(c1, count);
				}

			}
		}
		long end = System.currentTimeMillis();
		System.out.println("Total time taken 1 : " + (end - start));
		System.out.println(charMap);
	}

	/*
	 * This approach takes about 0-1 mils (avg- 0) - slow
	 */
	public static void findRepeatChars2(String str) {
		Map<Character, Integer> charMap = new HashMap<Character, Integer>();
		long start = System.currentTimeMillis();
		char[] characters = str.toCharArray();

		for (char value : characters) {

			if (Character.isAlphabetic(value)) {
				if (charMap.containsKey(value)) {
					charMap.put(value, charMap.get(value) + 1);

				} else {
					charMap.put(value, 1);
				}
			}
		}
		long end = System.currentTimeMillis();
		System.out.println("Total time taken 2 : " + (end - start));
		System.out.println(charMap);
	}

	/*
	 * http://stackoverflow.com/questions/13119926/find-duplicate-characters-in-a
	 * -string-and-count-the-number-of-occurances-using-j This is the slowest
	 * one. not sure why it is the accepted answer
	 */
	public static void findRepeatChars3(String str) {
		long start = System.currentTimeMillis();
		int count = 0, len = 0;
		do {
			try {
				char name[] = str.toCharArray();
				len = name.length;
				count = 0;
				for (int j = 0; j < len; j++) {
					if ((name[0] == name[j]) && ((name[0] >= 65 && name[0] <= 91) || (name[0] >= 97 && name[0] <= 123)))
						count++;
				}
				if (count > 1)
					System.out.print(name[0] + "=" + count + ",");
				str = str.replace("" + name[0], "");
			} catch (Exception ex) {
			}
		} while (len >= 1);
		long end = System.currentTimeMillis();
		System.out.println("\n");
		System.out.println("Total time taken 2 : " + (end - start));
	}
}
