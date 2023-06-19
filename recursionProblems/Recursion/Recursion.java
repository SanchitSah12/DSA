import java.util.*;

class Recursion {

    // public static void printNum(int n) {
    // if(n == 0){
    // return;
    // }
    // System.out.println(n);
    // printNum(n-1);
    // }
    // public static void printNums(int n) {
    // if(n == ){
    // return;
    // }
    // System.out.println(n);
    // printNums(n+1);
    // }
    public static void PrintSum(int i , int n , int sum) {
        if (i == n) {
            sum += i;
            System.out.println(sum);
            return;

        }
        sum += i ;
        
        PrintSum(i + 1, n ,sum);
    }

    public static int Factorial(int n) {
        if( n == 1){
            return 1;
        }
        int fact = n*Factorial(n-1);
        return fact;
    }


    public static void fibonacci(int n,int a ,int b) {
        if(n == 0){
            return;
        }
        int c = a+b;
        System.out.print(c+" ");
        fibonacci(n-1,b,c);
    }

    public static int powerOfN(int x,int n) { // stackheight n
        if(n == 0){
            return 1;

        }
        if(x == 0){
            return 0;
        }
        
        int xPown1 = powerOfN(x, n-1);
        int xPown = xPown1 * x;
        return xPown;
    }

    public static int logPowerOfN(int x,int n) {
        if(n == 0){
            return 1;

        }
        if(x == 0){
            return 0;
        }
        
        if(n%2 == 0){
            return logPowerOfN(x,n/2) * logPowerOfN(x, n/2);

        }
        else{
            return logPowerOfN(x, n/2) *  logPowerOfN(x, n/2)  * x; 
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // printNum(5);
        PrintSum(1,5,0);
        System.out.println(Factorial(5));

        System.out.print("0 1 ");
        int n = 10;
        fibonacci(n-2, 0, 1);
        System.out.println();
        System.out.println(powerOfN(5, 2));
        System.out.println(logPowerOfN(5, 4));
    }

}