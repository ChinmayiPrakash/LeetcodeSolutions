class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int s = 0;
        int e = letters.length-1;
        if(target >= letters[e]){
            return letters[0];
        }
        while(s<=e){
            int mid = (s+e)/2;
            char midelement = letters[mid];
            if(midelement>target){
                e = mid - 1;
            } else if (midelement<=target) {
                s = mid +1;
            }
           

        }
        return letters[s];
    
    }
}