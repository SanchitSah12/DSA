import java.util.*;
class Diamond{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 4;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n-i; j++) {
                System.out.print(' ');

            }
            for (int j = 0; j < 2*i+1; j++) {
                System.out.print('*');
            }
            System.out.println();
        }
        for (int i = n-1; i >= 0; i--) {
            for (int j = 0; j < n-i; j++) {
                System.out.print(' ');

            }
            for (int j = 0; j < 2*i+1; j++) {
                System.out.print('*');
            }
            System.out.println();
        }
    }
}