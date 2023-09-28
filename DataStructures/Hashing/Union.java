import java.util.HashSet;
import java.util.Set;

public class Union {

    public static void UnionArr(int[] arr1, int[] arr2) {
        Set<Integer> set = new HashSet<>();
        for (int ar : arr1) {
            set.add(ar);
        }
        for (int ar : arr2) {
            set.add(ar);
        }
        System.out.println(set.size());
    }

    public static int InterSection(int[] arr1, int[] arr2){
        Set<Integer> set = new HashSet<>();
        for (int  add : arr1){
            set.add(add);
        } 
        int count = 0;
        for (int b : arr2) {
            if(set.contains(b)){
                count++;
                set.remove(b);
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr1 = { 7, 3, 9 };
        int[] arr2 = { 6, 3, 9, 2, 9, 4 };
        UnionArr(arr1, arr2);
        System.out.println(InterSection(arr1, arr2));
    }
}
