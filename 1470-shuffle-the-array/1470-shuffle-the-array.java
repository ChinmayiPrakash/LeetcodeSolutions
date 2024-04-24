class Solution {
    public int[] shuffle(int[] nums, int n) {
        n = nums.length;
        int[] temp = new int[n];
        int j =0;
        for(int i =(n/2);i<n;i++){
            temp[j]=nums[(i-(n/2))];
            j++;
            temp[j]=nums[i];
            j++;
        }
        return temp;
    }
}