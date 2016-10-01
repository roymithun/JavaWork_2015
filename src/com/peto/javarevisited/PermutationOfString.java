package com.peto.javarevisited;;

/**
 * 
 * @author E860252
 * 
 *         http://stackoverflow.com/a/4240323/2694480
 *         http://introcs.cs.princeton.edu/java/23recursion/Permutations.java.html
 *         http://codereview.stackexchange.com/questions/41618/permutation-of-a-string-eliminating-duplicates
 */
public class PermutationOfString {

	public static void main(String[] args) {
		permute("", "pathetic");
	}

	public static void permute(String prefix, String base) {
		int n = base.length();
		if (n == 0)
			System.out.println(prefix);
		else {
			for (int i = 0; i < n; i++) {
				permute(prefix + base.charAt(i), base.substring(0, i) + base.substring(i + 1, n));
			}
		}
	}
}
