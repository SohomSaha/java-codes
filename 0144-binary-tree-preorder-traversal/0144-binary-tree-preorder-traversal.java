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
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer>ans=new ArrayList<>();
        Stack<TreeNode>stack=new Stack<>();
        if(root==null)
            return ans;
        stack.push(root);
        while(!stack.isEmpty())
        {
            TreeNode n=stack.pop();
            ans.add(n.val);
            if(n.right!=null)
                stack.push(n.right);
            if(n.left!=null)
                stack.push(n.left);
        }
        return ans;
}
}