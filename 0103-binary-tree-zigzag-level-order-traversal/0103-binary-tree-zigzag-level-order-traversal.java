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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
         List<List<Integer>> res = new ArrayList<>();
        if(root==null){
            return res;
        }
        Deque<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        int levelcount =0;
        while (!queue.isEmpty()){
            int level = queue.size();
            List<Integer> currentlevel = new ArrayList<>();
            for (int i = 0; i < level; i++) {
                //even case
                if( levelcount%2==0){
                    TreeNode cur = queue.removeFirst();

                    currentlevel.add(cur.val);
                   // System.out.print(cur.data+"->");
                    if(cur.left!=null){
                        queue.offerLast(cur.left);
                    }
                    if(cur.right!=null){
                        queue.offerLast(cur.right);
                    }
                }
                //odd case
                if(levelcount%2!=0){
                   // System.out.println("Oddcase : " + levelcount);
                    //System.out.println("evencase : " + levelcount);
                    TreeNode cur = queue.removeLast();
                    // List<Integer> currentlevel = new ArrayList<>();
                    currentlevel.add(cur.val);
                    //System.out.print(cur.data + "->");
                    if(cur.right!=null){
                        queue.addFirst(cur.right);
                    }
                    if(cur.left!=null){
                        queue.addFirst(cur.left);
                    }
                }
               
                //currentlevel.clear();

            }
             res.add(currentlevel);
            levelcount ++;

        }
        return res;
    }
}