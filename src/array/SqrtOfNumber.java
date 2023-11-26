package array;

public class SqrtOfNumber {

	public static void main(String[] args) {
		int number=5;
		int result=getSquareRoot(number);
		System.out.println(result);
	}

	private static int getSquareRoot(int number) {

		int start=0;
		int end=number;
		int result=0;
		
		while (start<=end) {
			int mid=start+(end-start)/2;
			if (mid==number/mid) {
				return mid;
			}
			else if (mid<number/mid) {
				start=mid+1;
				result=mid;
			} else {
				end=mid-1;
			}
		}
		return result;
	}
}
