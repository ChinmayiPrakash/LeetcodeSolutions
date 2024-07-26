class Solution {
    public double findMaxAverage(int[] nums, int k) {
       int l= 0;
       int r = 0;
       int sum = 0;
       Double maxavg = -Double.MAX_VALUE;
       Double avg = 0.00;
       while (r< nums.length){
           sum = sum + nums[r];
           if(r-l+1==k){
               avg = sum/(k*1.00);
               maxavg = Math.max(maxavg,avg);
               sum = sum - nums[l];
               l++;
           }
           r++;

       }
       return maxavg;
    }
}