package com.peto.justdoit.interviewbit;

public class StringStrStr {

	public static void main(String[] args) {

		// System.out.println(Arrays.toString(getNext("abababca")));

		System.out.println(strStr("banananobano", "nano"));
	}

	// http://www.programcreek.com/2012/12/leetcode-implement-strstr-java/
	static public int strStr(String haystack, String needle) {
		if (haystack == null || needle == null)
			return -1;

		int h = haystack.length();
		int n = needle.length();

		if (n > h)
			return -1;
		if (n == 0)
			return -1;

		int[] next = getPartialMatchTable(needle);
		int i = 0;

		while (i <= h - n) {
			int success = 1;
			for (int j = 0; j < n; j++) {
				if (needle.charAt(0) != haystack.charAt(i)) {
					success = 0;
					i++;
					break;
				} else if (needle.charAt(j) != haystack.charAt(i + j)) {
					success = 0;
					i = i + j - next[j - 1];
					break;
				}
			}
			if (success == 1)
				return i;
		}

		return -1;
	}

	// http://jakeboxer.com/blog/2009/12/13/the-knuth-morris-pratt-algorithm-in-my-own-words/
	// http://www.ics.uci.edu/~eppstein/161/960227.html
	static public int[] getPartialMatchTable(String needle) {
		int[] next = new int[needle.length()];
		next[0] = 0;

		for (int i = 1; i < needle.length(); i++) {
			int index = next[i - 1];
			while (index > 0 && needle.charAt(index) != needle.charAt(i)) {
				index = next[index - 1];
			}

			if (needle.charAt(index) == needle.charAt(i)) {
				next[i] = next[i - 1] + 1;
			} else {
				next[i] = 0;
			}
		}

		return next;
	}
}
