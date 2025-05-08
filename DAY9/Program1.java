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
class Solution {
    public ListNode swapNodes(ListNode head, int k) {
        if(head==null || head.next==null){
            return head;
        }
        ListNode slow=head,fast=head,node1=head,node2=head;
        
        for(int i=0;i<k-1;i++){
            fast=fast.next;
        }
        node1=fast;
        ListNode temp=node1;
        
        while(temp.next!=null){
           temp=temp.next;
           
            slow=slow.next;
           
        }
        node2=slow;
        if(node1 !=node2){
             int te=node1.val;
            node1.val=node2.val;
            node2.val=te;
        }
        return head;
    }
}