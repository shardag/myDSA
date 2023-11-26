public class Solution {
    public static int[] printNos(int x) {
        // Write Your Code Here
        int arr[] = new int[x];
        help(arr,1,x);
        return arr;
    }
    public static void help(int[] arr,int index,int ele){
        if(index>ele){
            return;
        }
        arr[index-1] = index;
        help(arr,index+1,ele);
    }
}
