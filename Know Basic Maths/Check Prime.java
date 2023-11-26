public class Solution {
	public static boolean isPrime(int num) {
		//Your code goes here
		if(num<=1){
			return false;
		}
		for(int i=2;i<Math.sqrt(num);i++){
			if(num%i == 0){
				return false;
			}
		}
		return true;
	}
}
