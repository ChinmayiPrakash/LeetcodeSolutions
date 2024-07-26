class Solution {
    public List<Integer> findAnagrams(String s, String p) {
      /* HashMap<Character,Integer> pmap = new HashMap<>();
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
        return res;*/
        int[] sa = new int[26];
        int[] pa = new int[26];
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < p.length(); i++) {
            pa[p.charAt(i)-'a']++;
        }
        int l=0,r=0;
        while (r<s.length()){
            sa[s.charAt(r)-'a']++;
            if(r-l+1==p.length()){
                if(Arrays.equals(sa,pa)){
                    res.add(l);
                }
                sa[s.charAt(l)-'a']--;
                l++;
            }
            r++;
        }
        return res;
    }
}