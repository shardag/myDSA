import java.util.*;
public class Solution {
    
    public static void main(String[] args) {
        // Write your code here
        Scanner s = new Scanner(System.in);
        String str = s.next();
        int ascci = (int)str.charAt(0);
        if(ascci>=97 && ascci <123){
            System.out.println(0);
        }else if(ascci>=65 && ascci<91){
            System.out.println(1);
        }else{
            System.out.println(-1);
        }
    }
}
