package dsa;

public class BinarySearch {

	public static void main(String[] args) {
		int[] nums= {1,3,5,6,8,10};
		int target=10;
		int index = binarySearch(nums,target);
		System.out.println(index);
	}

	public static int binarySearch(int[] nums,int target) {

		int start=0;
		int end=nums.length-1;
		
		while (start<=end) {
			int mid=start+(end-start)/2;
			if(nums[mid]>target) {
				end=mid-1;
			}
			if (nums[mid]<target) {
				start=mid+1;
			} else {
				return mid;
			}
		}
		return -1;
	}
}
