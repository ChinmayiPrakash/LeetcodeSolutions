class Solution {
    public int largestAltitude(int[] gain) {
        int[] temp = new int[gain.length+1];
        temp[0] =0;
         int j =0;
        for(int i = 1; i<temp.length;i++){
            temp[i] = temp[i-1] + gain[j];
            j++;
        }
        int max = 0;
       
        for(int i=0 ; i<temp.length; i++){
            if(temp[i]>max){
                max = temp[i];
            }
        }
        return max;
    }
}