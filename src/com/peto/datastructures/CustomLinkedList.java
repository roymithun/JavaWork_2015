package com.peto.datastructures;

public class CustomLinkedList {

	int mListCount;
	ListNode mHead;

	// LinkedList constructor
	public CustomLinkedList() {
		// this is an empty list, so the reference to the head node
		// is set to a new node with no data
		mHead = new ListNode(null);
		mListCount = 0;
	}

	// appends the specified element to the end of this list.
	public void add(Object data) {
		ListNode tempNode = new ListNode(data);

		if (mHead != null && mHead.getData() == null && mHead.getNext() == null) {
			mHead = tempNode;
			return;
		}

		ListNode currentNode = mHead;

		// starting at the head node, crawl to the end of the list
		while (currentNode.getNext() != null) {
			currentNode = currentNode.getNext();
		}

		// the last node's "next" reference set to our new node
		currentNode.setNext(tempNode);

		// increment the number of elements variable
		mListCount++;
	}

	// inserts the specified element at the specified position in this list
	public void add(Object data, int index) {
		ListNode tempNode = new ListNode(data);
		ListNode currentNode = mHead;

		for (int i = 1; i < index && currentNode.getNext() != null; i++) {
			currentNode = currentNode.getNext();
		}

		// set the new node's next-node reference to this node's next-node
		// reference
		tempNode.setNext(currentNode.getNext());
		// now set this node's next-node reference to the new node
		currentNode.setNext(tempNode);

		// increment the number of elements variable
		mListCount++;
	}

	public boolean createLoop(int target) {
		if (target < 0 || target > size())
			return false;
		ListNode targetNode = null;
		ListNode currentNode = mHead;

		if (currentNode == null)
			return false;

		int i = 1;
		// starting at the head node, crawl to the end of the list
		while (currentNode.getNext() != null) {
			currentNode = currentNode.getNext();
			if (i++ == target - 1) {
				targetNode = currentNode;
			}
		}

		currentNode.setNext(targetNode);
		return true;
	}

	public boolean hasLoop() {
		if (mHead == null)
			return false;

		ListNode pSlow = mHead.getNext();
		if (pSlow == null)
			return false;

		ListNode pFast = pSlow.getNext();
		while (pFast != null && pSlow != null) {
			if (pFast == pSlow)
				return true;

			pSlow = pSlow.getNext();

			pFast = pFast.getNext();
			if (pFast != null)
				pFast = pFast.getNext();
		}

		return false;
	}

	// returns the element at the specified position in this list.
	public Object get(int index) {
		// index must be 1 or higher
		if (index <= 0)
			return null;

		ListNode currentNode = mHead;
		for (int i = 0; i < index && currentNode != null; i++) {
			if (currentNode.getNext() == null)
				return null;

			currentNode = currentNode.getNext();
		}
		return currentNode.getData();
	}

	public boolean remove(int index) {
		// if the index is out of range, exit
		if (index < 0 || index > size())
			return false;

		ListNode currentNode = mHead;
		for (int i = 1; i < index; i++) {
			if (currentNode.getNext() == null)
				return false;

			currentNode = currentNode.getNext();
		}
		currentNode.setNext(currentNode.getNext().getNext());

		// decrement the number of elements variable
		mListCount--;
		return true;
	}

	public void reverseList() {
		if (mHead.getNext() == null)
			return;

		ListNode reverseHead = new ListNode(null);
		ListNode currentNode = mHead.getNext();
		ListNode prevNode = null;

		while (currentNode != null) {
			ListNode nextNode = currentNode.getNext();

			if (nextNode == null)
				reverseHead.setNext(currentNode);

			currentNode.setNext(prevNode);
			prevNode = currentNode;
			currentNode = nextNode;
		}
		mHead = reverseHead;
	}

	public void reverseList1() {
		ListNode reversedPart = null;
		ListNode current = mHead;
		while (current != null) {
			ListNode next = current.getNext();
			current.setNext(reversedPart);
			reversedPart = current;
			current = next;
		}
		mHead.setNext(reversedPart);
	}

	// remove duplicates
	ListNode removeDuplicates(ListNode head) {
		head = mHead;
		ListNode temp = head;
		// 1 2 2 3 3 4
		// 1 1 1 1 1 1 1
		while (head.getNext() != null) {
			if (head.getData() == head.getNext().getData()) {
				ListNode t = head.getNext().getNext();
				head.setNext(t);
			} else
			head = head.getNext();
		}
		return temp;
	}

	// returns the number of elements in this list.
	public int size() {
		return mListCount;
	}

	@Override
	public String toString() {
		ListNode currentNode = mHead;
		String output = "";
		while (currentNode != null) {
			output += "" + currentNode.getData().toString() + " ";
			currentNode = currentNode.getNext();
		}
		return output;
	}
}
