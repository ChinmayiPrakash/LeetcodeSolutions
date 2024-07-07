class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer,Integer> fmap = new HashMap<Integer,Integer>();
        //Adding all data to HashMap
        for(int num:nums){
            fmap.put(num,fmap.getOrDefault(num,0)+1);
        }
        //return true if value of any key is greater than 1
        for(Map.Entry<Integer,Integer> entry : fmap.entrySet()){
            if(entry.getValue()>1){
                return true;
            }
        }
        return false;
    }
}