class Solution {
    public List<Integer> findAnagrams(String s, String p) {
       HashMap<Character,Integer> pmap = new HashMap<>();
        HashMap<Character,Integer> smap = new HashMap<>();
        List<Integer> res = new ArrayList<>();

        for (int i = 0; i < p.length(); i++) {
            pmap.put(p.charAt(i),pmap.getOrDefault(p.charAt(i),0)+1);
        }
        int l=0;
        int r= 0;

        while (r<s.length()){
            smap.put(s.charAt(r),smap.getOrDefault(s.charAt(r),0)+1);
            if(r-l+1 == p.length()){
                if(smap.equals(pmap)){
                    res.add(l);
                    //l++;
                }//else{
                    //if(smap.containsKey(s.charAt(l))){
                        if(smap.get(s.charAt(l))==1){
                            smap.remove(s.charAt(l));
                        }else {
                            smap.put(s.charAt(l), smap.getOrDefault(s.charAt(l), 0) - 1);
                        }
                        l++;
                   // }
                //}
            }
            r++;

        }
        return res;
    }
}