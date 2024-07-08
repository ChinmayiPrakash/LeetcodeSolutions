class Solution {
    public int[] productExceptSelf(int[] nums) {
        boolean zeroindex=false;
        int count=0,index=0,product =1;
        int[] op = new int[nums.length];
        for(int i =0;i<nums.length;i++){
            if(nums[i]==0){
                zeroindex=true;
                count++;
                index = i;
                continue;
            }
            product = product * nums[i];
        }
        
        for(int i =0;i<nums.length;i++){
            if(zeroindex){
                if(count==1){
                    if(index==i){
                        op[index]=product;
                    }
                    else
                    {
                        op[i]=0;
                    }
                }else{
                    op[i]=0;
                }
            }else{
                op[i]= product/nums[i];
            }
        }
        return op;
    }
}