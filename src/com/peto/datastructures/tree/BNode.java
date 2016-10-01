package com.peto.datastructures.tree;

// http://www.codeproject.com/Articles/53366/Binary-Trees-in-Java

public class BNode<T extends Comparable<T>> implements Comparable<BNode<T>> {

	BNode<T> leftNode;
	BNode<T> rightNode;
	T key;

	public BNode(T key) {
		this.leftNode = null;
		this.rightNode = null;
		this.key = key;
	}

	public BNode(BNode<T> leftNode, BNode<T> rightNode, T key) {
		this.leftNode = leftNode;
		this.rightNode = rightNode;
		this.key = key;

	}

	@Override
	public int compareTo(BNode<T> o) {
		return this.key.compareTo(o.key);
	}

	public void show() {
		System.out.print(key.toString()+" ");
	}
	
	@Override
	public String toString() {
		return key.toString();
	}
}
