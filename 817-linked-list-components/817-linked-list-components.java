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
        HashSet<Integer>set=new HashSet<Integer>();
        for(int i:nums)
            set.add(i);
        while(head!=null&&set.size()!=0)
        {
            if(set.contains(head.val))
            {
                if(f==0)
                {prev=head;c++;f++;}
                else if(prev.next.val!=head.val)
                    c++;
                    prev=head;
                //set.remove(head.val);
            }
            head=head.next;
        }
        return c;
    }
}