package io.sanket8081.LinkedList.LinkedL;

import java.awt.HeadlessException;

import io.sanket8081.LinkedList.Node.DoubleNode;

public class DoubleLinkedList {
	
	DoubleNode head;
	DoubleNode tail;
	int size;
	static int i=0;
	
	public DoubleNode getHead() {
		return head;
	}

	public void setHead(DoubleNode head) {
		this.head = head;
	}

	public DoubleNode getTail() {
		return tail;
	}

	public void setTail(DoubleNode tail) {
		this.tail = tail;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public DoubleNode createDoubleNode(int nodeValue)
	{
		head = new DoubleNode();
		DoubleNode node = new DoubleNode();
		node.setValue(nodeValue);
		node.setNext(null);
		node.setPrev(null);
		head = node;
		tail = node;
		size=0;
		return head;
	}

	public boolean existLinkedList(DoubleNode node)
	{
		if(node!=null)
			return true;
		else
			return false;
	}
	
	public void insertInDoubleLinkedList(int nodeValue, int location)
	{
		DoubleNode node = new DoubleNode();
		node.setValue(nodeValue);
		
		if(!existLinkedList(head))
			return;
		else if(location == 0)
		{
			
			  node.setNext(head);
			  node.setPrev(null);
			  head.setPrev(node);
			  head = node;
			 
			
			
		}
		else if(location >= getSize())
		{
			node.setNext(null);
			node.setPrev(tail);
			tail.setNext(node);
			tail = node;
		}
		else
		{
			DoubleNode tempNode = head;
			int index = 0;
			while(index<location-1)
			{
				tempNode = tempNode.getNext();
				index++;
			}
			node.setNext(tempNode.getNext());
			node.setPrev(tempNode);
			tempNode.setNext(node);
			node.getNext().setPrev(node);
			
		}
		//size++;
		setSize(getSize()+1);
	}
	
	public void traverseLinkedList() {
		if(existLinkedList(head)) {
			//System.out.println("Linked List now: ");
			DoubleNode tempNode=head;
			for(int i =0; i<=size;i++) {
				
				System.out.print(tempNode.getValue());
				if(i!=size) {
					System.out.print(" -> ");
				}
				tempNode=tempNode.getNext();
			}
		}else {
			System.out.println("Linked List does not exists");
		}
		System.out.println("\n");
	}
	
	public void traversInReverseOrder()
	{
		if(!existLinkedList(head))
			return;
		else
		{
			DoubleNode tempNode = tail;
			
			while(tempNode!=null)
			{
				System.out.println(tempNode.getValue()+"\n");
				tempNode = tempNode.getPrev();
			}
		}
	}
	
	public void searchNode(int nodeValue)
	{
		if(!existLinkedList(head))
			return;
		else
		{
			DoubleNode tempNode = head;
			
			while(tempNode!=null)
			{
				if(tempNode.getValue()==nodeValue)
				{
					System.out.println("Value found: "+nodeValue+"\n");
					return;
				}
				tempNode =  tempNode.getNext();
			}
			System.out.println(nodeValue+" was not found in the list.\n");
		}
		
	}
	
	public void deleteNodeInDoubleLinkedList(int location)
	{
		if(!existLinkedList(head))
			return;
		else if(location == 0) {
			
			if(getSize()==1)
			{
				head=tail=null;
				return;
			}
			head = head.getNext();
			head.setPrev(null);
		}
		else if(location>=getSize())
		{
			
			if(tail.getPrev()==head)
			{
				head=tail=null;
				return;
			}
			tail = tail.getPrev();
			tail.setNext(null);
		}
		else
		{
			DoubleNode tempNode = head;
			int index = 0;
			while(index < location-1)
			{
				tempNode = tempNode.getNext();
				index++;
			}
			
			System.out.println("TempNode value: "+tempNode.getValue()+"\n");
			
			tempNode.setNext(tempNode.getNext().getNext());
			tempNode.getNext().setPrev(tempNode);
		}
		//size--;
		setSize(getSize()-1);
		
	}
	
	public void deleteEntireDoubleLinkedList()
	{
		DoubleNode tempNode =  head;
		
		while(tempNode!=null)
		{
			tempNode.setPrev(null);
			tempNode =  tempNode.getNext();
		}
		head=tail=null;
		System.out.println("Linked List deleted successfully!\n");
	}
	

}
