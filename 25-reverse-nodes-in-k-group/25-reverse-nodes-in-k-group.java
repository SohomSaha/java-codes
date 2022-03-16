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
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode dummy=new ListNode(0);
        dummy.next=head;
        ListNode cur=dummy,nex=dummy,pre=dummy;
        int count=0;
        while(cur.next!=null)//length of linkedlist
        {
            count++;cur=cur.next;
        }
        while(count>=k)//count to take out the k groups to reverse nodes
        {
            cur=pre.next;
            nex=cur.next;
            for(int i=1;i<k;i++)//reversing (k-1)times
            {
                cur.next=nex.next;
                nex.next=pre.next;
                pre.next=nex;
                nex=cur.next;
            }
            pre=cur;
            count-=k;
        }
        return dummy.next;
    }
}
