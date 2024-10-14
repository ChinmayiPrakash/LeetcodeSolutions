class Solution {
    /*
    TC = O(N) = 100.00%
    SC = O(N) = 63.11%

    public int rob(int[] nums) {
        if(nums.length == 1){
            return nums[0];
        }
        if(nums.length == 2){
            return Math.max(nums[0],nums[1]);
        }

        int[] dp = new int[nums.length];
        dp[0]=nums[0];
        dp[1] = Math.max(nums[0],nums[1]);
        

        for(int i = 2; i<dp.length;i++){
            dp[i]= Math.max((nums[i]+dp[i-2]),(dp[i-1]));
        }
       return dp[nums.length - 1];
    }*/
    // we can reduce space complexity to O(1) by reassigning dp values to same array.

    public int rob(int[] nums){
        if(nums.length == 1){
            return nums[0];
        }
        if(nums.length == 2){
            return Math.max(nums[0],nums[1]);
        }
        nums[1] = Math.max(nums[0],nums[1]);
        for(int i = 2 ; i<nums.length ; i++){
            nums[i] = Math.max((nums[i]+nums[i-2]),(nums[i-1]));
        }
        return nums[nums.length - 1];

    }

    
}