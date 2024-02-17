package binarySearch;

public class FirstIndexByRecursion {

	public static void main(String[] args) {
		int[] nums= {1,1,2,3,3,40};
		int target=2;
		int firstIndexByRecursion = firstIndexByRecursion(nums, target, 0, nums.length-1);
		System.out.println(firstIndexByRecursion);
	}
	public static int firstIndexByRecursion(int[] nums,int target,int start,int end) {
		if(start>end) return -1;
		
		int mid=start+(end-start)/2;
		if(nums[mid]>target) {
			return firstIndexByRecursion(nums, target, start, mid-1);
		}
		else if(nums[mid]<target) {
			return firstIndexByRecursion(nums, target, mid+1, end);
		}
		else {
			if(mid==0 || nums[mid-1]!=nums[mid]) return mid;
			else {
				return firstIndexByRecursion(nums, target, start, mid-1);
			}
		}
		
	}
}
