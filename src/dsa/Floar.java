package dsa;

public class Floar {

	public static void main(String[] args) {
		int[] nums= {1,4,5,9,12,14,15};
		int target=7;
		int floarOfNumberIndex = floarOfNumber(nums,target);
		System.out.println(floarOfNumberIndex);
	}

	public static int floarOfNumber(int[] nums,int target) {
		int start=0;
		int end=nums.length-1;
		
		while(start<=end) {
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
		return end;
	}
}
