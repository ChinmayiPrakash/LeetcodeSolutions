class Solution {
    public int rob(int[] nums) {
        // Check solution details in notes 

       if(nums.length == 1){
            return nums[0];
        }
        if(nums.length == 2){
            return Math.max(nums[0],nums[1]);
        }
        int[] skipfirst = new int[nums.length-1];
        int[] skiplast = new int[nums.length-1];

        for(int i = 0;i<=nums.length-2;i++){
            skipfirst[i]=nums[i+1];
            skiplast[i] = nums[i];
        }
        return Math.max(solve(skipfirst),solve(skiplast));
        /* My solution worked for few cases and not for all 
        if(nums.length == 1){
            return nums[0];
        }
        if(nums.length == 2){
            return Math.max(nums[0],nums[1]);
        }
        nums[1] = Math.max(nums[0],nums[1]);
        for(int i = 2 ; i<nums.length ; i++){

            if(i!= nums.length-1){
                nums[i] = Math.max((nums[i]+nums[i-2]),(nums[i-1]));
            }else{
                nums[i] = Math.max((nums[i]+(nums[i-2]-nums[0])),(nums[i-1]));
            }
            
        }
        return nums[nums.length - 1];*/

    }
    int solve (int[] nums){
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