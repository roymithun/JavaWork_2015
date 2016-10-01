package com.peto.hackerearth.practice;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class StringCompleteness {
	public static void main(String args[]) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		int N = Integer.parseInt(line);
		for (int i = 0; i < N; i++) {
			System.out.println(isComplete(br.readLine()) ? "YES" : "NO");
		}
	}

	static boolean isComplete(String s) {
		if (s.length() < 26)
			return false;

		return s.matches("(?=.*a)(?=.*b)(?=.*c)(?=.*d)(?=.*e)(?=.*f)(?=.*g)(?=.*h)(?=.*i)(?=.*j)(?=.*k)(?=.*l)(?=.*m)(?=.*n)(?=.*o)(?=.*p)(?=.*q)(?=.*r)(?=.*s)(?=.*t)(?=.*u)(?=.*v)(?=.*w)(?=.*x)(?=.*y)(?=.*z).*");
		// return
		// s.matches("[a]+[b]+[c]+[d]+[e]+[f]+[g]+[h]+[i]+[j]+[k]+[l]+[m]+[o]+[p]+[q]+[r]+[s]+[t]+[u]+[v]+[w]+[x]+[y]+[z]");
	}
}
