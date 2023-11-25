package dsa;

public class SeachInMountain {
	public static void main(String[] args) {
		int[] nums = { 1, 2, 3, 4, 5, 3, 1 };
		int target = 3;
		int result = search(nums, target);
		System.out.println(result);

	}

	private static int search(int[] nums, int target) {
		int peak = findPeakIndex(nums);
		int firstTry = orderAgnostic(nums, target, 0, peak);
		if (firstTry != -1) {
			return firstTry;
		}
		return orderAgnostic(nums, target, peak + 1, nums.length - 1);
	}

	private static int orderAgnostic(int[] nums, int target, int start, int end) {
		boolean isAsc = nums[start] < nums[end];
		while (start <= end) {
			int mid = start + (end - start) / 2;
			if (nums[mid] == target) {
				return mid;
			}
			if (isAsc) {
				if (nums[mid] > target) {
					end = mid - 1;
				} else {
					start = mid + 1;
				}
			} else {
				if (nums[mid] > target) {
					start = mid + 1;
				} else {
					end = mid - 1;
				}
			}
		}
		return -1;
	}

	private static int findPeakIndex(int[] nums) {
		int start = 0;
		int end = nums.length - 1;

		while (start < end) {
			int mid = start + (end - start) / 2;
			if (nums[mid] > nums[mid + 1]) {
				end = mid;
			} else {
				start = mid + 1;
			}
		}
		return start;

	}
}
