package binarySearch;

public class IterativeBinarySearch {

	public static void main(String[] args) {
		
		int[] nums= {1,2,5,10,23};
		int target=23;
		System.out.println(binarySearch(nums, target));
	}
	public static int binarySearch(int[] nums,int target) {
		int start=0;
		int end=nums.length;
		
		while (start<=end) {
			
			int mid=start+(end-start)/2;
			if(nums[mid]>target) {
				end=mid-1;
			}
			else if(nums[mid]<target) {
				start=mid+1;
			}
			else {
				return mid;
			}
		}
		return -1;
	}
}
