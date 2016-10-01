package com.peto.datastructures.stack;

import java.util.Stack;

public class SortStack {

	public static void main(String[] args) {

		Stack<Integer> stack = new Stack<>();
		stack.push(2);
		stack.push(5);
		stack.push(3);
		stack.push(1);
		stack.push(8);
		stack.push(9);

		System.out.println(stack);

		System.out.println(sort(stack));
//		System.out.println(sort1(stack));
	}

	protected static Stack<Integer> sort(Stack<Integer> stack) {
		Stack<Integer> temp = new Stack<>();

		if (stack.isEmpty())
			return stack;

		temp.push(stack.pop());
		while (!stack.isEmpty()) {

			int sTop = stack.pop();
			if (sTop < temp.peek())
				temp.push(sTop);
			else {
				while (!temp.isEmpty() && temp.peek() < sTop) {
					stack.push(temp.pop());
				}
				temp.push(sTop);
			}
		}
		return temp;
	}
	
	public static Stack<Integer> sort1(Stack<Integer>stack){
		Stack<Integer>temp=new Stack<Integer>();
		if(stack.isEmpty())
			return stack;
		temp.push(stack.pop());
		while(!stack.isEmpty()){
			int val=stack.pop();
			while(!temp.isEmpty()){
				if(temp.peek()<val)
					stack.push(temp.pop());
				else
					break;
			}
			temp.push(val);
		}
		return temp;
	}
}
