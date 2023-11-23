package dsa;

import java.util.Arrays;

public class FirstAndLastIndex {

	public static void main(String[] args) {
		int[] nums = { 1, 3, 5, 6, 7, 7, 7, 7, 10 };
		int target = 7;

		int[] result = serachInRange(nums, target);
		System.out.println(Arrays.toString(result));
	}

	private static int[] serachInRange(int[] nums, int target) {
		int[] answer = { -1, -1 };
		answer[0] = search(nums, target, true);
		if (answer[0] != -1) {
			answer[1] = search(nums, target, false);
		}
		return answer;
	}

	private static int search(int[] nums, int target, boolean firstIndex) {
		int ans = -1;
		int start = 0;
		int end = nums.length - 1;

		while (start <= end) {
			int mid = start + (end - start) / 2;
			if (nums[mid] > target) {
				end = mid - 1;
			} else if (nums[mid] < target) {
				start = mid + 1;
			} else {
				ans = mid;
				if (firstIndex) {
					end = mid - 1;
				} else {
					start = mid + 1;
				}
			}
		}
		return ans;
	}
}
