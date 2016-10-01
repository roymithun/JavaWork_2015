package com.peto.justdoit.interviewbit;

public class GridUniquePaths {

	public static void main(String[] args) {
		System.out.println(uniquePaths(3, 4));
	}

	static int uniquePaths(int m, int n) {
		// (m+n-2)C(n-1) = (m+n-2)!/((m+n-2)
		// -(n-1))!(n-1)!=(m+n-2)!/(m-1)!(n-1)!
		long ans = 1;
		for (int i = n; i < (m + n - 1); i++) {
			ans *= i;
			ans /= (i - n + 1);
		}
		return (int) ans;
	}

	static int uniquePaths1(int m, int n) {
		int nCk = 1;
		for (int k = 0; k <= n; k++) {
			System.out.print(nCk + " ");
			nCk = nCk * (n - k) / (k + 1);
		}
		System.out.println();

		return nCk;
	}
}
