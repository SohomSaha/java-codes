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
        int f=0,p=0,min=Integer.MAX_VALUE,index=1,c=0;
        ListNode curr=head.next,prev=head,next=curr.next;
        while(next!=null)
        {
            if((curr.val>prev.val&&curr.val>next.val)||(curr.val<prev.val&&curr.val<next.val))
            {
                if(f==0)
                    f=index;
                if(p==0)
                    p=index;
                if(index-p!=0)
                    min=Math.min(min,index-p);
                p=index;
                c++;
            }
            prev=curr;
            curr=next;
            next=next.next;
            index++;
        }
        if(c<2)
            return new int[]{-1,-1};
        return new int[]{min,p-f};
    }
}