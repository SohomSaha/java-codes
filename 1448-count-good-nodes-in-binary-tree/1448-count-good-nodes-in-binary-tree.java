/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    int good;
    public int goodNodes(TreeNode root) {
        good=0;
        path(root,Integer.MIN_VALUE);
       return good;
    }
    public void path(TreeNode root,int max)
    {
        if(root==null)
            return ;
        if(root.val>=max)
            good++;
        max=Math.max(root.val,max);
        path(root.left,max);
        path(root.right,max);
    }
}