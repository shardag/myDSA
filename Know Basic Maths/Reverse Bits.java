
public class Solution {
	public static long reverseBits(long n) {
		// Write your code here
		long arr[] = new long[32];
		int index = 31;
		while(n != 0){
			long rem = n%2;
			arr[index] = rem;
			n = n/2;
			index--;
		}
		int l=0;
		int r=31;
		while(l<r){
			long temp = arr[l];
			arr[l] = arr[r];
			arr[r] = temp;
			l++;
			r--;
		}
		long res = 0;
		for(int i=0;i<31;i++){
			res += arr[i]*(Math.pow(2,31-i));
		}
		return res;
	}
}
