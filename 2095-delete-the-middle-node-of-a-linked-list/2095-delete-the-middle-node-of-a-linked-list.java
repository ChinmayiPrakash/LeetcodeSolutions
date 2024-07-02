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
    public ListNode deleteMiddle(ListNode head) {
        ListNode f = head;
        ListNode s = head;
        ListNode prev = head;
        if(head.next==null){
            head=null;
        }
        
        while(f!=null && f.next!=null){
            prev=s;
            s=s.next;
            f=f.next.next;
        }
        prev.next=s.next;
        s= prev.next;
        return head;
    }
}