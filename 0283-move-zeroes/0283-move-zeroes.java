class Solution {
    public void moveZeroes(int[] nums) {
        int nonZeroIndex = 0;
        for(int cur = 0 ; cur < nums.length; cur ++){
            if(nums[cur] != 0){
                swap(nums, cur, nonZeroIndex);
                nonZeroIndex += 1;
            }
        }
    }

    public static void swap(int[] nums, int start, int end){
        int temp = nums[end];
        nums[end] = nums[start];
        nums[start] = temp;    
    }
}