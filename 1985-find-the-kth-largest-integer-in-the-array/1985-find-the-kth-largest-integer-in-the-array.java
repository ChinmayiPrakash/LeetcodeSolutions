import java.util.*;
import java.math.*;
class Solution {
    public String kthLargestNumber(String[] nums, int k) {
        PriorityQueue<BigInteger> minheap = new PriorityQueue<>(k);
        for (int i = 0; i < nums.length; i++) {
            BigInteger number = new BigInteger(nums[i]);
            minheap.offer(number);
            if(minheap.size()>k){
                minheap.poll();
            }
        }
        return minheap.peek().toString();
    }
}