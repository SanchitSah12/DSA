import java.util.*;
class BubbleSort{

    public static void swap(int[] arr , int i ,int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void Sort(int arr[],int r,int c) {
        if(r == 0){
            return;
        }
        if(c < r){
            if(arr[c]>arr[c+1]){
                swap(arr, c, c+1);
            }
            Sort(arr,r, c+1);
        }else{
            Sort (arr,r-1, 0);
        }
    }
    public static void print(int[] arr) {
        for (int i : arr) {
            System.out.println(i);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = {3,2,1,41,2};
        Sort(arr, arr.length-1, 0);
        print(arr);
    }
}