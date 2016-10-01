package com.peto.datastructures;

public class ListNode {

	// reference to the next node in the chain, or null if there isn't one.
	private ListNode next;
	// data carried by this node. could be of any type you need.
	private Object data;

	// Node constructor
	public ListNode(Object data) {
		this.data = data;
	}

	// another Node constructor if we want to
	// specify the node to point to.
	public ListNode(ListNode next, Object data) {
		this.next = next;
		this.data = data;
	}

	// getter/setter for instance fields
	public ListNode getNext() {
		return next;
	}

	public void setNext(ListNode next) {
		this.next = next;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}
}
