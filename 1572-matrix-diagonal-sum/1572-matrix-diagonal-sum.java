class Solution {
    public int diagonalSum(int[][] mat) {
        int i = 0;
        int n = mat.length;
        int sum =0;
        while(i<n){
            sum = sum + mat[i][i];
           System.out.println(i + "+" + i + "=" +sum);
            if(i == (n-i-1)){
                sum = sum +0;
            }
            else{
                sum = sum +mat[i][n-i-1];
            }

            System.out.println(i + "+" + (n-i-1) + "=" +sum);
            //i++;
            i++;
           // j++;


        }

        

        return sum;


    }
}