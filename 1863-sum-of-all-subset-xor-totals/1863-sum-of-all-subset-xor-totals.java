class Solution {
    public int subsetXORSum(int[] nums) {
        int setsum = 0;
        int n = nums.length;
        int noofsubset = 1 << n;

        for (int i = 0; i < noofsubset; i++) {
            int sum = 0;
            for (int j = 0; j < n; j++) {
                if((i & (1<<j))!=0){
                    sum = sum ^ nums[j];
                }

            }
            setsum = setsum + sum;

        }

        return setsum;
    }
}