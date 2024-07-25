class Solution {
    public int characterReplacement(String s, int k) {
       int l=0,maxlen=0,maxval=0;
        HashMap<Character,Integer> smap = new HashMap<>();
        for (int r = 0; r < s.length(); r++) {
            Character ch = s.charAt(r);
            smap.put(ch,smap.getOrDefault(ch,0)+1);
            maxval = Math.max(maxval,smap.get(ch));
            int temp = (r-l+1)-maxval;
            if(temp<=k){
                maxlen=Math.max(maxlen,(r-l+1));
            }else{
                //maxlen=Math.max(maxlen,(r-l));
                smap.put(s.charAt(l),smap.getOrDefault(s.charAt(l),0)-1);
                l++;
                //smap.clear();
            }
        }
        return maxlen;
    }
}