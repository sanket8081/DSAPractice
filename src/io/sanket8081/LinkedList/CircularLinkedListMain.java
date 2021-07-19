package io.sanket8081.LinkedList;

import io.sanket8081.LinkedList.LinkedL.CircularLinkedList;

public class CircularLinkedListMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CircularLinkedList c1 = new CircularLinkedList();
		
		c1.createCircularNode(10);
		c1.insertCircularNode(1, 20);
		c1.insertCircularNode(2, 30);
		c1.insertCircularNode(3, 40);
		
		//Inserting at particular location
		c1.insertCircularNode(3, 35);

		//Inserting at start of linked list
		c1.insertCircularNode(0, 5);
		
		//Searching Node
		c1.searchNode(35);
		System.out.println("Traversing a circular linked list before deletion");
		//Traversing a circular linked list before deletion
		c1.traverseCircularLinkedList();

		
		c1.deleteNode(4);
		
		System.out.println("Traversing a circular linked list after deletion");
		//Traversing a circular linked list after deletion
		c1.traverseCircularLinkedList();

		c1.deleteEntireList();
		
		c1.traverseCircularLinkedList();
		
	}

}
