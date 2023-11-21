public class Solution {
    public static boolean palindromeNumber(int n){
        // Write your code here.
        int temp = 0;
        int num = n;
        while(num != 0){
            temp = temp*10 + num%10;
            num = num/10;
        }
        return temp == n;
    }
}
