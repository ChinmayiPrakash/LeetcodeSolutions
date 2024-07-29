/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

class Solution {
    public Node connect(Node root) {
        
     /* My Solution
     if(root==null){
            return root;
        }
        
        Deque<Node> queue = new LinkedList();
        queue.addLast(root);
        
        while(!queue.isEmpty()){
            int level = queue.size();
            for(int i = 0;i<level;i++){
                Node curnode = queue.poll();
                if(i==level-1){
                    curnode.next = null;
                }
                else{
                    Node nextnode = queue.removeFirst();
                    curnode.next = nextnode;
                    queue.addFirst(nextnode);
                    
                }
                
                if(curnode.left != null){
                    queue.addLast(curnode.left);
                }
                if(curnode.right != null){
                    queue.addLast(curnode.right);
                }
                
            }
        }
        
        return root;*/
        
        //Optimized solution
        
        if(root==null){
            return root;
        }
        
        Node leftmost = root;
        while(leftmost.left != null){
            Node cur = leftmost;
            while(cur != null){
                // to connect children of a root
                cur.left.next = cur.right;
                if(cur.next !=null){
                    // to connect childrens of different root or to connect a bridge
                    cur.right.next = cur.next.left;
                }
                cur = cur.next;
            }
            leftmost = leftmost.left;
        }
        return root;
        
    }
}