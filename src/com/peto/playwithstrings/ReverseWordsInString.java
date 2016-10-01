package com.peto.playwithstrings;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;
import java.util.StringTokenizer;

public class ReverseWordsInString {

	public static void main(String[] args) {
		String inputStr = "Java is best programming language";
		System.out.println("reverse words-> " + reverseWordsInString1(inputStr));
		System.out.println("reverse words-> " + reverseWordsInString2(inputStr));
		System.out.println("reverse words-> " + reverseWordsInString3(inputStr));
	}

	public static String reverseWordsInString1(String inputStr) {
		if (inputStr == null || inputStr.length() == 0) {
			throw new RuntimeException("Input not valid");
		}
		if (inputStr.length() == 1)
			return inputStr;

		long start = System.nanoTime();
		String[] arrSplit = inputStr.split(" ");
		int n = arrSplit.length;
		StringBuilder sb = new StringBuilder(n);
		for (int i = n - 1; i >= 0; i--) {
			sb.append((i == 0) ? arrSplit[i] : arrSplit[i] + " ");
		}
		long end = System.nanoTime();
		System.out.println("Time elapsed->" + (end - start));
		return sb.toString();
	}

	public static String reverseWordsInString2(String inputStr) {
		long start = System.nanoTime();
		// Deque<String> stack = new ArrayDeque<String>();
		Stack<String> stack = new Stack<String>();
		// Put it in the stack frontwards
		StringTokenizer tokens = new StringTokenizer(inputStr);
		while (tokens.hasMoreTokens()) {
			stack.push(tokens.nextToken());
		}

		StringBuilder sb = new StringBuilder(tokens.countTokens());

		// Print the stack backwards
		while (!stack.isEmpty()) {
			String s = stack.pop();
			sb.append(s);
			if (!stack.isEmpty())
				sb.append(" ");
		}
		long end = System.nanoTime();
		System.out.println("Time elapsed->" + (end - start));
		return sb.toString();
	}

	public static String reverseWordsInString3(String inputStr) {
		long start = System.nanoTime();
		Deque<String> stack = new ArrayDeque<String>();
		// Put it in the stack frontwards
		StringTokenizer tokens = new StringTokenizer(inputStr);
		while (tokens.hasMoreTokens()) {
			stack.push(tokens.nextToken());
		}

		StringBuilder sb = new StringBuilder(tokens.countTokens());
		// Print the stack backwards
		while (!stack.isEmpty()) {
			String s = stack.pop();
			sb.append(s);
			if (!stack.isEmpty())
				sb.append(" ");
		}
		long end = System.nanoTime();
		System.out.println("Time elapsed->" + (end - start));
		return sb.toString();
	}
}
