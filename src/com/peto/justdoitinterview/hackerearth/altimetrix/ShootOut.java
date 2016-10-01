package com.peto.justdoitinterview.hackerearth.altimetrix;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ShootOut {
	public static final double EPSILON = 0.000001;

	public static void main(String args[]) throws Exception {

//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		String line = br.readLine();
//		int T = Integer.parseInt(line);
//		StringBuilder sb = new StringBuilder();
//		for (int i = 0; i < T; i++) {
//			Point[] points = new Point[4];
//			for (int j = 0; j <= 3; j++) {
//				String input = br.readLine();
//				String[] numbers = input.split(" ");
//				points[j] = new Point(Integer.parseInt(numbers[0]), Integer.parseInt(numbers[1]));
//			}
//			sb.append(hasBulletPathProblem(points) ? "Yes" : "No").append("\n");
//		}

		StringBuilder sb = new StringBuilder();
		Point[] points = new Point[4];
		points[0]=new Point(0,100000);
		points[1]=new Point(99999,-5);
		points[2]=new Point(-100000,555);
		points[3]=new Point(0,0);
		
		sb.append(hasBulletPathProblem(points) ? "Yes" : "No").append("\n");
		System.out.println(sb.toString());
	}

	public static boolean hasBulletPathProblem(Point[] points) {
		Point a = points[0];
		Point b = points[1];
		Point c = points[2];
		Point d = points[3];

		if (doLinesIntersect(a, c, b, d)) {
			return isPointOnLine(new LineSegment(a, c), b) || isPointOnLine(new LineSegment(a, c), d)
					|| isPointOnLine(new LineSegment(b, d), a) || isPointOnLine(new LineSegment(b, d), c);
		}

		return true;
	}

	public static boolean isPointOnLine(LineSegment a, Point b) {
		// Move the image, so that a.first is on (0|0)
		LineSegment aTmp = new LineSegment(new Point(0, 0), new Point(a.second.x - a.first.x, a.second.y - a.first.y));
		Point bTmp = new Point(b.x - a.first.x, b.y - a.first.y);
		double r = crossProduct(aTmp.second, bTmp);
		return Math.abs(r) < EPSILON;
	}

	public static double crossProduct(Point a, Point b) {
		return a.x * b.y - b.x * a.y;
	}

	static boolean doLinesIntersect(Point a, Point b, Point c, Point d) {
		if (a.x == b.x) {
			return !(c.x == d.x && a.x != c.x);
		} else if (c.x == d.x) {
			return true;
		} else {
			// Both lines are not parallel to the y-axis

			double m1 = b.y - a.y;
			int d1 = b.x - a.x;

			if (d1 == 0)
				m1 = Double.POSITIVE_INFINITY;
			else
				m1 = m1 / d1;

			double m2 = d.y - c.y;
			int d2 = d.x - c.x;

			if (d2 == 0)
				m2 = Double.POSITIVE_INFINITY;
			else
				m2 = m2 / d2;

			return m1 != m2;
		}
	}
}

class Point {
	int x, y;

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
}

class LineSegment {
	Point first;
	Point second;
	String name;

	public LineSegment(Point a, Point b) {
		this.first = a;
		this.second = b;
	}
}
