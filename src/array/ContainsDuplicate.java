package array;

import java.util.HashSet;

public class ContainsDuplicate {

	public static void main(String[] args) {
		int[] nums= {2,3,4,5,2};
		boolean checkForDuplicate=checkDuplicate(nums);
		System.out.println(checkForDuplicate);
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
}
