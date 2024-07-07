class Solution {
    public List<List<String>> groupAnagrams(String[] str) {
       // Traverse through all the elements in array
        HashMap<String,List<String>> smap = new HashMap<String,List<String>>();
        for(String s : str ){
            // Convert each element to char array
            char[] charArray = s.toCharArray();
            // Sort each char array as Sorted Array
            Arrays.sort(charArray);
            String SortedArray = new String(charArray);
            // if Sorted Array doesn't extist in maps add Sorted array as "Key" and newarraylist as value
          if(!smap.containsKey(SortedArray)){
              smap.put(SortedArray,new ArrayList<>());
          }
            //If sSortedArray already exists as key add Original string to that newly created array
          smap.get(SortedArray).add(s);
        }
        // return thr list
        return new ArrayList<>(smap.values()); 
    }
}