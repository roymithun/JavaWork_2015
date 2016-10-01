package com.peto.hackersrank.datastructures;

public class InsertNthLinkedList {

	public static void main(String[] args) {

		Node head = InsertNth(null, 3, 0);
		head = InsertNth(head, 5, 1);
		head = InsertNth(head, 4, 2);
		head = InsertNth(head, 2, 3);
		head = InsertNth(head, 10, 1);
		
		Delete(head, 2);
	}

	static Node InsertNth(Node head, int data, int position) {
		Node node = new Node();
		node.data=data;
	    node.next=null;
	    
	    if(position == 0) {
	        node.next = head;
	        return node;
	    }
	    
	    Node p = head;
	    while(--position>0) {
	        p = p.next;
	    }
	    
	    Node q=p.next;
	    p.next = node;
	    node.next = q;

	    System.out.println("Print ******");
		Print(head);
		return head;
	}

	static Node Delete(Node head, int position) {
		  // Complete this method
		    if(position == 0) {
		        head = null;
		        return head;
		    }
		    
		    Node p=head;
		    while(--position>0) {
		        p=p.next;
		    }
		    
		    Node q=p.next;
		    if(q!=null)
		        p.next=q.next;
		    
		    System.out.println("After delete");
		    Print(head);
		    return head;
		}
	
	static void Print(Node head) {
		if (head == null)
			return;

		while (head != null) {
			System.out.println("" + head.data);
			head = head.next;
		}
	}

}

class Node {
	int data;
	Node next;
}