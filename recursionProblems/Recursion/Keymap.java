import java.util.*;
class Keymap{


    public static String[] keys = {".","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"," "};
    public static void KeypadMap(String str,int idx,String combination) {
        if(idx == str.length()){
            System.out.println(combination);
            return;
        }
        int currChar = str.charAt(idx);
        String mapping = keys[currChar-'0'];

        for(int i= 0; i<mapping.length();i++){
            KeypadMap(str, idx+1, combination+mapping.charAt(i));
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        KeypadMap("345", 0, "");
    }
}