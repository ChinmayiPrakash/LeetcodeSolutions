class Solution {
    public int findPeakElement(int[] arr) {
        if(arr.length ==1){
            return 0;
        }
      int s =0;
        int e = arr.length-1;
        

        while ( s<=e && s<arr.length-1){
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
        return s;
    }
}
