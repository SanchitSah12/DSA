import java.util.*;
class QuickSort{
    public static void sort(int[] arr, int low, int high) {
        if(low>=high){
            return;
        }
        int s = low;
        int e = high;
        int m = s+(e-s)/2;
        int pivot = arr[m];
        while(s<=e){ 
            // why if it is already sorted it will not sort
            while(arr[s]< pivot){
                s++;
            }
            while(arr[e]>pivot){
                e--;
            }
            if(s<=e){
                int temp = arr[s];
                arr[s] = arr[e];
                arr[e]=temp;
                s++;
                e--;

            }
        }
        sort(arr, low, e);
        sort(arr, s, high);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr ={5,4,3,2,1};
        sort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
    }
}