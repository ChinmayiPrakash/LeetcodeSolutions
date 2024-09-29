class Solution {
    int count = 1;
    public int maxAreaOfIsland(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int[][] visited = new int[n][m];
        int maxlen=0;
       // int newcount =0;

        for(int i=0 ;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==1 && visited[i][j]==0){
                 dfs(grid,i,j,visited,n,m);
                  maxlen = Math.max(count,maxlen);
                  count=1;
                }
            }
        }
        return maxlen;
    }

    void dfs(int[][] grid,int row,int col,int[][] visited,int n,int m){
        
        visited[row][col]=1;
        int[][] index = {{-1,0},{0,1},{1,0},{0,-1}};
        for(int i=0 ; i<index.length;i++){
            int nrow = row + index[i][0];
            int ncol = col + index[i][1];
            if(nrow>=0 && ncol>=0 && nrow<n && ncol<m && visited[nrow][ncol]==0 && grid[nrow][ncol] == 1){
                dfs(grid,nrow,ncol,visited,n,m);
                count++;
            }
        }
        //return count;
    }



}