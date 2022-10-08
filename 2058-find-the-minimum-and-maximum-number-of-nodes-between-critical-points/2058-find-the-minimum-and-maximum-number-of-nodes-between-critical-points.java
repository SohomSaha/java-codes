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
        int size=0;
        List<Integer>list=new ArrayList<>();
        ListNode curr=head.next,prev=head,next=curr.next;
        while(next!=null)
        {
            if((curr.val>prev.val&&curr.val>next.val)||(curr.val<prev.val&&curr.val<next.val))
                list.add(size);
            prev=curr;
            curr=next;
            next=next.next;
            size++;
        }
        System.out.println(list.size());
        if(list.size()<2)
            return new int[]{-1,-1};
        int min=Integer.MAX_VALUE,max=Integer.MIN_VALUE;
        for(int i=0;i<list.size()-1;i++)
        {
            if(list.get(i+1)-list.get(i)<min)
                min=list.get(i+1)-list.get(i);
        }
        return new int[]{min,list.get(list.size()-1)-list.get(0)};
    }
}