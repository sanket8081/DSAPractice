package io.sanket8081.LinkedList.LinkedL;

import io.sanket8081.LinkedList.Node.SingleNode;

public class SingleLinkedList {
	
	SingleNode head;
	SingleNode tail;
	int size;
	static int i=0;
	
	
	public SingleNode createSingleLinkedList(int nodeValue)
	{
		head = new SingleNode();
		SingleNode node = new SingleNode();
		node.setValue(nodeValue);
		node.setNext(null);
		head=node;
		tail=node;
		size=1;
		return head;
	}

	public SingleNode getHead() {
		return head;
	}

	public void setHead(SingleNode head) {
		this.head = head;
	}

	public SingleNode getTail() {
		return tail;
	}

	public void setTail(SingleNode tail) {
		this.tail = tail;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public boolean existLinkedList()
	{
		if(head!=null)
			return true;
		else
			return false;
	}
	
	
	public void insertNode(int nodeValue,int location)
	{
		
		if(!existLinkedList())
			return;
		else if(location == 0)
		{
			SingleNode node = new SingleNode();
			node.setValue(nodeValue);
			node.setNext(head);
			head=node;
		}
		else if(location == size)
		{
			SingleNode node = new SingleNode();
			node.setValue(nodeValue);
			node.setNext(null);
			tail.setNext(node);
			tail=node;
		}
		else {
			SingleNode tempNode =  head;
			int index =0;
			while (index < location - 1) {
				tempNode = tempNode.getNext();
				index++;
			}
			SingleNode node =  new SingleNode();
			node.setValue(nodeValue);
			node.setNext(tempNode.getNext());
			tempNode.setNext(node);
			
		}
		setSize(getSize()+1);
	}
	
	public void traverseLinkedList()
	{
		SingleNode tempNode = head;
		if(tempNode.getNext()==null)
		{
			int value=tempNode.getValue();
			System.out.println(value);
			return;
		}
		else {
		
			while(tempNode!=null)
			{
				int value=tempNode.getValue();
				System.out.println(value);
				tempNode=tempNode.getNext();
			}
		}
	}
	
	public SingleNode reverseLinkedList(SingleNode head)
	{
		
		SingleNode current=head;
		SingleNode prev = null;
		SingleNode nextptr = null;
	        
	        while(current!=null)
	        {
	        	nextptr= current.getNext();;
	            current.setNext(prev);
	            prev=current;
	            current=nextptr;
	        }
	        head=prev;
	        return head;
	}
	
	public boolean findNode(int nodeValue)
	{
		if(existLinkedList())
		{
			SingleNode tempNode = head;
			for(int i=0;i<getSize();i++)
			{
				if(tempNode.getValue()==nodeValue)
				{
					System.out.println("Node Found!!\n");
					return true;
				}
				tempNode=tempNode.getNext();
			}
		}
		System.out.println("Value not Found!!");
		return false;
	}
	
	public void deleteLinkedList()
	{
		if(existLinkedList())
		{
			System.out.println("\n\nDeleting Linked List...");
			head = null;
			tail = null;
			System.out.println("Linked List deleted successfully !");
		}
		
	}
	
	public void deletionOfNode(int location)
	{
		if (!existLinkedList()) {
			System.out.println("The linked list does not exist!!");// Linked List does not exists
			return;
		}
		else if(location == 0)
		{
			head=head.getNext();
			setSize(getSize()-1);
		}
		else if(location >= getSize())
		{
			SingleNode tempNode = head;
			
			for(int i=0;i<size-1;i++)
			{
				tempNode=tempNode.getNext();
			}
			
			if(tempNode==head)
			{
				head=tail=null;
				setSize(getSize()-1);
				return;
			}
			
			tempNode.setNext(null);
			tail=tempNode;
			setSize(getSize()-1);
			
		}
		else
		{
			SingleNode tempNode = head;
			
			for(int i=0;i<location-1;i++)
			{
				tempNode=tempNode.getNext();
			}
			
			SingleNode nextNode = tempNode.getNext();
			tempNode.setNext(nextNode.getNext());
			setSize(getSize()-1);

		}
	}
	
	
}
