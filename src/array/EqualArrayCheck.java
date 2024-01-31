package array;
/*
 * Check if two arrays are equal or not
 */

/*
 * Given two arrays A and B of equal size N, 
 * the task is to find if given arrays are equal or not. 
 * Two arrays are said to be equal if both of them contain same set of elements, arrangements (or permutation) of elements may be different though.
Note : If there are repetitions, then counts of repeated elements must also be same for two array to be equal.
 */
/*
 * N = 5
A[] = {1,2,5,4,0}
B[] = {2,4,5,0,1}
Output: 1
Explanation: Both the array can be 
rearranged to {0,1,2,4,5}

Example 2:

Input:
N = 3
A[] = {1,2,5}
B[] = {2,4,15}
Output: 0
Explanation: A[] and B[] have only 
one common value.
 */

import java.util.Arrays;

public class EqualArrayCheck {
	public static void main(String[] args) {
		Long[] A = { 1L, 2L, 5L, 4L, 0L };

		Long[] B = { 2L, 4L, 5L, 0L, 9L };
		int N = 5;
		boolean isEqual = checkEqual(A, B, N);
		System.out.println(isEqual);
	}

	private static boolean checkEqual(Long[] a, Long[] b, int n) {
		if (a.length != b.length)
			return false;

		Arrays.sort(a);
		Arrays.sort(b);

		for (int i = 0; i < n; i++) {
			if (a[i] != b[i])
				return false;
		}
		return true;
	}

}
