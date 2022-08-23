import java.util.*;
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
    public int numComponents(ListNode head, int[] nums) {
        int c=0,f=0;
        ListNode prev=null;
        ArrayList<Integer>list=new ArrayList<Integer>();
        for(int i:nums)
            list.add(i);
        while(head!=null)
        {
            if(list.contains(head.val))
            {
                if(f==0)
                {prev=head;c++;f++;}
                else if(prev.next.val!=head.val)
                    c++;
                    prev=head;
            }
            head=head.next;
        }
        return c;
    }
}