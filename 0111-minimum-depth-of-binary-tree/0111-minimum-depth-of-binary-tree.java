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
    public int minDepth(TreeNode node) {
         if(node==null){
            return 0;
        }
        int leftheight = minDepth(node.left);
        int rightheight = minDepth(node.right);
        //int dia = leftheight + rightheight + 1;
        //diameter = Math.max(dia,diameter);
        if(Math.min(leftheight,rightheight) == 0){
            return (Math.max(leftheight,rightheight) + 1);
        }
        return (Math.min(leftheight,rightheight) + 1);
    }
}