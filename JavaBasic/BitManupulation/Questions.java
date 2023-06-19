import java.util.*;
class Questions{

    public static String toBinary(int n) {
        StringBuilder sb = new StringBuilder("");
        while(n>0){
            if(n%2==0){
                sb.insert(0, '0');

            }
            else{
                sb.insert(0,'1');
            }
            n = n/2;
        }
        return sb.toString();
    }
    public static int toDecimal(int n) {
        int ans = 0;int i = 0;
        while(n>0){
            ans = ans + n%10*(int)Math.pow(2,i++);
            n = n/10;
        }
        return ans;
    }

    public static int CountBinary1(int n) {
        int count = 0;
        while(n>0){
            if((n&1) == 1){
                count++;
            }
            n = n>>1;
        }
        return count;
    }
    public static Boolean Powerof2(int n) {
        return CountBinary1(n) == 1? true : false;
    }
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(toBinary(5));
        System.out.println(toDecimal(Integer.parseInt(toBinary(5))));
        System.out.println(CountBinary1(7));
        System.out.println(Powerof2(12));
        
    }
}