package com.peto.justdoit;

import java.text.SimpleDateFormat;
import java.util.Date;

public class WallJump {

	public static void main(String[] args) {
		String pattern = "MMM d, h.mmaa";
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		Date dt=new Date();
		System.out.println(dt);
		System.out.println(sdf.format(dt));
		// System.out.println(jumpCount(3, 1, 2, new int[] { 4, 6 }));
	}

	public static int jumpCount(int jump, int loss, int nWall, int[] wHeight) {
		int eJump = 0;

		for (int n = 0; n < nWall; n++) {
			int xJump = wHeight[n] / (jump - loss);
			eJump += xJump % jump == 0 ? xJump : xJump + 1;
		}
		return eJump;
	}
}
