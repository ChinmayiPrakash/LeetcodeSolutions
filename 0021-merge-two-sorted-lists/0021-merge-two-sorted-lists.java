/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
      
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
     ListNode dummy = new ListNode(0); // Create a dummy node to act as the start of the merged list
        ListNode current = dummy;
        
        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                current.next = l1; // Point current node to l1 if its value is smaller
                l1 = l1.next;      // Move l1 to the next node
            } else {
                current.next = l2; // Point current node to l2 if its value is smaller or equal
                l2 = l2.next;      // Move l2 to the next node
            }
            current = current.next; // Move current to the next node
        }
        
        // If either l1 or l2 still has nodes left, point current to the remaining nodes
        if (l1 != null) {
            current.next = l1;
        } else {
            current.next = l2;
        }
        
        return dummy.next; // The merged list starts at dummy.next
    }
    
}