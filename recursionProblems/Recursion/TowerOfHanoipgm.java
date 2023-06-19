import java.util.*;

class TowerOfHanoipgm {
    public static void TowerOfHanoi(int n, String src, String helper, String dest) {
        if (n == 1) {
            System.out.println("Tranfer disk " + n + " from " + src + " to " + dest);
            return;
        }
        TowerOfHanoi(n - 1, src, dest, helper);
        System.out.println("Tranfer disk " + n + " from " + src + " to " + dest);
        TowerOfHanoi(n - 1, helper, src, dest);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 3;
        TowerOfHanoi(n, "S", "H", "D");
    }
}