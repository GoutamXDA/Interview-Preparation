package array;

public class SqrtOfNumber {

	public static void main(String[] args) {
		System.out.println(mySqrt(225));
	}
	public static int mySqrt(int n) {
		if(n==0 ||n==1) return n;
		int start=0;
		int end=n;
		int result=0;
		while (start<=end) {
			int mid=start+(end-start)/2;
			if(mid==n/mid) return mid;
			else if(mid<n/mid) {
				start=mid+1;
				result=mid;
			}else {
				end=mid-1;
			}
		}
		return result;
	}
}
