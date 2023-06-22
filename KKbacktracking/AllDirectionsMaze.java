import java.util.*;

class AllDirectionsMaze {
    // neverEndingLoop
    public static void printMatrix(boolean[][] maze) {
        for (int row = 0; row < maze.length; row++) {
            for (int column = 0; column < maze[row].length; column++) {
                if (!maze[row][column]) {
                    System.out.print("X ");
                } else {
                    System.out.print("  ");
                }

            }
            System.out.println();
        }
    }
    

    public static void printPath(String p,boolean[][] maze ,int row, int col) {
        if (row == maze.length -1 && col ==  maze[0].length- 1) {
            System.out.println(p);
            printMatrix(maze);
            return;
        }
        if(!maze[row][col]){
            return;
        }
        maze[row][col] = false;
        if (col < maze[0].length- 1) {
            printPath(p + "R",maze, row, col + 1);
        }
        if (row < maze.length -1) {
            printPath(p + "D",maze, row + 1, col);
        }
        if(row>0){
            //up
            printPath(p+"U", maze, row-1, col);
        }
        if(col>0){
            //left
            printPath(p+"L", maze, row, col-1);
        }
        //this function is about to be over
        //we remove thb changes that were made to the function
        maze[row][col] = true;
    }


    //to print all paths
    public static void printAllPath(String p,boolean[][] maze ,int row, int col,int[][] path, int step) {
        if (row == maze.length -1 && col ==  maze[0].length- 1) {
            System.out.println(p);
            path[row][col] = step;
            for(int[] arr:path){
                System.out.println(Arrays.toString(arr));
            }
            return;
        }
        if(!maze[row][col]){
            return;
        }
        maze[row][col] = false;
        path[row][col] = step;
        if (col < maze[0].length- 1) {
            printAllPath(p + "R",maze, row, col + 1,path,step+1);
        }
        if (row < maze.length -1) {
            printAllPath(p + "D",maze, row + 1, col,path,step+1);
        }
        if(row>0){
            //up
            printAllPath(p+"U", maze, row-1, col,path,step+1);
        }
        if(col>0){
            //left
            printAllPath(p+"L", maze, row, col-1,path,step+1);
        }
        //this function is about to be over
        //we remove thb changes that were made to the function
        maze[row][col] = true;
        path[row][col] = 0;


    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean[][] board = {
            {true,true,true},
            {true,true,true},
            {true,true,true},
        };
        int path[][] = new int[board.length][board[0].length];
        // printPath("", board, 0, 0);
        printAllPath("", board, 0, 0,path,1);

    }
}