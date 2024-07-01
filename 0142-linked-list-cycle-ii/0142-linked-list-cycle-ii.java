/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        int l =0;
        if(IscycleorNot(head)){
            l = getCycleLength(head);
            
            if(l>0){
                ListNode f = head;
                ListNode s = head;
                while(l>0){
                    s= s.next;
                    l--;
                }
                while(s!=f){
                    f = f.next;
                    s = s.next;
                    
                }
               
                    return s;
                
            }
        }
        return null;
    }
    
    public boolean IscycleorNot(ListNode head){
        ListNode fast = head;
        ListNode slow = head;
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if(fast==slow){
                return true;
            }
        }
        return false;
    }
    public int getCycleLength(ListNode head){
        
        ListNode fast = head;
        ListNode slow = head;
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow){
                int length = 0;
                ListNode temp = slow;
                do{
                    temp = temp.next;
                    length = length + 1;
                }while(temp != slow);
                return length;
            }
        }
        return 0;
    }
}