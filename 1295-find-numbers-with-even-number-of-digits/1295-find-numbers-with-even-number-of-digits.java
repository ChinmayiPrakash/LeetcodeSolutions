class Solution {
    public int findNumbers(int[] nums) {
        int numcount =0;
        for(int i = 0; i<nums.length; i++){
            int digitcount =0;
            //int numcount=0;
            while(nums[i]>0){
                nums[i] = nums[i]/10;
                digitcount++;
            }
            if(digitcount%2 == 0){
                numcount++;
            }
        }
        return numcount;
    }
    
}