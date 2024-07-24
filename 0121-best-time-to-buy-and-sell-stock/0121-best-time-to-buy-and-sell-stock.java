class Solution {
    public int maxProfit(int[] arr) {
        int l=0;
        int r=1;
        int max=0,curmax=0;
        while(l<r && l<(arr.length) && (r<=(arr.length-1))){
            if(arr[l]>=arr[r]){
                l=r;
               // r++;
            } else if (arr[l]<arr[r]) {
                max=arr[r]-arr[l];

                if(curmax<max){
                    curmax=max;
                }
            }

                r++;

        }
        return curmax; 
    }
}