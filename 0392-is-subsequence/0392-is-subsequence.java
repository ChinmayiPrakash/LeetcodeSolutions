class Solution {
    public boolean isSubsequence(String s, String t) {
        if(s.length()==0){
            return true;
        }
        int tpointer = 0;
        int spointer = 0;
        while(tpointer < t.length() && spointer < s.length()){
    
                if(s.charAt(spointer)==t.charAt(tpointer)){
                spointer++;
                
            }
            tpointer++;
            
        }
        if(spointer==s.length()){
            return true;
        }

        return false;
    }
}