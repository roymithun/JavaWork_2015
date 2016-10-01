package com.peto.justdoitinterview.hackerearth.pharmeasy;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class MillyAndClassmates {

	public static void main(String args[]) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		int T = Integer.parseInt(line);
		StringBuilder result = new StringBuilder();

		for (int i = 0; i < T; i++) {
			String n = br.readLine();
			String s = br.readLine();
			result.append(findNodes(s)).append("\n");
		}

		System.out.println(result.toString());

//		System.out.println(findNodes("3 2"));
	}

	static public String findNodes(String s) {
		String[] split = s.split(" ");

		int n = split.length;

		int front = -1;
		int end = -1;

		if (n == 0)
			return front + " " + end;

		int cnt = 0;

		for (int i = 0; i + 1 < n; i++) {
			int x = Integer.parseInt(split[i]);
			int y = Integer.parseInt(split[i + 1]);
			if (x > y) {
				if (cnt > 0) {
					front = -1;
					end = -1;
					break;
				}
				cnt++;
				if (i - 1 >= 0) {
					int p = Integer.parseInt(split[i - 1]);
					if (y > p) {
						front = i;
						end = i + 1;

						if (i + 2 < n) {
							y = Integer.parseInt(split[i + 2]);
							while (x > y) {
								end = i;
								i = i + 1;
								if (i >= n)
									break;
								y = Integer.parseInt(split[i]);
							}
						}

						front += 1;
						end += 1;
					}
				}
				else {
					front = i;
					end = i + 1;

					if (i + 2 < n) {
						y = Integer.parseInt(split[i + 2]);
						while (x > y) {
							end = i;
							i = i + 1;
							if (i >= n)
								break;
							y = Integer.parseInt(split[i]);
						}
					}

					front += 1;
					end += 1;
				}
			}
		}

		return front + " " + end;
	}
}
