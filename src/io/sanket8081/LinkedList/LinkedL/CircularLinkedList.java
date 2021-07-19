package io.sanket8081.LinkedList.LinkedL;

import io.sanket8081.LinkedList.Node.CircularNode;

public class CircularLinkedList {
	
		CircularNode head;
		CircularNode tail;
		int size ;

		public CircularNode getHead() {
			return head;
		}

		public void setHead(CircularNode head) {
			this.head = head;
		}

		public CircularNode getTail() {
			return tail;
		}

		public void setTail(CircularNode tail) {
			this.tail = tail;
		}

		public int getSize() {
			return size;
		}

		public void setSize(int size) {
			this.size = size;
		}
		
		public CircularNode createCircularNode(int nodeValue)
		{
			CircularNode node = new CircularNode();
			node.setValue(nodeValue);
			node.setNext(node);
			head = node;
			tail =node;
			size =1;
			return node;
		}
		
		public boolean existLinkedList()
		{
			return head!=null;
		}
		
		
		public void insertCircularNode(int location, int nodeValue)
		{
			CircularNode node  = new CircularNode();
			node.setValue(nodeValue);
			if(!existLinkedList())
				return;
			
			else {
				
				if(location == 0)
				{
					node.setNext(head);
					head = node;
					tail.setNext(head);
				}
				else if(location ==  size)
				{
					node.setNext(head);
					tail.setNext(node);
					tail = node;
				}
				else
				{
					CircularNode temp = head;
					int counter = 0;
					while(counter<location-1)
					{
						temp = temp.getNext();
						counter++;
					}
					node.setNext(temp.getNext());
					temp.setNext(node);
				}
				setSize(getSize()+1);	
			}			
		}
		
		
		public void searchNode(int valueToBeSearched)
		{
			int counter=0;
			CircularNode temp = head;
			while(counter<size)
			{
				if(temp.getValue() == valueToBeSearched)
				{
					System.out.println("Value found @ location "+(counter+1));
					return;
				}
				temp =  temp.getNext();
				counter++;
			}
			System.out.println("Value not found.");
			return;//Value not found
		}
		
		public void traverseCircularLinkedList()
		{
			if(!existLinkedList())
				return;
			
			CircularNode temp = head;
			int counter = 0;
			while(counter<size)
			{
				System.out.println(temp.getValue());
				temp = temp.getNext();
				counter++;
				
			}
		}
		
		public void deleteNode(int location)
		{
			if(!existLinkedList())
				return;
			else
			{
				if(location ==  0)
				{
					if(getSize()==1)
					{
						head=tail=null;
						return;
					}
					
					head =  head.getNext();
					tail.setNext(head);
					
				}
				else if(location==size)
				{
					if(getSize()==1)
					{
						head=tail=null;
						return;
					}
					
					CircularNode tempNode  = head;
					int counter=0;
					while(counter<size)
					{
						tempNode = tempNode.getNext();
						counter++;
					}
					
					tempNode.setNext(head);
					tail = tempNode;
					
				}
				else {
					CircularNode tempNode  = head;
					int counter=0;
					while(counter<location-1)
					{
						tempNode = tempNode.getNext();
						counter++;
					}
					
					tempNode.setNext(tempNode.getNext().getNext());
				}
			}
			setSize(getSize()-1);
				
		}
		
		public void deleteEntireList()
		{
			tail.setNext(null);
			head=tail=null;
		}
		
		
		
		

}
