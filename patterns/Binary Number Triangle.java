public class Solution {
    public static void nBinaryTriangle(int n) {
        // Write your code here.
        for(int i=1;i<=n;i++){
            if(i%2==0){
                for(int j=1;j<=i;j++){
                    if(j%2==0){
                        System.out.print(1+" ");
                    }else{
                        System.out.print(0+" ");
                    }
                }
            }else{
                for(int j=1;j<=i;j++){
                    if(j%2==0){
                        System.out.print(0+" ");
                    }else{
                        System.out.print(1+" ");
                    }
                }
            }
            System.out.println();
        }
    }
}



// if n == 6
// 1 
// 0 1 
// 1 0 1 
// 0 1 0 1 
// 1 0 1 0 1 
// 0 1 0 1 0 1 
