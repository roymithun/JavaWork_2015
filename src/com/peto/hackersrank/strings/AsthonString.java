package com.peto.hackersrank.strings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.TreeSet;

public class AsthonString {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		for (int i = 0; i < t; i++) {
			String s = br.readLine();
			int p = Integer.parseInt(br.readLine());

			System.out.println("" + findConcatSubstrings(s).charAt(p));
		}
	}

	static String findConcatSubstrings(String s) {
		int len = s.length();

		TreeSet<String> set = new TreeSet<String>();

		for (int subL = 1; subL <= len; subL++) {
			for (int i = 0; i + subL <= len; i++) {
				set.add(s.substring(i, i + subL));
			}
		}

		StringBuilder sb = new StringBuilder();
		for (String c : set) {
			sb.append(c);
		}
		System.out.println(sb.toString());
		return sb.toString();
	}
}
