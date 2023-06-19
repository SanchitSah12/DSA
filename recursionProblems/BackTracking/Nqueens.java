import java.util.*;
class Nqueens{
    public static boolean isSafe(int row, int col, char[][] board) {
        //horizontal
        for (int j = 0; j < board.length; j++) {
            if(board[row][j] == 'Q'){
                return false;
            }
        }
        //vertical
        for (int i = 0; i < board[0].length; i++) {
            if(board[i][col] == 'Q'){
                return false;
            }
        }

        //diagnol upper left
        for (int i = row, j = col; i >= 0 && j >=0;i-- , j--){
            if(board[i][j] == 'Q'){
                return false;
            }
        }
        // lower right
        for (int i = row, j = col; i < board.length && j < board.length;i++ , j++){
            if(board[i][j] == 'Q'){
                return false;
            }
        }
        //lower left
        for (int i = row, j = col; i < board.length && j >=0;i++ , j--){
            if(board[i][j] == 'Q'){
                return false;
            }
        }
        //upper right
        for (int i = row, j = col; i >=0 && j <board.length;i-- , j++){
            if(board[i][j] == 'Q'){
                return false;
            }
        }
        return true;
    }
    public static void saveBoard(char[][] board, List<List<String>> allBoards){
        String row = "";
        List<String> boa = new ArrayList<>();
        for (int i = 0; i < board.length; i++) {
            row = " ";
            for (int j = 0; j < board[0].length; j++) {
                if(board[i][j] == 'Q'){
                    row+="Q";
                }
                else{
                    row+=".";
                }
            }
            boa.add(row);

        }
        allBoards.add(boa);

    }
    public static void helper(char[][] board, List<List<String>> allBoards,int col){
        if(col == board.length){
            saveBoard(board,allBoards);
        }
        for (int row = 0; row < board.length; row++) {
            if(isSafe(row,col,board)){
                board[row][col] = 'Q';
                helper(board, allBoards, col+1);
                board[row][col] = '.';
            }
        }
    }
    public static void  solveNqueens(int n) {
        List<List<String>> allboard = new ArrayList<>();
        char[][] board = new char[n][n];
        helper(board, allboard, 0);
        System.out.println(allboard);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        solveNqueens(4);
    }
}