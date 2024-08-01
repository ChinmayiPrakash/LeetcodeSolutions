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
    private int diameter = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        diameter = 0;
        calculateheight(root);
        return diameter-1;
    }
public int calculateheight(TreeNode node){
        if(node==null){
            return 0;
        }
        int leftheight = calculateheight(node.left);
        int rightheight = calculateheight(node.right);
        int dia = leftheight + rightheight + 1;
        diameter = Math.max(dia,diameter);
        return (Math.max(leftheight,rightheight) + 1);
    }
}