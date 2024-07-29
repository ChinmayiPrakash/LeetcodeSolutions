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
    public boolean isCousins(TreeNode root, int x, int y) {
       
if (root == null) {
            return false;
        }

        // Initialize queue to store all upcoming child nodes
        Queue<TreeNode> queue = new LinkedList<>();
        // Add root node to the queue
        queue.offer(root);

        while (!queue.isEmpty()) {
            int levelSize = queue.size();
            boolean xFound = false, yFound = false;
            Integer xParent = null, yParent = null;

            for (int i = 0; i < levelSize; i++) {
                TreeNode currentNode = queue.poll();

                // Check left child
                if (currentNode.left != null) {
                    if (currentNode.left.val == x) {
                        xFound = true;
                        xParent = currentNode.val;
                    } else if (currentNode.left.val == y) {
                        yFound = true;
                        yParent = currentNode.val;
                    }
                    queue.offer(currentNode.left);
                }

                // Check right child
                if (currentNode.right != null) {
                    if (currentNode.right.val == x) {
                        xFound = true;
                        xParent = currentNode.val;
                    } else if (currentNode.right.val == y) {
                        yFound = true;
                        yParent = currentNode.val;
                    }
                    queue.offer(currentNode.right);
                }

                // If both x and y are found at the same level, check their parents
                if (xFound && yFound) {
                    return xParent != yParent;
                }
            }

            // If only one is found at this level, they cannot be cousins
            if (xFound || yFound) {
                return false;
            }
        }

        return false; 
    }
}