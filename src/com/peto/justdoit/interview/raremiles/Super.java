package com.peto.justdoit.interview.raremiles;

public abstract class Super {

	public Super getLength() {
		return this;
	}

	abstract class Sub {
		public Sub getLength() {
			return this;
		}
	}
	
	public static void main(String[] args) {
		System.out.println("in run");
	}
}
