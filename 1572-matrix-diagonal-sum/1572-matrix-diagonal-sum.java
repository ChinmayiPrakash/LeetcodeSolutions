class Solution {
    public int diagonalSum(int[][] mat) {
        int i = 0,j = 0;
        int n = mat.length;
        int sum =0;
        while(i<n && j<n){
            sum = sum + mat[i][j];
            System.out.println(i + "+" + j + "=" +sum);
            i++;
            j++;


        }

        i = 0;
        j = n-1;
        while(i<n &&j>=0){
            if(i == j){
                sum = sum +0;
            }
            else{
                sum = sum +mat[i][j];
            }

            System.out.println(i + "+" + j + "=" +sum);
            i++;
            j--;
        }

        return sum;


    }
}