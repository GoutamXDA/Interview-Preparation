package binarySearch;

public class CountOccurance {

	public static void main(String[] args) {
		int[] nums = { 1, 2, 3, 4, 5, 5 };
		int target = 123;
		int countElmenet = countElmenet(nums, target);
		System.out.println(countElmenet);
	}

	public static int countElmenet(int[] nums, int target) {
		int firstIndex=firstIndex(nums,target,true);
		int lastIndex=firstIndex(nums,target,false);
		if (firstIndex == -1) {
			return 0;
		}
		return lastIndex - firstIndex + 1;

	}

	private static int firstIndex(int[] nums, int target, boolean firstIndex) {
		int start=0;
		int end=nums.length-1;
		int result=-1;
		while (start<=end) {
			int mid=start+(end-start)/2;
			if(nums[mid]>target) {
				end=mid-1;
			}
			else if(nums[mid]<target) {
				start=mid+1;
			}
			else {
				result=mid;
				if(firstIndex) {
					end=mid-1;
				}else {
					start=mid+1;
				}
			}
		}
		return result;
	}
}
