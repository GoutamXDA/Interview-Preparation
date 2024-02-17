package binarySearch;

public class RecursiveBinarySearch {

	public static void main(String[] args) {
		int[] nums= {1,4,10,23,39};
		int target=10;
		System.out.println(recusriveBinarySearch(nums, target, 0, nums.length-1));
		
	}
	public static int recusriveBinarySearch(int[] nums,int target,int start,int end) {
		if(start>end) return -1;
		int mid=start+(end-start)/2;
		
		if(nums[mid]==target) return mid;
		
		else if(nums[mid]>target) return recusriveBinarySearch(nums, target, start, mid-1);
		
		return recusriveBinarySearch(nums, target, mid+1, end);
	}
}
