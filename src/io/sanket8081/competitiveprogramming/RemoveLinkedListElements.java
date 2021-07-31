//https://leetcode.com/problems/remove-linked-list-elements/
package io.sanket8081.competitiveprogramming;

public class RemoveLinkedListElements {
	public ListNode removeElements(ListNode head, int val) {
        ListNode curr = head;
        ListNode prev = null;
        
        while(curr!=null)
        {
            if(head == curr && head.val == val)
            {
                head = curr.next;
            }
            else if(curr.val == val)
            {
                prev.next = curr.next;
            }
            else{
                prev =curr;
            }
            curr = curr.next;
        }
        return head;
        
    }
}
