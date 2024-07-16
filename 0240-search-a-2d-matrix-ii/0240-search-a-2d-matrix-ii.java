class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
       /* if(matrix==null || matrix.length==0 ||matrix[0].length==0){
            return false;
        }
        int row = matrix.length;
        int col = matrix[0].length;
        int s = 0;
        int e = (row*col)-1;
        /*if (midElement == target) {
                return true;
            } else if (midElement < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }*//*
        while(s<=e){
            int mid = s + (e-s)/2;
            int midelement = matrix[mid/col][mid%col];
            if( midelement==target){
                return true;
            }else if( midelement>target){
                e=mid-1;
            }
            else if( midelement<target){
                s = mid+1;
            }
        }
        return false;*/
        
      int i=0;
        int j=matrix[0].length-1;
        while(j>=0 && i<matrix.length){
            if(matrix[i][j]==target)return true;
            if(j-1>=0 && matrix[i][j-1]<target){
                i++;
            }
            else{
                if(j-1<0)i++;
                else j--;
            }
        }
        return false;
    }
}