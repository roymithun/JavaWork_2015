package com.peto.hackersearth;

import java.io.BufferedReader;
import java.io.InputStreamReader;

class TestClass {
	public static void main(String args[]) throws Exception {
		/*
		 * Read input from stdin and provide input before running
		 */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		int N = Integer.parseInt(line);
		String[] inputs = new String[N];
		for (int i = 0; i < N; i++) {
			line = br.readLine();
			inputs[i] = line;
		}

		String[] outputs = new String[N];
		for (int i = 0; i < N; i++) {
			outputs[i] = findCharactersToType(inputs[i]);
		}

		for (String s : outputs) {
			System.out.println(s);
		}
	}

	public static String findCharactersToType(String line) {
		StringBuilder sb = new StringBuilder(line);
		int count = 0;
		int idxWWW = sb.indexOf("www.");
		if (idxWWW != -1) {
			sb.delete(idxWWW, 4);
		}

		int idxCOM = sb.indexOf(".com");
		if (idxCOM != -1) {
			count = 4;
			sb.delete(idxCOM, sb.length());
		}

		String removedVowels = sb.toString().replaceAll("[a,e,i,o,u]", "");

		count = count + removedVowels.length();
		return String.format("%d/%d", count, line.length());
	}
}
