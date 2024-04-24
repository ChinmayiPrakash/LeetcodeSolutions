class Solution {
    public int[] runningSum(int[] nums) {
        int sum = 0;
       for(int i = 0; i<(nums.length);i++){
            sum = sum + nums[i];
       }
       int temp = 0;
       int i = (nums.length - 1);
       while( i>=1 ){
       int temp1 = nums[i];
        nums[i] = sum-temp;
        sum = sum-temp;
        temp = temp1;
        i--;
       // System.out.println(Arrays.toString(num));
       }
       return nums;
    }
}