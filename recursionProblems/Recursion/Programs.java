import java.util.*;
class Programs{
    public static void FirstLast(String s,char element, int first,int last,int idx) {
        if(idx == s.length()){
            System.out.println("First "+first+ " lAST " + last);
            return ;
        }
        if(s.charAt(idx ) == element){
            if(first == -1){
                first = idx;

            }
            else{
                last = idx;
            }
        }
        FirstLast(s,element,first,last,idx+1);
    }

    public static boolean CheckArray(int arr[],int idx) {
        if(idx == arr.length-1){
            return true;
        }
        if(arr[idx]> arr[idx+1]){
            return false;
        }
        
        return CheckArray(arr, idx+1);
    }

    public static String MoveX(String s, int count, String newStr, int idx) {
        if(idx == s.length()){
            for(int i = 0;i<count; i++){
                newStr+="x";
            }
            return newStr;
        }
        if(s.charAt(idx) == 'x'){
            count++;
        }
        else{
            newStr += s.charAt(idx); 
        }
        return MoveX(s, count, newStr, idx+1);
// O(n+count)
// o(2n) = > o(n)
}

public static boolean[] map = new boolean[26];
public static void removeDuplicates(String str, int idx , String newStr) {
    if(idx == str.length()){
        System.out.println(newStr);
        return;
    }
    char currChar = str.charAt(idx);
    
    if(map[currChar - 'a'] == false){
        newStr+=currChar;
        map[currChar-'a'] = true;
    }
    removeDuplicates(str, idx+1, newStr);
    // O(n)
}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {4, 2, 1, 4,5};
        FirstLast("sanchitsah", 's', -1, -1, 0);
        System.out.println(CheckArray(arr, 0));
        System.out.println(MoveX("xxxxxxxxxxxxxSparda", 0, "", 0));
        removeDuplicates("sanchitsah", 0, "");
    }
}