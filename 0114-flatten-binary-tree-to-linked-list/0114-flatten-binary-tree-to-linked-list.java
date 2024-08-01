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
    public void flatten(TreeNode root) {
       /*Approach 1
        1.Traverse entire tree using pre order as suggested in question.
        2.Add data to queue.
        3.Now remove from queue one by one and add to root node.
        Time complexity : O(n) Space complexity : O(n)       
       */ 
        /* Approach 2
        1. check if particular node as left and right subtree
        2. if left ST, connect right subtree to right most empty node in left subtree
        3. connect other left ST to right ST.
        Time complexity : O(n) Space complexity : O(1)
        */
        
        TreeNode cur = root;
        while(cur != null){
            if(cur.left != null){
                TreeNode temp = cur.left;
                while(temp.right != null){
                    temp = temp.right;
                }
                temp.right = cur.right;
                cur.right = cur.left;
                cur.left=null;
            }
            cur = cur.right;
        }
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
}