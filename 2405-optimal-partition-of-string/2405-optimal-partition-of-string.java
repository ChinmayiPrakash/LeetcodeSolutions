class Solution {
    public int partitionString(String s) {
         int l = 0;
        int r =0;
        ArrayList<String> temp = new ArrayList<>();
        HashSet<Character> hset = new HashSet<>();
        String str = "";
        while(r<s.length()){
            if(!hset.contains(s.charAt(r))){
                hset.add(s.charAt(r));
                str = str + s.charAt(r);
                if(r==s.length()-1){
                    temp.add(str);
                }
              //  temp.add(str);
                r++;
            }else{
                temp.add(str);
                //r++;
                str="";
                hset.clear();
            }
        }

        return temp.size();
    }
}