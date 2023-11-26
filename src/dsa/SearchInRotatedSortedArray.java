package dsa;

public class SearchInRotatedSortedArray {

	public static void main(String[] args) {

		int[] nums = { 4, 5, 6, 7, 0, 1, 2 };
		int target = 0;
		// System.out.println(getPivot(nums));
		int result = search(nums, target);
		System.out.println(result);
	}

	public static int search(int[] nums, int target) {
		int pivot = getPivot(nums);

		if (pivot != -1) {
			if (nums[pivot] == target) {
				return pivot;
			}
			if (target >= nums[0]) {
				return binarySearch(nums, target, 0, pivot - 1);
			}
			return binarySearch(nums, target, pivot + 1, nums.length - 1);
		}

		return binarySearch(nums, target, 0, nums.length - 1);
	}

	

	private static int binarySearch(int[] nums, int target, int start, int end) {

		while (start <= end) {
			int mid = start + (end - start) / 2;
			if (nums[mid] > target) {
				end = mid - 1;
			} else if (nums[mid] < target) {
				start = mid + 1;
			} else {
				return mid;
			}
		}
		return -1;
	}

	public static int getPivot(int[] nums) {
		int start = 0;
		int end = nums.length - 1;

		while (start <= end) {
			int mid = start + (end - start) / 2;
			if (mid < end && nums[mid] > nums[mid + 1]) {
				return mid;
			}
			if (mid > start && nums[mid] < nums[mid - 1]) {
				return mid - 1;
			}
			if (nums[mid] <= nums[start]) {
				end = mid - 1;
			} else {
				start = mid + 1;
			}
		}
		return -1;
	}
}