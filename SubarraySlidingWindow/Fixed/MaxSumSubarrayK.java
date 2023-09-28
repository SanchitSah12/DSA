package SubarraySlidingWindow;

public class MaxSumSubarrayK {
    public static int maxSumOfSubarrayK(int[] arr,int k){
        int n = arr.length;
        int left = 0;
        int right = 0;
        int sum = 0;
        int max = 0;
        while (right<n){
            sum += arr[right];
            if(right-left +1 <k){
                right++;
            } else if (right-left +1 == k) {
                max = Math.max(sum,max);
                sum -= arr[left];
                left++;
                right++;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7};
        System.out.println(maxSumOfSubarrayK(arr,3));
    }
}
