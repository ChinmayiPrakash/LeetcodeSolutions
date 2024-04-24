class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        int[] target = new int[nums.length];
        for (int i = 0; i < target.length; i++) {
            target[i] = -1;
        }
        for (int i = 0; i < nums.length; i++) {
            if(target[index[i]] == -1){
                target[index[i]] = nums[i];
            }
            else{
                int temp = target[index[i]];
                target[index[i]]=nums[i];
                int j = index[i]+1;
               while (j<(target.length)){
                   int temp2 = target[j];
                    target[j] = temp;
                    temp = temp2;
                    j++;
                }
            }
        }
        return target;

        
        
    }
}