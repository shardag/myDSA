public class Solution {
    public static void nStarTriangle(int n) {
        // Write your code here
        for(int i=1;i<=n;i++){
            int j = 1;
            for(j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            while(j<=n){
                System.out.print("*");
                j++;
            }
            for(int k=1;k<i;k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

// if n == 6
//      *
//     ***
//    *****
//   *******
//  *********
// ***********
