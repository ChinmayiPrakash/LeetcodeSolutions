class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int n = image.length;
        int m = image[0].length;
        int[][] visited = new int[n][m];
        dfs(image,color,sr,sc,visited);
        return image;
        
    }
    void dfs(int[][] image, int color,int sr,int sc,int[][] visited){
        int val = image[sr][sc];
        visited[sr][sc]=1;
        image[sr][sc]=color;
      //  Queue<List<Integer>> q = new LinkedList<List<Integer>>;
        //List<Integer> temp = new ArrayList<>();
        //temp.add(sr);
        //temp.add(sc);
        
        //q.offer(temp);
        //temp.clear();
        
        int index[][] = {{sr-1,sc},{sr+1,sc},{sr,sc-1},{sr,sc+1}};
        
        for(int i = 0;i<index.length;i++){
            int nrow = index[i][0];
            int ncol = index[i][1];
            if(nrow>=0 && nrow<image.length && ncol>=0 && ncol<image[0].length && image[nrow][ncol]==val && visited[nrow][ncol]==0){
                dfs(image,color,nrow,ncol,visited);
            }
        }
        
    }
}