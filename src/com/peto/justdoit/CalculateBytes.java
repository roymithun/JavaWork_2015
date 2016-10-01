package com.peto.justdoit;

import java.io.UnsupportedEncodingException;

public class CalculateBytes {

	public static void main(String[] args) {
		String s = "88888888C5AD015F719ABDF8";
		byte[] sb;
		try {
			sb = s.getBytes("CP1252");
			System.out.println("size= " + sb.length);
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
	}
}
