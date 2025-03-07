import java.util.*;

class Solution {
    class Data {  // Capitalized class name (convention)
        public int row;
        public int col;

        Data(int row, int col) {  // Removed empty constructor (not needed)
            this.row = row;
            this.col = col;
        }
    }

    public void setZeroes(int[][] matrix) {
        Queue<Data> values = new LinkedList<>();

        // Step 1: Store positions of zeroes
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 0) {
                    values.offer(new Data(i, j));
                }
            }
        }

        // Step 2: Set rows and columns to zero
        while (!values.isEmpty()) {
            Data data1 = values.poll();
            int row = data1.row;
            int col = data1.col;

            // Fix boundary check: should be '<' instead of '<='
            if (col < matrix[0].length) {
                for (int i = 0; i < matrix.length; i++) {
                    matrix[i][col] = 0;
                }
            }

            if (row < matrix.length) {
                for (int i = 0; i < matrix[0].length; i++) {
                    matrix[row][i] = 0;
                }
            }
        }
    }
}

/*class Solution {
    class data{
        public int row;
        public int col;
        data(){}
        data(int row,int col){
            this.row=row;
            this.col=col;
        }
    }
    public void setZeroes(int[][] matrix) {
        Queue<data> values = new LinkedList<>();

        for(int i =0; i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==0){
                    data data2 = new data(i,j);
                    values.offer(data2);
                }
            }
        }
        while(!values.isEmpty()){
           data data1 = new data();
           data1 = values.poll();
           int col = data1.row;
           int row = data1.col;
           if(col < matrix.length){
           for(int i =0;i<matrix.length;i++){
                matrix[i][col]=0;
           }}
            if(row<matrix[0].length){
           for(int i =0;i<matrix[0].length;i++){
                matrix[row][i]=0;
           }}
        }
    }
}*/