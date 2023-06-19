import java.util.*;
class numberPyramid{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 5;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j <= n-i; j++) {
                System.out.print(' ');
            }
            for (int j = 1; j <= i*2+1; j++) {
                System.out.print(j%2==0?" ":i+1);
            }
            System.out.println();
        }
    }
}