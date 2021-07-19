//https://leetcode.com/problems/convert-binary-number-in-a-linked-list-to-integer/solution/
package io.sanket8081.competitiveprogramming;

   /* class ListNode {
	      int val;
	     ListNode next;
	     ListNode() {}
	     ListNode(int val) { this.val = val; }
	     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
	  }
	  
	 */
	 
	public class ConvertBinaryToDecimalUsingLinkedList {
	    public int getDecimalValue(ListNode head) {
	        ListNode tempNode=head;
	        String binary="";
	        while(tempNode!=null)
	        {
	            binary+=tempNode.val;
	            tempNode=tempNode.next;
	        }
	        int decimal=Integer.parseInt(binary,2);
	        return decimal;
	    }
	}