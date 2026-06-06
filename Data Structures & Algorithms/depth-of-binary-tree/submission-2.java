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

    class Pair{
        TreeNode node;
        int depth;

        Pair(TreeNode node,int depth){
            this.node = node;
            this.depth = depth;
        }
    }
    public int maxDepth(TreeNode root) {
        
        if(root == null){
            return 0;
        }

        Stack<Pair> stack = new Stack<>();
        stack.push(new Pair(root,1));
        int maxDepth =0;
        while(!stack.isEmpty()){
            
            Pair curr = stack.pop();

            maxDepth = Math.max(maxDepth, curr.depth);
             
            if(curr.node.left != null){
               stack.push(new Pair(curr.node.left, curr.depth + 1));
            }
            if(curr.node.right != null){
                stack.push(new Pair(curr.node.right, curr.depth+1));
            }
        }
        return maxDepth;
    }
}
