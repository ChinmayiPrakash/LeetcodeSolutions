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
    public boolean isSymmetric(TreeNode root) {
         if(root == null){
            System.out.println("Tree is Empty");
            //return result;
        }

        //Initialize queue to store all upcoming child nodes
        Queue<TreeNode> queue = new LinkedList<>();
        Deque<Integer> deque = new LinkedList<>();
        //Add rootnode data to queue;
        queue.offer(root);
        // loop until queue is empty
        while(!queue.isEmpty()){
            // whenever we are removing parent node from queue we are adding child node whose count is equal to level of tree
            // so we are getting level so that we can loop level number of time to fetch chilldren of all the data in a particular level.
            int level = queue.size();

            //create a list to hold data of nodes of current level.

            //looping through all the levels to fetch dta
            for (int i = 0; i < level; i++) {
                // popping first node from queue
                TreeNode currentnode = queue.poll();
                 if(currentnode.left != null){
                    queue.offer(currentnode.left);
                    deque.addLast(currentnode.left.val);
                }
                if(currentnode.left == null){
                    deque.addLast(null);
                }

                if(currentnode.right != null){
                    queue.offer(currentnode.right);
                    deque.addLast(currentnode.right.val);
                }
                if(currentnode.right == null){
                    deque.addLast(null);
                }
            }

            while (!deque.isEmpty()){
                if(deque.pollLast()!=deque.pollFirst()){
                    return false;
                }
            }
           // result.add(currentlevel);
        }
        return true;

    }
}