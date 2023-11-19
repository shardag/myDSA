public class Solution {
    public static void nStarTriangle(int n) {
        // Write your code here
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=1;i<n;i++){
            for(int j=i;j<n;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}


// if n ==  6
// *
// **
// ***
// ****
// *****
// ******
// *****
// ****
// ***
// **
// *
