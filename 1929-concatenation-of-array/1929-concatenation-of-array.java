class Solution {
    public int[] getConcatenation(int[] arr) {
        int[] temp = new int[2*arr.length];
        int j = 0;
        for (int i = arr.length; i < temp.length; i++) {
            temp[i-arr.length]=arr[i-arr.length];
            temp[i]=arr[i-arr.length];    
        
        }
        return temp;
    }
    
}