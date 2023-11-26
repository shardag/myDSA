import java.util.List;
public class Solution {
    public static void printNtimes(int n){
        // Write your code here.
        help(n);
    }
    public static void help(int n){
        if(n==0){
            return;
        }
        System.out.print("Coding Ninjas"+" ");
        help(n-1);
    }
}
