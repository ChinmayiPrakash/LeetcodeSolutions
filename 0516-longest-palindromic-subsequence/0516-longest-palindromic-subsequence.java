class Solution {
    public int longestPalindromeSubseq(String s) {
        String reversed = new StringBuilder(s).reverse().toString();
        System.out.println(reversed);
        return LCS(s, reversed);
    }

    int LCS(String text1 , String text2){
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