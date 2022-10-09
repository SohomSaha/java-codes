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
    HashSet<Integer>set=new HashSet<>();
    public boolean findTarget(TreeNode root, int k) {
        return dfs(root,k);
    }
    public boolean dfs(TreeNode root,int target)
    {
        if(root==null)return false;
        if(set.contains(target-root.val))return true;
        set.add(root.val);
        return dfs(root.left,target)||dfs(root.right,target);       
    }
}