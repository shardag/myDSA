public class Solution {
    public static void symmetry(int n) {
        // Write your code here
        for(int i=1;i<=n;i++){
            for(int j=i;j<=n;j++){
                System.out.print("* ");
            }
            for(int j=1;j<i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<i;j++){
                System.out.print(" ");
            }
            for(int j=i;j<=n;j++){
                System.out.print("* ");
            }
            
            System.out.println();
        }
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            for(int j=n;j>i;j--){
                System.out.print(" ");
            }
            for(int j=i;j<n;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}


// * * * * * * * * * * * * * * 
// * * * * * *     * * * * * * 
// * * * * *         * * * * * 
// * * * *             * * * * 
// * * *                 * * * 
// * *                     * * 
// *                         * 
// *                         * 
// * *                     * * 
// * * *                 * * * 
// * * * *             * * * * 
// * * * * *         * * * * * 
// * * * * * *     * * * * * * 
// * * * * * * * * * * * * * * 
