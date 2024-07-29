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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        if(root==null){
            return res;
        }
        
        Deque<TreeNode> queue = new LinkedList();
        queue.addLast(root);
        
        while(!queue.isEmpty()){
            int level = queue.size();
            for(int i = 0;i<level;i++){
                TreeNode curnode = queue.poll();
                if(i==level-1){
                   // curnode.next = null;
                    res.add(curnode.val);
                }
              //  else{
                //    Node nextnode = queue.removeFirst();
                    //curnode.next = nextnode;
                  //  queue.addFirst(nextnode);
                    
                //}
                
                if(curnode.left != null){
                    queue.addLast(curnode.left);
                }
                if(curnode.right != null){
                    queue.addLast(curnode.right);
                }
                
            }
        }
        
        return res;
    }
}