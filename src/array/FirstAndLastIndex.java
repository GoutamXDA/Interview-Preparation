package array;

import java.util.Arrays;

public class FirstAndLastIndex {

	public static void main(String[] args) {
		int[] nums = { 5, 7, 7, 8, 8, 10 };
		int target = 10;
		int[] result = new int[2];
		result[0] = search(nums, target, true);
		if (result[0] != -1) {
			result[1] = search(nums, target, false);
		} else {
			result[1] = -1;
		}
		System.out.println(Arrays.toString(result));
	}

	private static int search(int[] nums, int target, boolean firstIndex) {
		int ans = -1;
		int start = 0;
		int end = nums.length - 1;

		while (start <= end) {
			int midpoint = start + (end - start) / 2;
			if (nums[midpoint] < target) {
				start = midpoint + 1;
			} else if (nums[midpoint] > target) {
				end = midpoint - 1;
			} else {
				ans = midpoint;
				if (firstIndex) {
					end = midpoint - 1;
				} else {
					start = midpoint + 1;
				}
			}
		}
		return ans;
	}
}
