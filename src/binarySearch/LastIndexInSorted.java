package binarySearch;

public class LastIndexInSorted {

	public static void main(String[] args) {
		int[] nums= {1,1,1,2,2,3};
		int target=1;
		int lastIndex = lastIndex(nums, target);
		System.out.println(lastIndex);
	}
	public static int lastIndex(int[] nums,int target) {
		int start=0;
		int end=nums.length-1;
		int result=-1;
		while(start<=end) {
			int mid=start+(end-start)/2;
			if(nums[mid]>target) {
				end=mid-1;
			}
			else if(nums[mid]<target) {
				start=mid+1;
			}
			else {
				result=mid;
				start=mid+1;
			}
		}
		return result;
	}
}
