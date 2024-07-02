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
    public ListNode sortList(ListNode head) {
        if(head ==null || head.next==null){
            return head;
        }
        ListNode mid = GetMidNode(head);
        ListNode left = sortList(head);
        ListNode right = sortList(mid);
        
        return Merge(left,right);
        
    }
    public ListNode GetMidNode(ListNode head ){
        //missed part : here we need to break the link before mid element.
       ListNode fast = head;
        ListNode slow = head;
        ListNode prev = null;

        while (fast != null && fast.next != null) {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        
        if (prev != null) {
            prev.next = null;
        }
        
        return slow;
    }
    public ListNode Merge(ListNode list1,ListNode list2){
        ListNode dummy = new ListNode();
        ListNode tail = dummy;
        while(list1 !=null && list2!= null){
            if(list1.val>list2.val){
                tail.next = list2;
                list2= list2.next;
                tail=tail.next;
            }
            else{
                tail.next=list1;
                list1 = list1.next;
                tail=tail.next;
            }
        }
        if(list1!=null){
            tail.next = list1;
        }
        else{
            tail.next = list2;
        }
        return dummy.next;
    }
}