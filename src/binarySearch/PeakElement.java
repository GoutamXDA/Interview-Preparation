package binarySearch;

public class PeakElement {

	public static void main(String[] args) {
		int[] nums= {1,20,33,29,12,10,9};
		int findPeakElement = findPeakElement(nums);
		System.out.println(findPeakElement);
	}
	public static int findPeakElement(int[] nums) {
		int start=0;
		int end=nums.length-1;
		while(start<end) {
			int mid=start+(end-start)/2;
			if(nums[mid]>nums[mid+1]) {
				end=mid;
			}
			else {
				start=mid+1;
			}
		}
		return start;
	}
}
