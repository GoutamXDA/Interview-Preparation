package binarySearch;

public class LastIndexByRecursion {

	public static void main(String[] args) {
		int[] nums= {1,1,1,2,3,4};
		int target=1;
		int lastIndex = lastIndex(nums, target, 0, nums.length-1);
		System.out.println(lastIndex);
		
	}
	public static int lastIndex(int[] nums,int target,int start,int end) {
		if(start>end) return -1;
		int mid=start+(end-start)/2;
		if(nums[mid]>target) {
			return lastIndex(nums, target, start, mid-1);
		}
		else if(nums[mid]<target) {
			return lastIndex(nums, target, mid+1, end);
		}
		else {
			if(mid==nums.length-1 || nums[mid+1]!=nums[mid]) return mid;
			else {
				return lastIndex(nums, target, mid+1, end);
			}
		}
	}
}
