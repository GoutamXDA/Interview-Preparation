package array;

import java.util.Arrays;

public class TwoSum2 {
	public static void main(String[] args) {

		int[] nums = { 2, 7, 11, 15 };
		int target = 9;
		System.out.println(Arrays.toString(twoSum(nums, target)));
	}

	public static int[] twoSum(int[] numbers, int target) {

		int aPointet = 0;
		int bPointer = numbers.length - 1;
// timecomplexity O(n)
		while (aPointet <= bPointer) {
// space complexity is O(1)			
			int sum = numbers[aPointet] + numbers[bPointer];
			if (sum > target) {
				bPointer -= 1;
			} else if (sum < target) {
				aPointet += 1;
			} else {
				return new int[] { aPointet + 1, bPointer + 1 };
			}
		}
		return new int[] { aPointet + 1, bPointer + 1 };
	}
}