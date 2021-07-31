//https://leetcode.com/problems/remove-duplicates-from-sorted-list/
package io.sanket8081.competitiveprogramming;

public class RemoveDuplicatesFromSortedList {
	 public ListNode deleteDuplicates(ListNode head) {
	        
	        ListNode curr = head;
	        
	        while(curr!=null)
	        {
	            ListNode temp = curr.next;
	            while(temp!=null && curr.val == temp.val)
	                temp=temp.next;
	            curr.next = temp;
	            curr=temp;
	        }
	        return head;
	    }
}
