class Solution {
    public int[] getConcatenation(int[] nums) {
        int n = (nums.length)*2;
        int[] ans = new int[n];
        int index = 0;
        for(int i =0;i<n;i++){
            ans[i]=nums[index];
            index++;
            if(index == nums.length){
                index=0;
            }
        }
        return ans;
    }
}