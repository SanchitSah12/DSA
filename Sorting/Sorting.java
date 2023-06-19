import java.util.*;


class Sorting {
    public static void PrintArr(int[] arr, String S) {
        System.out.print(S + " " );

        for (int i : arr) {
            System.out.print(i + " " );
        }
    }

    public static void BubbleSort(int[] arr) { // 0(n^2)
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        PrintArr(arr,getCallerMethodName());
    }

    public static void SelectionSort(int[] arr) { // o(n2)
        for (int i = 0; i < arr.length - 1; i++) {
            int smallest = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[smallest]) {
                    smallest = j;
                }
            }
            // swap
            int temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = temp;
        }
        PrintArr(arr,getCallerMethodName());
    }

    private static String getCallerMethodName() {
        return StackWalker.getInstance().walk(stream -> stream.skip(1).findFirst().get()).getMethodName();
    }

    public static void InsertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int current = arr[i];
            int j  = i-1;
            while( j>=0 && current < arr[j]){
                arr[j+1] = arr[j];
                j--;
            }

            //placement
            arr[j+1] = current;
        }
        PrintArr(arr, getCallerMethodName());
    }

    public static void main(String[] args) {

        int arr[] = { 7, 8, 3, 1, 2 };

        // bubble Sort
        BubbleSort(arr);
        System.out.println();
        SelectionSort(arr);
        InsertionSort(arr);

    }
}