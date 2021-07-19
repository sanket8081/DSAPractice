package io.sanket8081.LinkedList;

import io.sanket8081.LinkedList.LinkedL.SingleLinkedList;
import io.sanket8081.LinkedList.Node.SingleNode;

public class SingleLinkedListMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SingleLinkedList list = new SingleLinkedList();
		
		list.createSingleLinkedList(5);
		//list.traverseLinkedList();
		
		list.insertNode(10, 1);
		//list.traverseLinkedList();
		
		list.insertNode(20, 2);
		//list.traverseLinkedList();
		
		list.insertNode(30, 3);
		//list.traverseLinkedList();
		
		//list.insertNode(40, 0);
		//list.traverseLinkedList();
	
		//list.traverseLinkedList();
		
		//list.deletionOfNode(2);
		//list.traverseLinkedList();
		
		SingleNode rev= list.reverseLinkedList(list.getHead());
		
		System.out.println(rev.getValue());

	}

}
