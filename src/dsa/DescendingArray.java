package dsa;

public class DescendingArray {

	public static void main(String[] args) {
		int[] numbers= {20,19,17,14,12,9,6,3,1};
		int target=6;
		int result = serach(numbers,target);
		System.out.println(result);
	}

	private static int serach(int[] numbers, int target) {

		int start=0;
		int end=numbers.length-1;
		
	while (start<=end) {
		int mid=start+(end-start)/2;
		if (numbers[mid]==target) {
			return mid;
		}else if (numbers[mid]>target) {
			start=mid+1;
		}else {
			end=mid-1;
		}
	}
		return -1;
	}
}
