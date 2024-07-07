class Solution {
    public List<String> removeAnagrams(String[] words) {
        ArrayList<String> str = new ArrayList<String>();
        String temp ="";
        for(int i =0;i<words.length;i++) {
            char[] ch = words[i].toCharArray();
            Arrays.sort(ch);
            String SortedStr = new String(ch);
            if(SortedStr.length() == 1 && !temp.equals(words[i])){
                str.add(SortedStr);

            }

            if(SortedStr.length()>1 &&!temp.equals(SortedStr)){
                //smap.put(SortedStr,words[i]);
                str.add(words[i]);
            }
            temp = SortedStr;

        }

        return str;
    }
}