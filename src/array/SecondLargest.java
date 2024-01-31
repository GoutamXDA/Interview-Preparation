package array;

import java.util.Arrays;

public class SecondLargest {
	public static void main(String[] args) {
		int[] arr = { 10, 2, -1, 0, 12 };
		int result = findSecondLargestElement(arr);
		System.out.println(result);
	}

	public static int findSecondLargestElement(int[] arr) {
		Arrays.sort(arr);

		if (arr[0] == arr[arr.length - 1]) {
			return -1;
		}

		int largest = Integer.MIN_VALUE;
		int secondLargest = Integer.MIN_VALUE;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > largest) {
				secondLargest = largest;
				largest = arr[i];
			}
			else if (arr[i] > secondLargest && arr[i] != largest) {
				secondLargest = arr[i];
			}
		}

		return secondLargest;
	}
}
