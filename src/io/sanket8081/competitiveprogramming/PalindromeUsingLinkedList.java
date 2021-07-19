//https://leetcode.com/problems/palindrome-linked-list/

package io.sanket8081.competitiveprogramming;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
import java.util.*;

class PalindromeUsingLinkedList {
    public boolean isPalindrome(ListNode head) {
        
        Stack<ListNode> st = new Stack<ListNode>();
        ListNode tempNode = head;
        while(tempNode!=null)
        {
            st.push(tempNode);
            tempNode =tempNode.next;
        }
        
        ListNode tempNode2 = head;
        while(tempNode2!=null)
        {
            ListNode node = st.pop();
            if(node.val!=tempNode2.val)
            {
                return false;
            }
            tempNode2 =tempNode2.next;
        }
        return true;
    }
}