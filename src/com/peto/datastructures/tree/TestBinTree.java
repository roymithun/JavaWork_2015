package com.peto.datastructures.tree;

/*
  	 5
   /   \
  1     8
   \   / \
    3 6    9
       \  / \
       7 10  13
 */
public class TestBinTree {
	public static void main(String[] args) {
		// BinTree<String> tree = new BinTree<String>();
		// tree.insertBST("5");
		// tree.insertBST("1");
		// tree.insertBST("8");
		// tree.insertBST("6");
		// tree.insertBST("3");
		// tree.insertBST("9");

		BinTree<Integer> tree = new BinTree<Integer>();
		tree.insertBST(5);
		tree.insertBST(1);
		tree.insertBST(8);
		tree.insertBST(6);
		tree.insertBST(3);
		tree.insertBST(9);
		tree.insertBST(7);
		tree.insertBST(13);

//		System.out.println("Traversing tree in order");
//		tree.inorderBST();
//		// ///////////////////////////////
//		System.out.println();
//		System.out.println("Traversing tree pre order");
//		tree.preorderBST();
//		// ///////////////////////////////
//		System.out.println();
//		System.out.println("Traversing tree post order");
//		tree.postorderBST();
//		// ///////////////////////////////
//		System.out.println();
//		System.out.println("Height of tree");
//		System.out.println(tree.height());
//		// ///////////////////////////////
//		System.out.println();
//		System.out.println("Top view");
//		tree.topView();

		// ///////////////////////////////
		System.out.println();
		System.out.println("Level Order / BFS");
		tree.printLevelOrder();
	}
}
