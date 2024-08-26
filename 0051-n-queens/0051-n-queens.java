class Solution {
    public List<List<String>> solveNQueens(int n) {
         List<List<String>> res = new ArrayList<>();
        List<List<String>> board = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            List<String> temp = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                temp.add(".");
            }
            board.add(temp);
        }
        for (List<String> row : board) {
            for (String ch : row) {
                System.out.print(ch + " ");
            }
            System.out.println();
        }
        helperfunc(0,board,n,res);
        return res;
    }
     static boolean isSafe(List<List<String>> board,int row,int col,int n){
        // Boolean hs=false,vs=false,ls=false,rs=false;
        //checking for horizontal status
        if(board.get(row).contains("Q")){
            return false;
        }
        for (int i = 0; i < n; i++) {
            if(board.get(i).get(col).equals("Q")){
                return false;
            }
        }
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board.get(i).get(j).equals("Q")) {
                return false;
            }
        }

        for (int i = row - 1, j = col + 1; i >= 0 && j < board.size(); i--, j++) {
            if (board.get(i).get(j).equals("Q")) {
                return false;
            }
        }
        return true;
    }
    static void helperfunc(int index, List<List<String>> board, int n, List<List<String>> res){
        if (index == n) {
            List<String> current = new ArrayList<>();
            for (List<String> r : board) {
                StringBuilder sb = new StringBuilder();
                for (String s : r) {
                    sb.append(s);
                }
                current.add(sb.toString());
            }
            res.add(current);
            return;
        }



        for (int i = 0; i <n ; i++) {
            if(isSafe(board,index,i,n)){
                board.get(index).set(i,"Q");
                helperfunc(index+1,board,n, res);
                board.get(index).set(i,".");
            }
        }


    }
}