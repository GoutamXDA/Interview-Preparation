package array;

import java.util.Arrays;

public class RotateMatrix {

	public static void main(String[] args) {
		int[][] matrix1 = { { 1, 2, 3 }, 
							{ 4, 5, 6 }, 
							{ 7, 8, 9 } };

		int[][] matrix2 = { { 5, 1, 9, 11 }, 
							{ 2, 4, 8, 10 }, 
							{ 13, 3, 6, 7 }, 
							{ 15, 14, 12, 16 } };

		System.out.println("Original Matrix 1:");
		printMatrix(matrix1);
		rotate(matrix1);
		System.out.println("Rotated Matrix 1:");
		printMatrix(matrix1);

		System.out.println("Original Matrix 2:");
		printMatrix(matrix2);
		rotate(matrix2);
		System.out.println("Rotated Matrix 2:");
		printMatrix(matrix2);
	}

	public static boolean rotate(int[][] matrix) {
		if (matrix.length == 0 || matrix.length != matrix[0].length)
			return false;

		int n = matrix.length;

		for (int i = 0; i < n / 2; i++) {
			int first = i;
			int last = n - 1 - i;

			for (int j = first; j < last; j++) {
				int offset = j - first;
				int top = matrix[first][j];

				matrix[first][j] = matrix[last - offset][first];
				matrix[last - offset][first] = matrix[last][last - offset];
				matrix[last][last - offset] = matrix[j][last];
				matrix[j][last] = top;
			}
		}
		return true;
	}

	private static void printMatrix(int[][] matrix) {
		for (int[] row : matrix) {
			System.out.println(Arrays.toString(row));
		}
		System.out.println();
	}
}
