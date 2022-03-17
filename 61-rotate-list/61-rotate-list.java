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
    public ListNode rotateRight(ListNode head, int k) {
        ListNode cur=head;
        ListNode res=head;
        //edge cases
        if(head==null||head.next==null)
            return head;
        //compute length
        int length=1;
        while(cur.next!=null)
        {
            length++;
            cur=cur.next;
        }
        k=k%length;
        cur.next=head;
        for(int i=1;i<length-k;i++)
        res=res.next;
        head=res.next;
        res.next=null;
        return head;
    }
}