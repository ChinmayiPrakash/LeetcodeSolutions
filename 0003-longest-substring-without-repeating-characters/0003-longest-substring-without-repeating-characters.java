class Solution {
    public int lengthOfLongestSubstring(String s) {
      if(s==null || s.length()==0){
            return 0;
        }
        int l=0,maxlength=0;
        HashMap<Character,Integer> smap = new HashMap<>();
        for (int r=0;r<=(s.length()-1);r++){
            if(smap.containsKey(s.charAt(r))){
                l= Math.max(l,smap.get(s.charAt(r))+1);
            }
            smap.put(s.charAt(r),r);
            maxlength=Math.max(maxlength,r-l+1);
        }
        return maxlength;
    }
}