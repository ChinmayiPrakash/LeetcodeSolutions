class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character,Integer> smap = new HashMap<Character,Integer>();
        for(char sc : s.toCharArray()){
            smap.put(sc,smap.getOrDefault(sc,0)+1);
        }
        HashMap<Character,Integer> tmap = new HashMap<Character,Integer>();
        for(char tc : t.toCharArray()){
            tmap.put(tc,tmap.getOrDefault(tc,0)+1);
        }
        if(smap.equals(tmap)){
            return true;
        }
        else{
            return false;
        }
    }
}