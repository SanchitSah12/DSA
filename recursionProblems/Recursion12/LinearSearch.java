package recursionProblems.Recursion12;
import java.util.*;

class LinearSearch {
    public static boolean LinearSearchs(int[] arr, int index, int target) {
        if (index == arr.length) {
            return false;
        }
        return arr[index] == target || LinearSearchs(arr, index + 1, target);
    }

    public static int findIndex(int[] arr, int index, int target) {
        if (index == arr.length) {
            return -1;
        }
        if (arr[index] == target) {
            return index;
        } else
            return findIndex(arr, index + 1, target);
    }

    public static ArrayList<Integer> findAllIndex(int[] arr, int index, int target, ArrayList<Integer> al) {
        if (index == arr.length) {
            return al;
        }
        if (arr[index] == target) {
            al.add(index);
        }
        return findAllIndex(arr, index + 1, target,al);
    }

    public static ArrayList<Integer> findAllIndex2(int[] arr, int index, int target) {
        ArrayList<Integer> al = new ArrayList<>();

        if (index == arr.length) {
            return al;
        }
        if (arr[index] == target) {
            al.add(index);
        }

        ArrayList<Integer> ansFromBelow =  findAllIndex2(arr, index + 1, target);
        al.addAll( ansFromBelow);
        return al;

    }




    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = { 1, 2, 3, 4,4, 5 };
        ArrayList<Integer> al = new ArrayList<>();
        System.out.println(LinearSearchs(arr, 0, -1));
        System.out.println(findIndex(arr, 0, 1));
        // findAllIndex(arr, 0, 4, al);
        System.out.println(findAllIndex(arr, 0, 4, al));
        System.out.println(findAllIndex2(arr, 0, 4));
    }
}