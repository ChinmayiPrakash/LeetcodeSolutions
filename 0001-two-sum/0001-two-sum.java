class Solution {
    public int[] twoSum(int[] nums, int target) {
         HashMap<Integer,Integer> smap = new HashMap<Integer,Integer>();
        int[] op = new int[2];
        for(int j =0;j<nums.length ;j++){
            //if(nums[j]<0){
              //  nums[j] = -1 * nums[j];
            //}
            int val = (target-nums[j]);
            if(smap.containsKey(val)){
                op[0]=smap.get(val);
                op[1]=j;
                break;
            }
            smap.put(nums[j],j);
        }
        return op;
    }
}