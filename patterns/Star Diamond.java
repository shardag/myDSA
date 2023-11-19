public class Solution {
    public static void nStarDiamond(int n) {
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
        for(int i=1;i<=n;i++){
            //for spaces
            for(int j=1;j<i;j++){
                System.out.print(" ");
            }
            //first triangle
            for(int j=n;j>=i;j--){
                System.out.print("*");
            }
            //second triangle
            for(int j=n;j>i;j--){
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
// ***********
//  *********
//   *******
//    *****
//     ***
//      *
