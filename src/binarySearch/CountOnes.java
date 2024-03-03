package binarySearch;

public class CountOnes {

	public static void main(String[] args) {
		int[] nums= {0,0,0,1,1,1,1};
		int target=1;
		
		int counOne = counOne(nums, target);
		System.out.println(counOne);
	}
	public static int counOne(int[] nums,int target) {
		int firsIndex=findFirstIndex(nums,target);
		int lastIndex=nums.length-1;
		if(firsIndex!=-1) {
			return lastIndex-firsIndex+1;
		}
		return -1;
	}
	private static int findFirstIndex(int[] nums, int target ) {
		int start=0;
		int end=nums.length-1;
		int result=0;
		while(start<=end) {
			int mid=start+(end-start)/2;
			if(nums[mid]>target) {
				end=mid-1;
			}
			else if(nums[mid]<target) {
				start=mid+1;
			}else {
				result=mid;
				end=mid-1;
			}
		}
		return result;
	}
}
