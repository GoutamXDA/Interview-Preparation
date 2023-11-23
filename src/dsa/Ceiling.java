package dsa;

public class Ceiling {

	public static void main(String[] args) {
		int[] nums= {1,3,5,6,9,10};
		int target=10;
		
		int indexOfCeilingNumber = ceilingNumber(nums,target);
		System.out.println(indexOfCeilingNumber);
	}

	public static int ceilingNumber(int[] nums, int target) {
		
		if(nums.length>nums[nums.length-1]) {
			return -1;
		}
		int start=0;
		int end=nums.length-1;
		
		while (start<=end) {
			int mid=start+(end-start)/2;
			if (nums[mid]>target) {
				end=mid-1;
			}
			else if (nums[mid]<target) {
				start=mid+1;
			}
			else {
				return mid;
			}
		}
		return start;
	}
}
