package IterativeSubset;
import java.util.*;
class IterativeSubset{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[]= { 1,2,3};
        List<List<Integer>> ans = subset(arr);
        for (List<Integer> list : ans) {
            System.out.println(list);
        }
    }

    public static List<List<Integer>> subset(int[] arr) {
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());
        for(int num:arr){
            int size=outer.size();
            for (int i = 0; i < size; i++) {
                List<Integer> internal = new ArrayList<>(outer.get(i));
                internal.add(num);
                outer.add(internal);
            }
        }
        return outer;
    }
}