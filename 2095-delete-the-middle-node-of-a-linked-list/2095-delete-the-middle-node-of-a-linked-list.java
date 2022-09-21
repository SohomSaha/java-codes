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
    public ListNode deleteMiddle(ListNode head) {
        if(head.next==null)
            return null; 
    ListNode prev=new ListNode(0);
    prev.next=head;
    ListNode fast=head;
    while(fast!=null&&fast.next!=null)
    {
        prev=prev.next;
        fast=fast.next.next;
    }
    prev.next=prev.next.next;
    return head;
}
}