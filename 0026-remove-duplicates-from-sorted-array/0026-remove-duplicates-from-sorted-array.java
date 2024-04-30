class Solution {
    public int removeDuplicates(int[] nums) {
        int i =0, j = 0,index =0;
        int n = nums.length;
        while(j<n){
            if(nums[i]==nums[j]){
                j++;
            }
            else{
                //index++;
                nums[index] = nums[i];
                index++;
                i =j;
            }


        }
        index++;
        nums[index-1] = nums[j-1];
        return index;
    }
}