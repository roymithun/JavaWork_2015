package com.peto.hackersrank.warmup;

import java.util.Scanner;

public class AngryProfessor {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		sc.nextLine();
		for (int x = 0; x < t; x++) {
			String s = sc.nextLine();
			String inputs[] = s.split(" ");
			int n = Integer.parseInt(inputs[0]);
			int k = Integer.parseInt(inputs[1]);

			s = sc.nextLine();
			String atd[] = s.split(" ");
			int atdArr[] = new int[n];
			for (int i = 0; i < n; i++) {
				atdArr[i] = Integer.parseInt(atd[i]);
			}

			isProfessorAngry(atdArr, k);
		}
	}

	static void isProfessorAngry(int attd[], int minCount) {
		int count = 0;
		for (int a : attd) {
			if (a <= 0)
				count++;
		}

		if (count >= minCount)
			System.out.println("NO");
		else
			System.out.println("YES");
	}
}
