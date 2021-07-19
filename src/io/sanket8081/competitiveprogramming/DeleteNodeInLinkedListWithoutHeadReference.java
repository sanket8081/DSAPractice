//https://leetcode.com/problems/delete-node-in-a-linked-list/submissions/

package io.sanket8081.competitiveprogramming;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */

//uses swap functionality
//Keep shifting next node with current node and later delete the last node
//Inshort move each node one place backward
public class DeleteNodeInLinkedListWithoutHeadReference {
    public void deleteNode(ListNode node) {
        ListNode n = node;
        while(node.next!=null)
        {
            node.val=node.next.val;
            n=node;
            node=node.next;
        }
        n.next=null;
    }
}
