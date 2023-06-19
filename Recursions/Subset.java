import java.util.*;
class Subset{
    public static void subsets(String s , String ans) {
        if(s.isEmpty()){
            System.out.println(ans);
            return;
        }
        subsets(s.substring(1),ans+s.charAt(0));
        subsets(s.substring(1), ans);
    }
    public static ArrayList<String> subsetss(String s , String ans) {

        if(s.isEmpty()){
            ArrayList<String> al = new ArrayList<>();
            al.add(ans);
            return al;
        }
        ArrayList<String> left = subsetss(s.substring(1),ans+s.charAt(0));
        ArrayList<String> right = subsetss(s.substring(1), ans);
        left.addAll(right);
        return left;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        subsets("abc", "");
        System.out.println(subsetss("abc", ""));
    }
}