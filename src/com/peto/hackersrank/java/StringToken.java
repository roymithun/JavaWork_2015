package com.peto.hackersrank.java;

import java.util.StringTokenizer;

public class StringToken {

	public static void main(String[] args) {
		// [A-Za-z !,?.\_'@]+
		String s = "He is a very very good boy, isn't he?";
//		String[] sr = s.split("\\s|!|,|\\?|\\.|\\|_|\'|@");
//		// "\\s|!|,|\\?|.|\\|_|'|@"
//		StringBuilder sb = new StringBuilder();
//		int count = 0;
//		for (String st : sr) {
//			if (st.length() != 0) {
//				count++;
//				sb.append(st);
//				sb.append("\n");
//			}
//		}
//		System.out.println(count);
//		System.out.println(sb.toString());
		
		StringTokenizer st=new StringTokenizer(s, " !,?.\\_'@");
		System.out.println(st.countTokens());
		while(st.hasMoreTokens()){
			String tk = st.nextToken();
			System.out.println(tk);
		}
	}
}
