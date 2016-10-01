package com.peto.hackersrank.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckValidUsername {

	public static void main(String[] args) {

		String pattern = "^[\\p{Alpha}](([a-zA-Z0-9]{7,29})*$)|\\?_{0,1}";
		String input = "" + "_dadasfdsf";
		Pattern p = Pattern.compile(pattern);
		Matcher m = p.matcher(input);
		if (m.find()) {
			System.out.println("valid");
		} else {
			System.out.println("invalid");
		}
	}
}
