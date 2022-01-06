package io.sanket8081.LinkedList;

import io.sanket8081.LinkedList.LinkedL.DoubleLinkedList;
import io.sanket8081.LinkedList.Node.DoubleNode;

public class DoubleLinkedListMain {

	public static void main(String args[])
	{
		DoubleLinkedList list = new DoubleLinkedList();
	    list.createDoubleNode(5);
		
		list.insertInDoubleLinkedList(10, 1);
		list.insertInDoubleLinkedList(20, 2);
		list.insertInDoubleLinkedList(30, 3);
		
		list.traverseLinkedList();
		//System.out.println("Double Linked List In Reverse Order");
		//list.traversInReverseOrder();
		list.searchNode(20);
		System.out.println("List size: "+list.getSize()+"\n");
		list.deleteNodeInDoubleLinkedList(3);
		list.traverseLinkedList();
		list.deleteEntireDoubleLinkedList();
		list.traverseLinkedList();
		//System.out.println("Node value"+node.getValue());
	}
	
	

}
