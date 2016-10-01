package com.peto.justdoit;

public class CheckIPRegex {

	public static void main(String[] args) {
		String s = "000.12.12.034";	
		
		System.out.println(s.matches("(?:(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)"));
	}
}
