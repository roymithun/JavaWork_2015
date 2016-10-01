package com.peto.justdoit.interview;

import java.util.ArrayList;

public class BraceCombinations2 {

	final static int MAX_SIZE = 100;
	// static String str[] = new String[MAX_SIZE];

//	static ArrayList<String> list = new ArrayList<String>();

	public static void main(String[] args) {
		braceCombinations(4);
	}

	static void braceCombinations(int n) {
		if (n > 0)
			printParenthesis(new ArrayList<String>(), 0, n, 0, 0);
	}

	static void printParenthesis(ArrayList<String> list, int pos, int n, int open, int close) {
		if (close == n) {
			System.out.println(list);
//			System.out.println(str);
			return;
		} else {
			if (open > close) {
//				str[pos] = "}";
				list.add("}");
				printParenthesis(list, pos + 1, n, open, close + 1);
			}
			if (open < n) {
//				str[pos] = "{";
				list.add("{");
				printParenthesis(list, pos + 1, n, open + 1, close);
			}
		}
	}
}
