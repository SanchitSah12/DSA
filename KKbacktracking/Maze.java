import java.util.*;

class Maze {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(helper(3, 3));
        printPath("", 3, 3);
        System.out.println(printPathList("", 3, 3));
        System.out.println(printPathDiag ("", 3, 3));
        boolean[][] board = {
            {true,true,true},
            {true,false,true},
            {true,true,true},
        };
        printPathWithObstacle("", board, 0, 0);
    }

    public static int helper(int row, int col) {
        if (row == 1 || col == 1) {
            return 1;
        }
        int down = helper(row - 1, col);
        int right = helper(row, col - 1);
        return down + right;
    }

    public static void printPath(String p, int row, int col) {
        if (row == 1 && col == 1) {
            System.out.println(p);
            return;
        }
        if (col > 1) {
            printPath(p + "R", row, col - 1);
        }
        if (row > 1) {
            printPath(p + "D", row - 1, col);
        }
    }

    public static void printPathWithObstacle(String p,boolean[][] maze ,int row, int col) {
        if (row == maze.length -1 && col ==  maze[0].length- 1) {
            System.out.println(p);
            return;
        }
        if(!maze[row][col]){
            return;
        }
        if (col < maze[0].length- 1) {
            printPathWithObstacle(p + "R",maze, row, col + 1);
        }
        if (row < maze.length -1) {
            printPathWithObstacle(p + "D",maze, row + 1, col);
        }
    }


    public static ArrayList<String> printPathList(String p, int row, int col) {
        if (row == 1 && col == 1) {
            // System.out.println(p);
            ArrayList<String> al = new ArrayList<>();
            al.add(p);
            return al;
        }
        ArrayList<String> al = new ArrayList<>();
        //so that min value of col and row is 1
        if (col > 1) {
            al.addAll(printPathList(p + "R", row, col - 1));
        }
        if (row > 1) {
            al.addAll(printPathList(p + "D", row - 1, col));
        }
        return al;
    }
    public static ArrayList<String> printPathDiag(String p, int row, int col) {
        if (row == 1 && col == 1) {
            // System.out.println(p);
            ArrayList<String> al = new ArrayList<>();
            al.add(p);
            return al;
        }
        ArrayList<String> al = new ArrayList<>();
        //so that min value of col and row is 1
        if (col > 1) {
            al.addAll(printPathDiag(p + "R", row, col - 1));
        }
        if (row > 1) {
            al.addAll(printPathDiag(p + "D", row - 1, col));
        }
        if(row>1 && col>1){
            al.addAll(printPathDiag(p+"d", row-1, col-1));
        }
        return al;
    }
}