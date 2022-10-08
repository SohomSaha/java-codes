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
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        if(head==null||head.next==null||head.next.next==null)
            return new int[]{-1,-1};
        int f=0,p=0,min=Integer.MAX_VALUE,index=1;
        ListNode curr=head.next,prev=head;
        while(prev.next.next!=null)
        {
            if((prev.next.val>prev.val&&prev.next.val>prev.next.next.val)||(prev.next.val<prev.val&&prev.next.val<prev.next.next.val))
            {
                if(f==0)
                    f=index;
                if(p==0)
                    p=index;
                if(index-p!=0)
                    min=Math.min(min,index-p);
                p=index;
            }
            prev=prev.next;
            index++;
        }
        if(p==f)
            return new int[]{-1,-1};
        return new int[]{min,p-f};
    }
}