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
    public List<List<Integer>> levelOrder(TreeNode root) {
       //Intitialize list of list int to store result
        List<List<Integer>> result = new ArrayList<>();

        //check if root is null , if null return empty list
        if(root == null){
           // System.out.println("Tree is Empty");
            return result;
        }

        //Initialize queue to store all upcoming child nodes
        Queue<TreeNode> queue = new LinkedList<>();
        //Add rootnode data to queue;
        queue.offer(root);
        // loop until queue is empty
        while(!queue.isEmpty()){
            // whenever we are removing parent node from queue we are adding child node whose count is equal to level of tree
            // so we are getting level so that we can loop level number of time to fetch chilldren of all the data in a particular level.
            int level = queue.size();

            //create a list to hold data of nodes of current level.
            List<Integer> currentlevel = new ArrayList<>();
            //looping through all the levels to fetch dta
            for (int i = 0; i < level; i++) {
                // popping first node from queue
                TreeNode currentnode = queue.poll();
               // System.out.print(currentnode.val + "->");
                //adding poped node to currentlevel list
                currentlevel.add(currentnode.val);

                if(currentnode.left != null){
                    queue.offer(currentnode.left);
                }
                if(currentnode.right != null){
                    queue.offer(currentnode.right);
                }
            }
            result.add(currentlevel);
        }



        return result;
        
    }
}