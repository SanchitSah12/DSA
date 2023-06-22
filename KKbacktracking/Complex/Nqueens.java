import java.util.*;
class Nqueens{

    static int queens(boolean[][] board, int row){
        if(row == board.length){
            display(board);
            return 1;
        }
        int count = 0;
        //placing the queen
        for(int col = 0; col<board.length;col++){
            //pplace the queen if safe
            if(isSafe(board,row,col)){
                board[row][col] = true;
                count+= queens(board, row+1);
                board[row][col] = false;
            }
        }
        return count;
    }
    private static boolean isSafe(boolean[][] board, int row, int col) {
        // check vertical row
        for(int i = 0; i < row ;i++){
            if(board[i][col]){
                return false;
            }
        }
        //diagnol left
        int maxLeft = Math.min(row, col);
        for(int i = 1 ; i<=maxLeft;i++){
            if(board[row-i][col-i]){
                return false;
            }
        }
        int maxRight = Math.min(row, board.length-col-1);
        for(int i = 1 ; i<=maxRight;i++){
            if(board[row-i][col+i]){
                return false;
            }
        }
        return true;
    }
    public static void display(boolean[][] board) {
        for (boolean[] bs : board) {
            for (boolean bs2 : bs) {
                if(bs2){
                    System.out.print('Q');
                }
                else{
                    System.out.print(".");
                }
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 4;
        boolean[][] board= new boolean[n][n];
        System.out.println(queens(board, 0));
    }
}