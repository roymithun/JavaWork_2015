package com.peto.hackersrank.regex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CountHackerrank {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		try {
			int n = Integer.valueOf(br.readLine());
			String[] tweets = new String[n];

			for (int i = 0; i < n; i++) {
				tweets[i] = br.readLine();
			}

			System.out.println(countHackerRank(tweets));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	static int countHackerRank(String[] tweets) {
		int count = 0;
		for (String t : tweets) {
			if (t.matches(".*(?i)hackerrank.*"))
				count++;
		}
		return count;
	}
}
