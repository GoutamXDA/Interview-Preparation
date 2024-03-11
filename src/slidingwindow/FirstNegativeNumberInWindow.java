package slidingwindow;

import java.util.ArrayList;
import java.util.List;

public class FirstNegativeNumberInWindow {
	public static void main(String[] args) {
		int[] arr = { 12, -1, -7, 8, -15, 30, 16, 28 };
		int k = 3;
		List<Integer> result = findFirstNegative(arr, k);
		System.out.println("First negative number in every window of size " + k + ": " + result);
	}

	private static List<Integer> findFirstNegative(int[] arr, int k) {
		int i = 0, j = 0;
		List<Integer> result = new ArrayList<>();
		while (j < arr.length) {
			if (arr[j] < 0) {
				result.add(arr[j]);
			}
			if (j - i + 1 == k) {
				if (result.isEmpty()) {
					result.add(null); 
				} else if (arr[i] < 0) {
					result.remove(0); 
				}
				i++; // Move window forward
			}
			j++; // Slide window forward
		}
		return result;
	}

}
