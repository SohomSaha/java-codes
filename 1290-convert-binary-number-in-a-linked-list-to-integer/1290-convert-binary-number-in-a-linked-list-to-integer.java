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
    public int getDecimalValue(ListNode head) {
        String s="";
        while(head!=null)
        {
            s=s+Integer.toString(head.val);
            head=head.next;
        }
        int n=Integer.parseInt(s,2);
        return n;
    }
}