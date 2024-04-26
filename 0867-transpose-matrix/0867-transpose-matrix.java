class Solution {
    public int[][] transpose(int[][] matrix) {
        
        int m = matrix.length;
        int n = matrix[0].length;
        
        
        if(m==n){
            for(int i = 0; i<m;i++){
                for(int j = 0;j<n;j++){
                    if(i <j){
                        int temp = matrix[i][j];
                        matrix[i][j] = matrix[j][i];
                        matrix[j][i] = temp;
                    }
                }
            }
            return matrix;
        }
        else{
            int[][] temp = new int[n][m];
            for(int i = 0;i<n;i++){
                for(int j =0;j<m;j++){
                    temp[i][j] = matrix[j][i];
                }
            }
            return temp;
        }
        
    }
}