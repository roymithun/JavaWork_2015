package com.peto.datastructures.tree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.TreeMap;

public class BinTree<T extends Comparable<T>> {

	BNode<T> rootNode;

	public BinTree() {
		rootNode = null;
	}

	private BNode<T> insertAB(BNode<T> rNode, BNode<T> nNode) {

		if (rNode == null) {
			rNode = nNode;
		} else if (nNode.compareTo(rNode) < 0) {
			rNode.leftNode = insertAB(rNode.leftNode, nNode);
		} else if (nNode.compareTo(rNode) > 0) {
			rNode.rightNode = insertAB(rNode.rightNode, nNode);
		}
		return rNode;
	}

	public void insertBST(T key) {
		BNode<T> nNode = new BNode<T>(key);
		// calls insert above
		rootNode = insertAB(rootNode, nNode);
	}

	// ------------------ height of tree -------------------
	public int heightAtNode(BNode<T> root) {
		if (root == null)
			return 0;

		int lH = heightAtNode(root.leftNode);
		int rH = heightAtNode(root.rightNode);

		return Math.max(lH, rH) + 1;
	}

	public int height() {
		return heightAtNode(rootNode);
	}

	// ------------------ InOrder traversal-------------------
	private void inorder(BNode<T> rNode) {
		if (rNode != null) {
			inorder(rNode.leftNode);
			rNode.show();
			inorder(rNode.rightNode);
		}
	}

	// calls the method to do in order
	public void inorderBST() {
		inorder(rootNode);
	}

	// ------------------ PreOrder traversal-------------------
	private void preorder(BNode<T> rNode) {
		if (rNode != null) {
			rNode.show();
			preorder(rNode.leftNode);
			preorder(rNode.rightNode);
		}
	}

	// calls the method to do in order
	public void preorderBST() {
		preorder(rootNode);
	}

	// ------------------ PostOrder traversal-------------------
	private void postorder(BNode<T> rNode) {
		if (rNode != null) {
			postorder(rNode.leftNode);
			postorder(rNode.rightNode);
			rNode.show();
		}
	}

	// calls the method to do in order
	public void postorderBST() {
		postorder(rootNode);
	}

	// ------------------ Top view -------------------
	// A class to represent a queue item. The queue is used to do Level
	// order traversal. Every Queue item contains node and horizontal
	// distance of node from root
	private class QItem {
		BNode<T> node;
		int hDist;

		public QItem(BNode<T> n, int h) {
			node = n;
			hDist = h;
		}
	}

	public void topView() {
		topView(rootNode, 0);
	}

	// http://www.geeksforgeeks.org/print-nodes-top-view-binary-tree/
	// http://algorithms.tutorialhorizon.com/print-the-top-view-of-a-binary-tree/
	private void topView(BNode<T> root, int level) {
		TreeMap<Integer, T> tMap = new TreeMap<>();

		if (root == null)
			return;
		// create a queue for level order traversal
		Queue<QItem> queue = new LinkedList<>();
		// add root with level 0 (create a queue item pack)
		queue.add(new QItem(root, level));
		while (!queue.isEmpty()) {
			QItem q = queue.remove();
			// take out the items from the package
			BNode<T> tnode = q.node;
			int lvl = q.hDist;

			// check if this is the first node you are visiting at the level
			if (!tMap.containsKey(lvl)) {
				// System.out.print(tnode.key + " ");
				tMap.put(lvl, tnode.key);
			}

			// add the left and right children of visiting nodes to the queue
			if (tnode.leftNode != null) {
				queue.add(new QItem(tnode.leftNode, lvl - 1));
			}
			if (tnode.rightNode != null) {
				queue.add(new QItem(tnode.rightNode, lvl + 1));
			}
		}

		for (T t : tMap.values()) {
			System.out.print(t + " ");
		}
	}

	// ------------------ Level order -------------------
	// single line
	void printLevelOrder() {
		if (rootNode == null)
			return;
		Queue<BNode<T>> currentLevel = new LinkedList<>();
		currentLevel.add(rootNode);
		while (!currentLevel.isEmpty()) {
			BNode<T> currNode = currentLevel.peek();
			currentLevel.remove();
			if (currNode != null) {
				System.out.print(currNode.key + " ");
				currentLevel.add(currNode.leftNode);
				currentLevel.add(currNode.rightNode);
			}
		}
	}

	// separate lines
	void printLevelOrderInSeparateLines() {
		if (rootNode == null)
			return;
		Queue<BNode<T>> currentLevel = new LinkedList<>();
		Queue<BNode<T>> nextLevel = new LinkedList<>();
		currentLevel.add(rootNode);
		while (!currentLevel.isEmpty()) {
			BNode<T> currNode = currentLevel.peek();
			currentLevel.remove();
			if (currNode != null) {
				System.out.print(currNode.key + " ");
				nextLevel.add(currNode.leftNode);
				nextLevel.add(currNode.rightNode);
			}
			if (currentLevel.isEmpty()) {
				System.out.println();
				// swap queues
				Queue<BNode<T>> tempLevel = nextLevel;
				nextLevel = currentLevel;
				currentLevel = tempLevel;
			}
		}
	}
}
