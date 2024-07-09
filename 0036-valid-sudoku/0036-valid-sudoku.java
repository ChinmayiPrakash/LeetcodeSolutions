class Solution {
    static HashSet<Integer> set = new HashSet();
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
    }
}
