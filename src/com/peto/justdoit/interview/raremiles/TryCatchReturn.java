package com.peto.justdoit.interview.raremiles;

public class TryCatchReturn {

	public static void main(String[] args) {
		System.out.println(helloReturn());
	}

	// http://stackoverflow.com/questions/15225819/try-catch-finally-return-clarification
	// http://stackoverflow.com/questions/2309964/multiple-returns-which-one-sets-the-final-return-value
	static int helloReturn() {
		try {
			throw new RuntimeException();
			// return 1;
		} catch (Exception e) {
			return 2;
		}

		finally {
			// this is returned
			return 3;
		}
	}
}
