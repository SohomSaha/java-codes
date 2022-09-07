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
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null)
            return head;
        ListNode dummy=new ListNode(0);
        dummy.next=head;
        ListNode prev=dummy;
        ListNode ptr=prev.next;
        while(ptr!=null)
        {
           while(ptr.next!=null&&ptr.val==ptr.next.val)
               ptr=ptr.next;
            if(prev.next==ptr)
                prev=prev.next;
            else
                prev.next=ptr.next;
            ptr=ptr.next;
        }
        return dummy.next;
    }
}