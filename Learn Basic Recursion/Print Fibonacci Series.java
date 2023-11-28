public class Solution {
    public static int[] generateFibonacciNumbers(int n) {
        // Write your code here.
        if(n == 1){
            int arr[] = new int[1];
            return arr;
        }
        if(n == 2){
            int arr[] = new int[2];
            arr[1] = 1;
            return arr;
        }
        int arr[] = new int[n];
        arr[1] = 1;
        help(arr,2);
        return arr;
    }
    public static void help(int[] arr,int index){
        if(index == arr.length){
            return;
        }
        arr[index] = arr[index-1] + arr[index-2];
        help(arr,index+1);
    }
}
