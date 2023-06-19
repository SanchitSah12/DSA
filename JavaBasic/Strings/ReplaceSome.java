import java.util.*;
class ReplaceSome{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String st = sc.nextLine();
        int  a = st.indexOf("@");
        String st1 = st.substring(a+1);
        System.out.println(st1);
    }
}