//https://leetcode.com/problems/linked-list-cycle/
package io.sanket8081.competitiveprogramming;

/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class LinkedListCycle {
    public boolean hasCycle(ListNode head) {
        
        if(head==null)
            return false;
        
        ListNode tempNode1 = head;
        int counter1 =0;
        while(tempNode1.next != null)
        {
            int counter2= 0;
            ListNode tempNode2 = head;
            while(tempNode2.next != null && counter2<=counter1)
            {
                if(tempNode1.next==tempNode2)
                    return true;
                counter2++;
                tempNode2 = tempNode2.next;
            }
            counter1++;
            tempNode1 = tempNode1.next;
            
        }
        return false;
        
    }
}