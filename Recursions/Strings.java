import java.util.*;
class Strings{

    public static void removeA(String str, String ans, int ind) {
        if(ind == str.length()){
            System.out.println(ans);
            return;
        }
        if(str.charAt(ind) != 'a'){
            ans += str.charAt(ind);
        }
        removeA(str, ans, ind+1);
    }
    public static String removeAinLine(String str) {
        
        if(str.length() == 0){
            // System.out.println(ans);
            return "";
        }
        // System.out.println(str);
        if(str.charAt(0) == 'a'){
            return removeAinLine(str.substring(1));
        }
        else{
            return str.charAt(0) + removeAinLine(str.substring(1));
        }
    }

    public static String removeApple(String str) {
        
        if(str.length() == 0){
            // System.out.println(ans);
            return "";
        }
        // System.out.println(str);
        if(str.startsWith("apple")){
            return removeApple(str.substring(5));
        }
        else{
            return str.charAt(0) + removeApple(str.substring(1));
        }
    }
    public static String removeApp(String str) {
        
        if(str.length() == 0){
            // System.out.println(ans);
            return "";
        }
        // System.out.println(str);
        if(str.startsWith("app") && !str.startsWith("apple")){
            return removeApp(str.substring(3));
        }
        else{
            return str.charAt(0) + removeApp(str.substring(1));
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        removeA("omaiwamosaaaaaaaaaaaasdsad", "", 0);
        System.out.println(removeAinLine("omaiwamosaaaaaaaaaaaasdsad"));
        System.out.println(removeApple("fapplefs"));
        System.out.println(removeApp("sapplepss"));
    }
}