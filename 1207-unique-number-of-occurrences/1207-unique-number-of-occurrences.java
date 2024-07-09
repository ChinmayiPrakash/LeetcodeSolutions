class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> smap = new HashMap<Integer,Integer>();
        HashMap<Integer,Integer> res = new HashMap<Integer,Integer>();
        for(int num: arr){
            smap.put(num,smap.getOrDefault(num,0)+1);
        }
        for(Integer val : smap.values()){
            if(res.containsKey(val)){
                return false;
            }
            res.put(val,val);
        }
        return true;
        
    }
}