

import java.util.*;
class Maze{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(helper(3, 3));
        printPath("", 3, 3);
    }
    public static int helper(int row,int col) {
        if(row == 1 || col == 1){
            return 1;
        }
        int down  = helper(row-1, col);
        int right = helper(row, col-1);
        return down+right;
    }
    public static void printPath(String p ,int row,int col) {
        if(row == 1 && col == 1){
            System.out.println(p);
            return;
        }
        if(col>1){
            printPath(p+"R",row, col-1);

        }
        if(row>1){
            printPath(p+"D",row-1, col);
        }
    }
}