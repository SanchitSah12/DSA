import java.util.*;
class Reverse{
    public static void StringRev(int idx , String s) {
        if(idx == 0){
            System.out.print(s.charAt(idx));

            return;
        }

        System.out.print(s.charAt(idx));
        StringRev(idx-1, s);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = "Super";
        StringRev(s.length()-1, s);
    }
}