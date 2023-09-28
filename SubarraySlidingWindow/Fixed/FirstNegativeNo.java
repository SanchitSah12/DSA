package SubarraySlidingWindow;

import java.util.ArrayList;
import java.util.List;

public class FirstNegativeNo {
    public static void firstNegative(int[] array, int k){
        int n = array.length;
        int left = 0;
        int right = 0;
        long []ans= new long[n-k+1];
        List<Integer> l = new ArrayList<>();

        while(right<n){
            if(array[right] < 0){
                l.add(array[right]);
            }
            if(right-left+1 < k){
                right++;
            }
            else if(right-left +1 == k){ //yaha answer milega
                if(l.isEmpty()){
                    System.out.println("0");
//                    ans.add(0);
                }
                else{
                    System.out.println(l.get(0));
//                    ans.add(l.get(0));
                    if(array[left] <0 ){
                        l.remove(0);
                    }
                }

                left++;
                right++;
            }
        }


    }

    public static void main(String[] args) {
        int arr[] = {12,-1,-7,8,-15,30,16,21};
        firstNegative(arr,3);
    }
}
