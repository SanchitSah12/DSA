import java.util.*;
class GetBit{
    public static void getBit(int pos, int n){
        int mask = 1 << pos-1;
        int ans = n&mask;
        System.out.println(ans==0?0:1);
    }
    private static void setBit(int pos, int n) {
        int mask = 1<<pos-1;
        int ans = n|mask;
        System.out.println(ans);
    }
    public static void clearBit(int pos,int n) {
        int mask = 1<<pos-1;
        int ans = n&(~mask);
        System.out.println(ans);
    }
    public static void updateBit(int pos,int n) {
        int mask = 1<<pos-1;
        int ans = n^mask;
        System.out.println(ans);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        getBit(3, 5);
        setBit(2, 5);
        clearBit(3,5);
    }
}