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
    public int getDecimalValue(ListNode head) {
      /*  ListNode cur = head;
        Long num ;
        String str = "";
        int ans = 0;
        while(cur!=null){
            str = str + cur.val;
            cur = cur.next;
        }
        System.out.println(str);
        int len = str.length();
        int ilen = len-1;
         int i = 0;
        while(ilen>=0){
            String rem = String.valueOf(str.charAt(ilen));
            //num = num/10;
            ans = ans +(int)(Math.pow(2,i)*Integer.parseInt(rem));
            ilen--;
            i++;
            
        }
      
      
        return ans;*/
        //found answer
        int sum = 0;
        
        while (head != null){
            sum = sum * 2;
            sum = sum + head.val;
            head = head.next;
        }
        return sum;
    }
}