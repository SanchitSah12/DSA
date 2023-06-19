package recursionProblems.Recursion12;
import java.util.*;
class Recursion1{
    public static boolean  isSorted(int[] arr, int ind) {
        if(ind == arr.length-1){
            return true;
        }
        return arr[ind]<arr[ind+1] && isSorted(arr, ind+1);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = {1,2,4,5,4};
        System.out.println(isSorted(arr, 0));
    }
}