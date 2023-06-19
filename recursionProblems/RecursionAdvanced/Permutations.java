import java.util.*;
class Permutations{

    public static void allPermuations(String str, String permutation) {
        if(str.length() == 0){
            System.out.println(permutation);
            return;
        }

        for(int i = 0; i< str.length();i++){
            char ch = str.charAt(i);
            //abc => bc if a is chosen
            // abc => ac if b is chosen            // str.substring => 0-0+ 1-str.length
            String newString = str.substring(0,i)+str.substring(i+1);
            allPermuations(newString, permutation+ch);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        allPermuations("abc", "");
    }
}