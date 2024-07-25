class Solution {
    public boolean checkInclusion(String s1, String s2) {
        HashMap<Character,Integer> smap = new HashMap<>();
        HashMap<Character,Integer> wmap = new HashMap<>();
        for (int i = 0; i < s1.length(); i++) {
            smap.put(s1.charAt(i),smap.getOrDefault(s1.charAt(i),0)+1);
        }

        int l=0;
        int r=0;
        while (r<s2.length()){
            if(r-l+1==s1.length()+1){
                if(smap.equals(wmap)){
                    return true;
                }
                else{
                    wmap.clear();
                    l++;
                    r=l;
                }
            }
            wmap.put(s2.charAt(r),wmap.getOrDefault(s2.charAt(r),0)+1);
            r++;
        }
        if(smap.equals(wmap)){
                    return true;
                }
        return false;

    }
}