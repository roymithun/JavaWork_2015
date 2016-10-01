package com.peto.javarevisited;;

/**
 * 
 * @author E860252
 *         https://www.linkedin.com/pulse/20140528113353-16837833-6-benefits
 *         -of-programming-with-immutable-objects-in-java
 */
public class ImmutableClassTest {

	public static void main(String[] args) {
		ImmutableClass immutable = new ImmutableClass(8, 10);
		// immutable.x = 8;
		// immutable.y = 10;

		System.out.println("x|y = " + immutable.getX() + "|" + immutable.getY());
	}
}

final class ImmutableClass {
	final private int x;
	final private int y;

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public ImmutableClass(int x, int y) {
		this.x = x;
		this.y = y;
	}

}
