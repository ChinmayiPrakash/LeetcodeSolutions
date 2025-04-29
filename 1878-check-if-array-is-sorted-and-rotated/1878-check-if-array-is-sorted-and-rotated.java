class Solution {
    public boolean check(int[] nums) {

        int lessercount = 0;

        for(int i=1;i<=nums.length-1;i++){
            if(nums[i]<nums[i-1]){
                lessercount++;
            }
        }
        if(nums[nums.length-1]>nums[0]){
            lessercount++;
        }
        if(lessercount >1){
            return false;
        }
        return true;
    }
}