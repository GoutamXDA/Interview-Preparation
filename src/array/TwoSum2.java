package array;

import java.util.Arrays;

public class TwoSum2 {
	public static void main(String[] args) {

		int[] nums= {2,7,11,15};
		int target=1;
		System.out.println(Arrays.toString(twoSum(nums, target)));
	}
    public static int[] twoSum(int[] numbers, int target) {
    
    	int start=0;
    	int end=numbers.length-1;
    	
    	// time complexity O(n)
    	while (start<=end) {
			int sum=numbers[start]+numbers[end];
			
			if(sum>target) {
				end-=1;
			}
			else if(sum<target) {
				start+=1;
			}else {
				// space complexity O(1) no extra space is used
				return new int[] {start+1,end+1};
			}
		}
    	return new int[]{start+1,end+1};
    }
}
