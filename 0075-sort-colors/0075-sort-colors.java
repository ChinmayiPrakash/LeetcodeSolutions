class Solution {
    public void sortColors(int[] nums) {
        int redcount =0;
        int whitecount =0;
        int bluecount=0;

        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                redcount++;
            }
            if(nums[i]==1){
                whitecount++;
            }
            if(nums[i]==2){
                bluecount++;
            }
        }

        int ind =0;
        while(ind<redcount){
            nums[ind]=0;
            ind++;
        }
        //ind=0;
        int temp = ind;
        while(ind<(whitecount+temp)){
            nums[ind]=1;
            ind++;
        }
        //ind =0;
        temp =ind;
        while(ind<(bluecount+temp)){
            nums[ind]=2;
            ind++;
        }


    }
}