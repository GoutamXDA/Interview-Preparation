package array;

import java.util.Arrays;
import java.util.HashSet;

public class ContainsDuplicate {

	public static void main(String[] args) {
		int[] nums= {2,3,4,5,2};
		boolean checkForDuplicate=checkDuplicate(nums);
		System.out.println(checkForDuplicate);
		
		System.out.println(checkDuplicate2(nums));
	}
	public static boolean checkDuplicate(int[] nums) {
		// space complexity O(n)
		HashSet<Integer> set=new HashSet<Integer>();
		// time complexity O(n)
		for (int i = 0; i < nums.length; i++) {
			//work O(1)
			if(set.contains(nums[i])) return true;
			set.add(nums[i]);
		}
		return false;
	}
public static boolean checkDuplicate2(int[] nums) {
	//space complexity O(1) no extra space needed
	//time compexity O(nlogn) for sort
	Arrays.sort(nums);
	// time complexity on for loop O(n)
	for (int i = 0; i < nums.length-1; i++) {
		if(nums[i]==nums[i+1]) return true;
	}
	return false;
}
// for over all time complexity is O(nlogn)
}
