class Solution {
    public int search(int[] nums, int target) {
      int minele = findMin(nums);
       int res = binarysearch(nums,0,minele-1,target);
       if(res == -1){
           res=binarysearch(nums,minele, nums.length-1,target );
       }
       return res;
    }
     static int findMin(int[] nums) {
        int s = 0;
        int e = nums.length - 1;

        while (s < e) {
            int mid = s + (e - s) / 2;
            if (nums[mid] > nums[e]) {
                s = mid + 1;
            } else {
                e = mid;
            }
        }
        return s;
    }
    static int binarysearch(int[] nums , int s, int e,int target){
        while(s<=e){
            int mid = s + (e-s)/2;
            if(nums[mid]==target){
                return mid;
            } else if (nums[mid]<target) {
                s = mid + 1;

            }
            else if(nums[mid]>target){
                e = mid - 1;
            }
        }
        return -1;
    }
}