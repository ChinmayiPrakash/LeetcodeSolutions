class Solution {
    public int peakIndexInMountainArray(int[] arr) {
      int s =0;
        int e = arr.length-1;

        while ( s<=e){
           int  mid = s + ((e-s)/2);
         //   if(mid>0){
                if(arr[mid]>arr[mid + 1]){
                    e =mid ;
                    if(s==e ){
                        return s;
                    }

                }else if(arr[mid]<arr[mid + 1]){
                    s =mid + 1;
                }else{
                    return e;
                }

          //  }

        }
        return -1;
    }
}
