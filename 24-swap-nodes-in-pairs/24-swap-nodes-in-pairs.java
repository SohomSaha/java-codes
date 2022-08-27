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
    public ListNode swapPairs(ListNode head) {
        if(head==null||head.next==null)
            return head;
        ListNode start=head,nhead=head.next;
        while(start!=null&&start.next!=null)
        {
           ListNode tmp=start;
            start=start.next;
            tmp.next=start.next;
            start.next=tmp;
            start=tmp.next;
            if(start!=null&&start.next!=null)
                tmp.next=start.next;
        }
        return nhead;
    }
}