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
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> avg = new ArrayList<>();
        Double avgval = 0.0;
        if(root==null){
            return avg;
        }
        
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        
        while(!queue.isEmpty()){
            int level = queue.size();
            Double sum = 0.00;
            for(int i=0;i<level;i++){
                TreeNode cur = queue.poll();
                sum = sum + cur.val;
                if(cur.right !=null){
                    queue.offer(cur.right);
                }
                if(cur.left !=null){
                    queue.offer(cur.left);
                }
                
            }
           avgval = sum / level;
            avg.add(avgval);
        }
        
        return avg;
    }
}