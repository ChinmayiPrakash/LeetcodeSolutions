class Solution {
    public double findMaxAverage(int[] nums, int k) {
      /* int l= 0;
       int r = 0;
       int sum = 0;
       Double maxavg = -Double.MAX_VALUE;
       Double avg = 0.00;
       while (r< nums.length){
           sum = sum + nums[r];
           if(r-l+1==k){
               avg = sum/(k*1.00);
               maxavg = Math.max(maxavg,avg);
               sum = sum - nums[l];
               l++;
           }
           r++;

       }
       return maxavg;*/
         double maxavg=-10001;
        for (int i=1; i< nums.length; i++){
            nums[i]+=nums[i-1];
        }
        if(k==nums.length){
            maxavg=(double)nums[nums.length-1]/k;
            return maxavg;
        }
        for(int j=nums.length-1; j>=k-1; j--){
            double avg=0;
            if(j-k+1==0){
                avg=nums[j];
            }else{
                avg=nums[j]-nums[j-k];
            }
            
            avg = avg/k;
            if(maxavg<avg){
                maxavg=avg;
            }
        }
        return maxavg;
    }
}