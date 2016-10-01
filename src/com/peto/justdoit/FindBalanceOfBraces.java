package com.peto.justdoit;

import java.util.Stack;

public class FindBalanceOfBraces {

	static final char OPEN_BRACE='{';
	static final char CLOSING_BRACE='}';
	
	public static void main(String[] args) {

		String s = "{{{}}}{{}{}}";
		char[] chars = s.toCharArray();
		Stack<Character> stack = new Stack<>();
		for (char c : chars) {
			if (!stack.isEmpty() && c == CLOSING_BRACE && stack.peek()==OPEN_BRACE)
				stack.pop();
			else
				stack.push(c);
		}

		System.out.println("String is balanced? "+stack.isEmpty());
	}

}
