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
  ListNode head;
    public ListNode addTwoNumbers(ListNode L1, ListNode L2) {
       
        int carry = 0;
        int val1=0;
        int val2=0;
        
     while((L1 != null) ||(L2 != null) || carry != 0){
         //int prevcarry = 0;
         if(L1!=null){
             val1 = L1.val;
         }
         else{
             val1 = 0;
         }
         if(L2!=null){
             val2 = L2.val;
         }
         else{
             val2 = 0;
         }
         int ans = val1+val2+carry;
         carry = ans/10;
          ans = ans%10;
         
        
         //L3 = new ListNode();
         AddNode(ans);
       if(L1!=null){
            L1=L1.next;
       }
         if(L2!=null){
            L2=L2.next;
       }
        
         
     }
        return head;
    }
    
    void AddNode(int ans){
     ListNode newNode = new ListNode(ans); // Create a new node

        // If the list is empty, make the new node the head
        if (head == null) {
            head = newNode;
        } else {
            ListNode current = head;
            // Traverse to the end of the list
            while (current.next != null) {
                current = current.next;
            }
            // Add the new node at the end of the list
            current.next = newNode;
        }
    }
    
    
    
}