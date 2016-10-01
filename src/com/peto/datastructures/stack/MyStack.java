package com.peto.datastructures.stack;

import java.util.Arrays;

public class MyStack<T> {

	public static void main(String[] args) {
		MyStack<String> stack = new MyStack<>();
		stack.push("Gibow1");
		stack.push("Gibow2");
		stack.push("Gibow3");
		stack.push("Gibow4");
		System.out.println(stack);
	}
	
	private static final int MAX_DEFAULT = 50;
	private T[] arrStack;
	private int top;
	private int maxSize;

	public MyStack() {
		this(MAX_DEFAULT);
	}

	public MyStack(int size) {
		arrStack = (T[]) new Object[size];
		this.maxSize = size;
		this.top = -1;
	}

	public void push(T obj) {
		arrStack[++this.top] = obj;
	}

	public T peek() {
		return arrStack[top];
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		for(T t : arrStack) {
			sb.append(t);
		}
		return sb.toString();
	}
}
