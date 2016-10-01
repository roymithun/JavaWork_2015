package com.peto.justdoit.interviewbit;

public class DecimalToRoman {

	static final int M = 1000;
	static final int CM = 900;
	static final int D = 500;
	static final int CD = 400;
	static final int C = 100;
	static final int XC = 90;
	static final int L = 50;
	static final int XL = 40;
	static final int X = 10;
	static final int IX = 9;
	static final int V = 5;
	static final int IV = 4;
	static final int I = 1;

	public static void main(String[] args) {
		System.out.println(findRomanNumeral1(3));
	}

	static String findRomanNumeral1(int n) {
		int[] A = { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };
		String[] B = { "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" };
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < A.length; i++) {
			while (n >= A[i]) {
				sb.append(B[i]);
				n -= A[i];
			}
		}
		return sb.toString();
	}

	static String findRomanNumeral(int actual) {

		StringBuilder sb = new StringBuilder();
		while (actual > 0) {
			int v = 0;
			if (M <= actual && actual > CM) {
				v = M;
				sb.append("M");
			} else if (CM <= actual && actual > D) {
				v = CM;
				sb.append("CM");
			} else if (D <= actual && actual > CD) {
				v = D;
				sb.append("D");
			} else if (CD <= actual && actual > C) {
				v = CD;
				sb.append("CD");
			} else if (C <= actual && actual > XC) {
				v = C;
				sb.append("C");
			} else if (XC <= actual && actual > L) {
				v = XC;
				sb.append("XC");
			} else if (L <= actual && actual > XL) {
				v = L;
				sb.append("L");
			} else if (XL <= actual && actual > X) {
				v = XL;
				sb.append("XL");
			} else if (X <= actual && actual > IX) {
				v = X;
				sb.append("X");
			} else if (IX <= actual && actual > V) {
				v = IX;
				sb.append("IX");
			} else if (V <= actual && actual > IV) {
				v = V;
				sb.append("V");
			} else if (IV <= actual && actual > I) {
				v = IV;
				sb.append("IV");
			} else if (actual >= I && actual < V) {
				v = I;
				sb.append("I");
			}

			actual = actual - v;
		}
		return sb.toString();
	}

}
