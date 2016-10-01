package com.peto.playwithstrings;

import java.util.ArrayList;

/**
 * http://stackoverflow.com/questions/4240080/generating-all-permutations-of-a-
 * given-string
 * http://stackoverflow.com/questions/361/generate-list-of-all-possible
 * -permutations-of-a-string
 * 
 * @author Mithun
 *
 */
public class PermutationOfWords {

	public static void main(String[] args) {
		// permutation("", "abc");
		permutationWords("", "This is word");
	}

	public static void permutation(String prefix, String str) {
		int n = str.length();
		if (n == 0)
			System.out.println(prefix);
		else {
			for (int i = 0; i < n; i++) {
				permutation(prefix + str.charAt(i), str.substring(0, i) + str.substring(i + 1, n));
			}
		}
	}

	/*
	 * http://www.careercup.com/question?id=3861299
	 * Amazon interview question
	 */
	public static void permutationWords(String prefix, String str) {
		int n = str.length();
		if (n == 0)
			System.out.println(prefix);
		else {
			String[] arrSplit = str.split(" ");
			n = arrSplit.length;
			for (int i = 0; i < n; i++) {
				String prefix1 = (prefix != null && prefix.length() > 0) ? prefix + " " + arrSplit[i] : prefix + arrSplit[i];

				StringBuilder sb = new StringBuilder();
				if (arrSplit.length > 1) {
					for (int j = 0; j < n; j++) {
						if (i == j)
							continue;
						sb.append(arrSplit[j]);
						if (j != n - 1)
							sb.append(" ");
					}
				}

				permutationWords(prefix1, sb.toString());
			}
		}
	}
}
