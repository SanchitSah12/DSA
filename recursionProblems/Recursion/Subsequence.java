import java.util.*;
class Subsequence{
    public static void allSubsequences(String str, int idx ,String newString,HashSet<String> hs) {
        if(idx == str.length()){
            if(hs.contains(newString)){
                return;
            }
            System.out.println(newString);
            hs.add(newString);
            return;
        }
        char currChar = str.charAt(idx);
        // to be in next String
        allSubsequences(str, idx+1, newString+currChar,hs);
        // to not be in next String
        allSubsequences(str, idx+1, newString,hs);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashSet<String> hs = new HashSet<>();
        allSubsequences("aaaa", 0, "",hs);
    }
}