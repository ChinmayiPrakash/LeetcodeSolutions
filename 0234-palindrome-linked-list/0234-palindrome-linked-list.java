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
    static ListNode  mid = null;
    public boolean isPalindrome(ListNode head) {
        getMiddle(head);
        ListNode second = mid.next;
        mid.next = null;
        second = getReverse(second);
        //printList(second);
        //printList(head);
        ListNode curfirst = head;
        ListNode cursec = second;
        Boolean status = true;
        while (curfirst!=null && cursec !=null){
            if(curfirst.val!= cursec.val){
                status = false;
            }
            curfirst = curfirst.next;
            cursec = cursec.next;
        }
        return status;
    }
    
    public static ListNode getReverse(ListNode node){
        ListNode prev = null;
        ListNode next = null;
        ListNode cur = node;
        while (cur!=null){
            next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
        }
        return prev;
    }
    public static void getMiddle(ListNode head){
        ListNode slow = head;
        ListNode fast = head;
        while (fast.next != null && fast.next.next != null ){
            slow = slow.next;
            fast = fast.next.next;
            
        }
        mid = slow;
      //  System.out.println(mid.val);
    }
   /*  ListNode curr;
     public boolean isPalindrome(ListNode head) {
        curr = head;
        return solve(head);
    }

    public boolean solve(ListNode head) {
        if(head == null) return true;
        boolean ans = solve(head.next) && head.val == curr.val;
        curr = curr.next;
        return ans;
    }*/
}