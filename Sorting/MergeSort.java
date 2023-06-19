import java.lang.reflect.Array;
import java.util.*;

class MergeSort {

    public static int[] Sort(int arr[]) {
        if (arr.length == 1) {
            return arr;
        }
        int mid = arr.length / 2;
        int[] left = Sort(Arrays.copyOfRange(arr, 0, mid));
        int[] right = Sort(Arrays.copyOfRange(arr, mid, arr.length));

        return merge(left, right);
    }
    private static int[] merge(int[] left, int[] right) {
        int[] mix = new int[left.length + right.length];
        int lp = 0;
        int rp = 0;
        int count = 0;
        while (lp < left.length  && rp < right.length) {
            if (left[lp] < right[rp]) {
                mix[count++] = left[lp++];
            } else {
                mix[count++] = right[rp++];
            }
        }
        // remaining elements
        while (lp < left.length) {
            mix[count++] = left[lp++];
            
        }
        while (rp < right.length) {
            mix[count++] = right[rp++];
        }
        return mix;
    }


    public static void InPlaceSort(int arr[],int start, int end) {
        if (end-start == 1) {
            return;
        }
        int mid = (start+end) / 2;
        InPlaceSort(arr, start, mid);
        InPlaceSort(arr, mid, end);

        InMerge(arr,start,mid,end);
    }
    private static void InMerge(int[] arr, int start,int mid,int end) {
        int[] mix = new int[end-start];
        int lp = start;
        int rp = mid;
        int count = 0;
        while (lp < mid  && rp < end) {
            if (arr[lp] < arr[rp]) {
                mix[count++] = arr[lp++];
            } else {
                mix[count++] = arr[rp++];
            }
        }
        // remaining elements
        while (lp < mid) {
            mix[count++] = arr[lp++];
            
        }
        while (rp < end) {
            mix[count++] = arr[rp++];
        }
        for(int l = 0; l<mix.length;l++){
            arr[start+l] = mix[l];
        }
    }

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {5,2,13,41,31,3};
        arr = Sort(arr);
        System.out.println(Arrays.toString(arr));
        int[] arr1 = {5,2,13,41,31,3};
        InPlaceSort(arr1, 0, arr1.length);
        System.out.println(Arrays.toString(arr1));

    }
}