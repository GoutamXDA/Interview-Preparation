package binarySearch;

public class FIrstOccuranceInSoreted {

	public static void main(String[] args) {
		int[] nums= {1,3,3,3,4,10,13};
		int target=3;
		System.out.println(firstIndex(nums, target));
		
	}
	public static int firstIndex(int[] nums,int target) {
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
				end=mid-1;
			}
		}
		return result;
	}
}
