import java.util.*;
class PhonePad{
    public static String keys[] = {"abc","def","ghi"};

    public static void helper(String p,String up) {
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char currChar = up.charAt(0);
        String currKey = keys[currChar-'0'];
        for(int i = 0; i<currKey.length();i++){
            helper(p+currKey.charAt(i), up.substring(1));
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        helper("", "12");
    }
}