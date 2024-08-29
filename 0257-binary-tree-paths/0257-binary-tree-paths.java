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
    /*
    - Starting from Root (1):
    - Path: ["1"]
    - Move Left to Node 2
        - Path: ["1", "2"]
        - Move Left to Node 4
            - Path: ["1", "2", "4"]
            - Leaf Node -> Add "1->2->4" to Result
        - Backtrack to Node 2, Move Right to Node 5
            - Path: ["1", "2", "5"]
            - Leaf Node -> Add "1->2->5" to Result
    - Backtrack to Root (1), Move Right to Node 3
        - Path: ["1", "3"]
        - Leaf Node -> Add "1->3" to Result
    */
    public List<String> binaryTreePaths(TreeNode root) {
        TreeNode cur = root;
        List<String> res = new ArrayList<>();
        helperfunc(cur,res,new ArrayList<String>());
        return res;
        
        
    }
    void helperfunc( TreeNode cur, List<String> str,List<String> elist){
       if(cur==null){
           return;
       }
        elist.add(String.valueOf(cur.val));
        if(cur.left==null && cur.right==null){
            String temp = String.join("->",elist);
            str.add(temp);
        }
        else{
            helperfunc(cur.left,str,new ArrayList<>(elist));
            helperfunc(cur.right,str,new ArrayList<>(elist));
        }
        
    }
}