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
    public List<Integer> postorderTraversal(TreeNode root) {
        Stack<TreeNode>stack=new Stack<>();
        List<Integer>pos=new ArrayList<>();
        TreeNode curr=root;
        while(curr!=null||!stack.empty())
        {
            if(curr!=null)
            {
                stack.push(curr);
                curr=curr.left;
            }
            else
            {
                TreeNode temp=stack.peek().right;
                if(temp==null)
                {
                    temp=stack.pop();
                    pos.add(temp.val);
                    while(!stack.empty()&&temp==stack.peek().right)
                    {
                        temp=stack.pop();
                        pos.add(temp.val);
                    }
                }
                else
                    curr=temp;
            }
        }
        return pos;
    }
}