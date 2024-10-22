class Solution {
    public int longestCommonSubsequence(String text1, String text2) {

 int n = text1.length() + 1;
        int m = text2.length() + 1;

        int temp[][] = new int[n][m];

        // Initialize the DP table
        for (int i = 0; i < n; i++) {
            temp[i][0] = 0;
        }
        for (int j = 0; j < m; j++) {
            temp[0][j] = 0;
        }

        // Fill the DP table
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < m; j++) {
                if (text1.charAt(i - 1) == text2.charAt(j - 1)) {
                    temp[i][j] = 1 + temp[i - 1][j - 1];
                } else {
                    temp[i][j] = Math.max(temp[i - 1][j], temp[i][j - 1]);
                }
            }
        }

        // Return the result from the bottom-right of the DP table
        return temp[n - 1][m - 1];
    }
    
}

/*
This code was done before learning dp. this works if we have to check common characters which are not in order . In order to fetch characters between 2 strings which are in order then we need to use DP.

int[] arr1 = new int[26];
        int[] arr2 = new int[26];
        int count =0;

        for(int i = 0;i<text1.length();i++){
            char ch = text1.charAt(i);
            arr1[ch-'a']++;
        }
        for(int i = 0;i<text2.length();i++){
            char ch = text2.charAt(i);
            arr2[ch-'a']++;
        }

        for(int i =0;i<26;i++){
            if(arr1[i]>0 && arr2[i]>0){
            if(arr1[i]==arr2[i]){
                    count++;
            }}
        }
        return count;
 */