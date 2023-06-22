// This code solves a Sudoku puzzle by recursively filling in empty cells with valid numbers and backtracking when a solution is not possible. 
import java.util.*;

class SudokuSolver {
    public static void printBoard(char[][] board) {
        for (char[] bs : board) {
            for (char bs2 : bs) {
                System.out.print(bs2);
            }
            System.out.println();
        }
        // System.out.println(Arrays.toString(board));
    }

    public static boolean helper(char[][] board, int row, int col) {
        if (row == board.length) {
            printBoard(board);
            return true;
        }
        int nrow = 0;
        int ncol = 0;
        if (col == board.length - 1) {
            nrow = row + 1;
            ncol = 0;
        } else {
            nrow = row;
            ncol = col + 1;
        }

        if (board[row][col] != '.') {
            if (helper(board, nrow, ncol)) {
                return true;
            }
        } else {
            //fill
            for (int i = 1; i <= 9; i++) {
                if (isSafe(board, row, col, i)) {
                    board[row][col] = (char) (i + '0');
                    if(helper(board, nrow, ncol))
                    {
                        return true;
                    }
                    else
                    board[row][col] = '.';
                }

            }
        }
        return false;
    }

    private static boolean isSafe(char[][] board, int row, int col, int num) {
        // check row
        for (int i = 0; i < board.length; i++) {
            if (board[i][col] == ((char) (num + '0'))) {
                return false;
            }
        }
        // check cik
        for (int i = 0; i < board.length; i++) {
            if (board[row][i] == ((char) (num + '0'))) {
                return false;
            }
        }
        int sqrt = (int) Math.sqrt(board.length);
        int rowStart = row - row % sqrt;
        int colStart = col - col % sqrt;
        for (int i = rowStart; i < rowStart + sqrt; i++) {
            for (int j = col; j < colStart + sqrt; j++) {
                if (board[i][j] == ((char) (num + '0'))) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char c = (char) ('0' + 1);
        char[][] board = {{'5','3','.','.','7','.','.','.','.'},{'6','.','.','1','9','5','.','.','.'},{'.','9','8','.','.','.','.','6','.'},{'8','.','.','.','6','.','.','.','3'},{'4','.','.','8','.','3','.','.','1'},{'7','.','.','.','2','.','.','.','6'},{'.','6','.','.','.','.','2','8','.'},{'.','.','.','4','1','9','.','.','5'},{'.','.','.','.','8','.','.','7','9'}};
        helper(board, 0, 0);
    }
}