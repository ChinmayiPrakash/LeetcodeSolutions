class Solution {
    public int numIdenticalPairs(int[] nums) {
        int[] temp = new int[101];
        int total =0;
        for(int i = 0 ;i<nums.length;i++){
            temp[nums[i]] = temp[nums[i]] +1;
        }
        for(int i =0;i<temp.length;i++){
            if(temp[i]>1){
                int data = temp[i];
                total = total + ((data*(data - 1))/2);
            }
        }
        return total;
    }
}