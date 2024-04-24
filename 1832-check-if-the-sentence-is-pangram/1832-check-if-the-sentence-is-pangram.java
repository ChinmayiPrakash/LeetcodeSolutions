class Solution {
    public boolean checkIfPangram(String sentence) {
         int[] temp = new int[26];
        sentence = sentence.toLowerCase();
        for(int i = 0; i<sentence.length();i++){
           temp[((int)sentence.charAt(i)-(int)'a')] ++;
        }

        for (int i = 0; i < temp.length; i++) {
            if(temp[i]<1){
                return false;
            }
        }
        return true;
    }
    
}