class Solution {
    public int missingNumber(int[] nums) {
      int res = getSum(nums);
        int sum = ((nums.length)*(nums.length+1))/2;
        return(sum-res);
    }
    static int getSum (int[] arr){
        int sum = 0;
        for(int i =0;i<=arr.length-1;i++){
            sum = sum + arr[i];
        }
        return sum;
    }
}