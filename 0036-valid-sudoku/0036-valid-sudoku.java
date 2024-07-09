class Solution {
  /*  static HashSet<Integer> set = new HashSet();
    public boolean isValidSudoku(char[][] board) {
            set.clear();
            int[] temp = new int[9];
           
           for(int i =0;i<board.length;i++){
                for(int j=0;j<board[i].length;j++){
                    if(board[i][j]=='.'){
                        temp[j]=0;
                    }
                    else{
                        temp[j]= Character.getNumericValue(board[i][j]);
                    }
                }
                if(!ValidateEachRow(temp)){
                    return false;
                }
                set.clear();
            }

            //return true;
        for(int i =0;i<board.length;i++){
            for(int j=0;j<board[i].length;j++){
                if(board[j][i]=='.'){
                    temp[j]=0;
                }
                else{
                    temp[j]= Character.getNumericValue(board[j][i]);
                }
            }
            if(!ValidateEachRow(temp)){
                return false;
            }
            set.clear();
        }
        int iini = 0;
        int iend = iini +3;
        int jini =0;
        int jend = jini + 3;
        int k =0;
        while((iend+3)<=(board.length+3)){
            while((jend+3)<=(board.length+3)){
                k = 0;
                for(int i = iini;i<iend;i++){
                    for(int j =jini ;j<jend;j++ ){
                        if(board[i][j]=='.'){
                            temp[k]=0;
                            k++;
                        }
                        else{
                            temp[k]= Character.getNumericValue(board[i][j]);
                            k++;
                        }
                    }
                }
                if(!ValidateEachRow(temp)){
                    return false;
                }
                set.clear();
                jini = jend;
                jend = jend+3;
            }

            iini = iend;
            iend = iend+3;
            jini = 0;
            jend = jini + 3;
          

        }
return true;
    }
    public boolean ValidateEachRow(int[] nums){
        for(int num : nums){
            if(num>0){
                if(!set.add(num)){
                    return false;
                }
            }

        }
        return true;
    }*/
    
    public boolean isValidSudoku(char[][] board) {
        for (int i = 0; i < board.length; i++) {
            if (!validateRow(board, i) || !validateColumn(board, i)) {
                return false;
            }
        }

        for (int i = 0; i < board.length; i += 3) {
            for (int j = 0; j < board[i].length; j += 3) {
                if (!validateBox(board, i, j)) {
                    return false;
                }
            }
        }
        return true;
    }

    private boolean validateRow(char[][] board, int row) {
        HashSet<Character> set = new HashSet<>();
        for (int j = 0; j < board[row].length; j++) {
            char current = board[row][j];
            if (current != '.' && !set.add(current)) {
                return false;
            }
        }
        return true;
    }

    private boolean validateColumn(char[][] board, int col) {
        HashSet<Character> set = new HashSet<>();
        for (int i = 0; i < board.length; i++) {
            char current = board[i][col];
            if (current != '.' && !set.add(current)) {
                return false;
            }
        }
        return true;
    }

    private boolean validateBox(char[][] board, int startRow, int startCol) {
        HashSet<Character> set = new HashSet<>();
        for (int i = startRow; i < startRow + 3; i++) {
            for (int j = startCol; j < startCol + 3; j++) {
                char current = board[i][j];
                if (current != '.' && !set.add(current)) {
                    return false;
                }
            }
        }
        return true;
    }
}
