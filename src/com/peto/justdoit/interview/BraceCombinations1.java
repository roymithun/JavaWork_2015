package com.peto.justdoit.interview;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

/*
 * http://codereview.stackexchange.com/questions/46003/print-all-combinations-of-balanced-parentheses
 */
public class BraceCombinations1 {
	private BraceCombinations1() {
	}

	/**
	 * Returns sets of valid combinations.
	 * 
	 * @param length
	 *            the sum of length of all- opening + closing braces
	 * @return the valid brace combinations
	 */
	public static Set<List<String>> getBraceCombinations(int length) {
		if (length <= 0) {
			throw new IllegalArgumentException("The length should be greater than zero");
		}

		final boolean oddLength = (length % 2 == 1);
		if (oddLength) {
			throw new IllegalArgumentException("The length should be even");
		}

		final Set<List<String>> paranthesesCombo = new HashSet<List<String>>();
		generate(paranthesesCombo, new LinkedList<String>(), 0, 0, length / 2);
		return paranthesesCombo;
	}

	private static void generate(Set<List<String>> paranthesesCombo, LinkedList<String> parenthesis, int openBrace, int closeBrace, int halfLength) {
		System.out.println("inter " + parenthesis + " open=" + openBrace + " close=" + closeBrace);
		if (openBrace == halfLength && closeBrace == halfLength) {
			paranthesesCombo.add(new ArrayList<String>(parenthesis));
		}
		if (openBrace > halfLength || closeBrace > openBrace) {
			return;
		}
		parenthesis.add("(");
		generate(paranthesesCombo, parenthesis, openBrace + 1, closeBrace, halfLength);
		parenthesis.removeLast();

		parenthesis.add(")");
		generate(paranthesesCombo, parenthesis, openBrace, closeBrace + 1, halfLength);
		parenthesis.removeLast();
	}

	public static void main(String[] args) {
		System.out.println(getBraceCombinations(6));
	}
}
