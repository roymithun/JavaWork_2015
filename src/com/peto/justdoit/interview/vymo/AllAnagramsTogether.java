package com.peto.justdoit.interview.vymo;

import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class AllAnagramsTogether {

	public static void main(String[] args) {
		String s = "taste human pat taest tap taets atp manhu";
		printAllAnagramsTogether(s);
	}

	static public void printAllAnagramsTogether(String input) {
		StringTokenizer tokeninzer = new StringTokenizer(input);
		Word[] words = new Word[tokeninzer.countTokens()];
		int i = 0;
		while (tokeninzer.hasMoreTokens()) {
			words[i] = new Word(tokeninzer.nextToken());
			i++;
		}

		for (Word word : words) {
			String s = word.s2;
			char[] chars = s.toCharArray();
			Arrays.sort(chars);
			word.s2 = String.copyValueOf(chars);
		}

		Arrays.sort(words, new WordsComparator());

		System.out.println(Arrays.toString(words));
	}
}

class Word {
	String s1;
	String s2;

	public Word(String s) {
		this.s1 = s;
		this.s2 = s;
	}

	@Override
	public String toString() {
		return s1;
	}
}

class WordsComparator implements Comparator<Word> {

	@Override
	public int compare(Word o1, Word o2) {
		return o1.s2.compareTo(o2.s2);
	}

}
