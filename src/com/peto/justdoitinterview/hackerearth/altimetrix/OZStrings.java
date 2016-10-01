package com.peto.justdoitinterview.hackerearth.altimetrix;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;

public class OZStrings {

	public static void main(String args[]) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		int N = Integer.parseInt(line);
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < N; i++) {
			String input = br.readLine();
			String[] params = input.split(" ");

			String str = br.readLine();
			String[] list = str.split(" ");

			int max = findMax(list, Integer.parseInt(params[1]), Integer.parseInt(params[2]));
			sb.append(max).append("\n");
		}
		System.out.println(sb.toString());

//		 int max = findMax(new String[] { "Z", "OO", "ZOO" }, 3, 1);
	}

	static int findMax(String[] s, int numO, int numZ) {
		int max = 0;
		ArrayList<ArrayList<String>> subsets = subsetsII(s);
		Collections.sort(subsets, new Comparator<ArrayList<String>>() {
			@Override
			public int compare(ArrayList<String> a, ArrayList<String> b) {
				return b.size() - a.size();
			}
		});
		int O = numO;
		int Z = numZ;

		HashMap<String, Integer[]> map = new HashMap<>();

		for (ArrayList<String> outer : subsets) {
			if (max > 0)
				break;
			O = numO;
			Z = numZ;
			if (outer.size() == 0)
				continue;

			int cnt = 0;
			for (String inner : outer) {
				int cntO = 0;
				int cntZ = 0;
				if (map.containsKey(inner)) {
					Integer[] val = map.get(inner);
					cntO = val[0].intValue();
					cntZ = val[1].intValue();
				} else {
					cntO = countMatches(inner, 'O');
					cntZ = countMatches(inner, 'Z');
					Integer[] val = { cntO, cntZ };
					map.put(inner, val);
				}

				if (O < cntO || Z < cntZ)
					break;

				cnt++;
				O -= cntO;
				Z -= cntZ;
				if (cnt == outer.size()) {
					max = Math.max(max, cnt);
					break;
				}
			}
		}
		return max;
	}

	public static int countMatches(final CharSequence str, final char ch) {
		if (isEmpty(str)) {
			return 0;
		}
		int count = 0;
		// We could also call str.toCharArray() for faster look ups but that
		// would generate more garbage.
		for (int i = 0; i < str.length(); i++) {
			if (ch == str.charAt(i)) {
				count++;
			}
		}
		return count;
	}

	public static boolean isEmpty(final CharSequence cs) {
		return cs == null || cs.length() == 0;
	}

	static public ArrayList<ArrayList<String>> subsetsII(String[] S) {
		// Arrays.sort(S);
		ArrayList<ArrayList<String>> res = new ArrayList<>();
		ArrayList<String> path = new ArrayList<>();
		subsetsRe(S, 0, path, res);
		return res;
	}

	static void subsetsRe(String[] S, int start, ArrayList<String> path, ArrayList<ArrayList<String>> res) {
		ArrayList<String> sub = new ArrayList<>(path);
		res.add(sub);
		for (int i = start; i < S.length; ++i) {
			if (i != start && S[i] == S[i - 1])
				continue;
			path.add(S[i]);
			subsetsRe(S, i + 1, path, res);
			path.remove(path.size() - 1);
		}
	}
}
