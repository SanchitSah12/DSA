import java.util.*;
class Manyfunc{
    public static void Average(int a,int b, int c) {
        System.out.println((a+b+c/3));
    }
    public static void OddNumbers(int n) {
        for (int i = 0; i < n; i++) {
            if(i%2!=0){
                System.out.println(i);
            }
        }
    }
    public static int GreaterThan(int a,int b) {
        return a>b?a:b;
    }
    public static double Circumference(double rad) {
        return (Math.PI*2*rad);
    }
    private static Boolean AbleToVote(int age) {
        return age>18?true:false;
    }
    public static void PrintNumbers(int n) {
        int pos = 0;int neg = 0; int zero = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the n numbers");
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            if(a > 0) pos++; else if(a == 0) zero++; else neg++;

        }
        System.out.println("Zero "+ zero + " posi " + pos+" negi "+neg);
    }
    public static double Power(double a ,double b) {
        return Math.pow(a, b);
    }

    private static int GCD(int a,int b) {
        int gcd = 0;
        for(int i = 1; i <(b); i++){
            if(a%i==0 && b%i==0){
                gcd = i;
            }
        }
        return gcd;
    }

    private static void fibonacchi(int n) {
        System.out.println(0 + '\n' + 1);
        int first = 0;
        int prev = 1;
        for (int i = 0; i < n; i++) {
            System.out.println(first+prev);
            first = prev;
            prev = first + prev;
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(GCD(55, 12));
        fibonacchi(10);
    }
}