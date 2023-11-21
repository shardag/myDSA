public class Solution {
    public static int calcGCD(int n, int m){
        // Write your code here.
        while(m!=0){
            int rem = n%m;
            n = m;
            m = rem;
        }
        return n;
    }
}
