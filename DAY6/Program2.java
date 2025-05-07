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
    public ListNode removeElements(ListNode head, int X) {
    //   if (head == null)
    //         return head;

    //     // If first node has target value, delete
    //     if (head.val == X) {
    //         head = head.next;
    //         return head;
    //     }
   while(head!=null && head.val==X){
    head=head.next;
   }
        ListNode temp = head;
        ListNode prev = null;

        /* Traverse the list to find 
        the node with the target value */
        while (temp != null) {
            if (temp.val == X) {
                // Adjust the pointers
                prev.next = temp.next;
            temp=temp.next;
            }
            else{
             prev = temp;
            temp = temp.next;
            }
           
        }

        return head;
    }
}
