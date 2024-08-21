class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
          ArrayList<Integer> lesser = new ArrayList<>();
        ArrayList<Integer> greater = new ArrayList<>();
        int count = 0;
        for (int num : nums){
            if(num>pivot){
                greater.add(num);
            }else if(num < pivot){
                lesser.add(num);
            }else {
                count ++;
            }
        }
        int arraylenth=0;
        for (int i = 0; i < lesser.size(); i++) {
            nums[arraylenth]= lesser.get(i);
            arraylenth++;
        }
        while(count>0){
            nums[arraylenth]=pivot;
            arraylenth++;
            count--;
        }
        for (int i = 0; i < greater.size(); i++) {
            nums[arraylenth]= greater.get(i);
            arraylenth++;
        }
        return nums;
    }
}