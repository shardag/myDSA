public class Solution
{
    public static int[] printNos(int x) {
        // Write Your Code Here
        int arr[] = new int[x];
        help(x,x,arr);
        return arr;
    }
    public static void help(int ele,int x,int[] arr){
        if(ele == 0){
            return;
        }
        arr[x-ele] = ele;
        help(ele-1,x,arr);
    }
}
