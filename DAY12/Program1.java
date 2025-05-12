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
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        ListNode result = new ListNode(head.val);
        helperFunc(head, result);
        return result;
    }

    private void helperFunc(ListNode head, ListNode result){
        if(head.next == null) return;
        int gcd = findGCD(head.val, head.next.val);
        result.next = new ListNode(gcd, new ListNode(head.next.val));
        helperFunc(head.next, result.next.next);
    }

    private int findGCD(int a, int b){
        int bigNum = Integer.max(a, b);
        int smallNum = Integer.min(a, b);

        int modulo = 10000000;

        if(bigNum%smallNum==0) return smallNum;

        while(modulo > 0){
            modulo = bigNum % smallNum;
            bigNum = smallNum;
            smallNum = modulo;
        }

        return bigNum;
    }
}