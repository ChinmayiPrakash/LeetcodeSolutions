class Solution {
    public int[] searchRange(int[] arr, int target) {
    int[] res={-1,-1};
        res[0] = bs(arr,target,true);
        res[1] = bs(arr,target,false);
        return res;
    }


    static int bs(int[] arr, int target, boolean isstart) {
        int ans = -1;
        int s = 0,e = arr.length-1;
        while (s<=e){
            int mid = (s+e)/2;
            int midelement = arr[mid];
            if(midelement==target){
                ans =mid;
                if(isstart){
                    e = mid-1;
                }
                else{
                    s=mid+1;
                }
            } else if (midelement<target) {
                s =mid+1;
            }
            else if (midelement>target){
                e = mid -1;
            }
        }

        return ans;
    }



}

