class Solution {
    public String restoreString(String s, int[] arr) {
     char a[]=new char[arr.length];        
        String o="";
        for(int i=0;i<arr.length;i++)
        {
            a[arr[i]]=s.charAt(i);            
        }
        for(char i:a)
        {
            o+=i;
        }
        return o;
    }
}