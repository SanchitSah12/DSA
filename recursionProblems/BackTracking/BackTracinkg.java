import java.util.*;
class BackTracinkg{
    public static void printPermutation(String str, String permutation, int idx) {
        // System.out.println(permutation +" "+  str+ " "+ idx);
        if(str.length() == 0){
            System.out.println(permutation);
            return;
        }
        for (int i = 0; i<str.length() ; i++) {
            char currChar = str.charAt(i);
            String newStr = str.substring(0,i) + str.substring(i+1);
            
            printPermutation(newStr, permutation+currChar, idx+1);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = "ABC";
        printPermutation(str, "", 0);
    }
}