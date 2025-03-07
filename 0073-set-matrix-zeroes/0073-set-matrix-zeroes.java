class Solution {
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
           int row = data1.row;
           int col = data1.col;
           if(col < matrix[0].length){
           for(int i =0;i<matrix.length;i++){
                matrix[i][col]=0;
           }}
            if(row<matrix.length){
           for(int i =0;i<matrix[0].length;i++){
                matrix[row][i]=0;
           }}
        }
    }
}