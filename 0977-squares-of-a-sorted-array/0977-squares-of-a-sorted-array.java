class Solution {
    public int[] sortedSquares(int[] nums) {
        int i=0;
        int j = nums.length-1;
        int rl = nums.length-1;
        int[] res = new int[nums.length];
        while(i<=j){
            if((nums[i]*nums[i]) <(nums[j]*nums[j])){
                res[rl] = (nums[j]*nums[j]);
                rl--;
                j--;
            }
            else if((nums[i]*nums[i])>(nums[j]*nums[j])){
                res[rl]=(nums[i]*nums[i]);
                rl--;
                i++;
                
            }
            else{
                res[rl]=(nums[j]*nums[j]);
                if(rl>0){
                    rl--; 
                }
               
                j--;
                res[rl]=(nums[i]*nums[i]);
                   if(rl>0){
                    rl--; 
                }
                i++;
            }
        }
        return res;
        
    }
}