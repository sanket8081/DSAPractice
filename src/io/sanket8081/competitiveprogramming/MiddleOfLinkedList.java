//https://leetcode.com/problems/middle-of-the-linked-list/

package io.sanket8081.competitiveprogramming;



 class ListNode {
    int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }
 
class Solution {
    public ListNode middleNode(ListNode head) {
        
        ListNode tempNode= head;
        ListNode finalNode=null;
        int counter1=0,counter2=0,middle=0;
        while(tempNode!=null)
        {
            counter1++;
            tempNode=tempNode.next;
        }
        System.out.println("Counter1 : "+counter1);
        tempNode=head;
        if(counter1%2==0)
            middle=(counter1/2)+1;
        else
            middle=(counter1/2)+1;
        System.out.println("Middle : "+middle);
         while(tempNode!=null)
        {
            if(counter2==middle-1)
            {
                finalNode=tempNode;
                System.out.println("Val:"+finalNode.val);
                break;
            }
             counter2++;
            tempNode=tempNode.next;
        }
        return finalNode;
    }
    
    //Simple Solution
    public ListNode middleNode2(ListNode head)
    {
    	ListNode[] list = new ListNode[100];
    	
    	ListNode tempNode=head;
    	int counter=0;
    	while(tempNode!=null)
    	{
    		list[counter++]=tempNode;
    		tempNode=tempNode.next;
    	}
    	
    	return list[counter/2];
    }
}
