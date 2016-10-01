package com.peto.datastructures;

public class TestCustomLinkedList {

	public static void main(String[] args) {
		CustomLinkedList linkedList = new CustomLinkedList();

		for (int i = 1; i <= 5; i++)
			linkedList.add(i);

		System.out.println("linkedList before->" + linkedList);

//		// add a new node
//		linkedList.add("Item Added");
//		System.out.println("linkedList after addition->" + linkedList);
//
//		// insert new node at 3rd position
//		linkedList.add("New Item", 3);
//		System.out.println("linkedList after insertion->" + linkedList);
//
//		 // delete node at 4th position
//		 boolean isDeleted = linkedList.remove(4);
//		 System.out.println("isDeleted->"+isDeleted);
//		
//		 System.out.println("linkedList after deletion->" + linkedList);
//
		 boolean loopCreated = linkedList.createLoop(3);
		 System.out.println("linkedList after loopCreated->" + loopCreated);
		
		 boolean hasLoop = linkedList.hasLoop();
		 System.out.println("linkedList after hasLoop->" + hasLoop);

//		linkedList.reverseList();
//		System.out.println("reverseList->" + linkedList);
		
		// TEST DUPLICATE
		// insert duplicate - comment earlier insertions
//		for (int i = 1; i <= 7; i++)
//			linkedList.add(1);
//		
//		System.out.println("linkedList before->" + linkedList);
//		
//		// remove duplicates
//		linkedList.removeDuplicates(null);
//		
//		System.out.println("linkedList before->" + linkedList);
	}
}
