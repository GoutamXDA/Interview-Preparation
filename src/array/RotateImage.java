package array;

import java.util.Arrays;

public class RotateImage {

	public static void main(String[] args) {
		int[][] matrix1 = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		int[][] matrix2 = { { 5, 1, 9, 11 }, { 2, 4, 8, 10 }, { 13, 3, 6, 7 }, { 15, 14, 12, 16 } };

		System.out.println("Original Matrix 1:");
		printMatrix(matrix1);
		rotate(matrix1);
		System.out.println("Rotated Matrix 1:");
		printMatrix(matrix1);
	}

	public static void rotate(int[][] matrix) {
		int n = matrix.length;
		for (int i = 0; i < n; i++) {
			for (int j = i; j < n; j++) {
				int temp = matrix[i][j];
				matrix[i][j] = matrix[j][i];
				matrix[j][i] = temp;
			}
		}

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n / 2; j++) {
				int temp = matrix[i][j];
				matrix[i][j] = matrix[i][n - 1 - j];
				matrix[i][n - 1 - j] = temp;
			}
		}
	}

	public static void printMatrix(int[][] matrix) {
		for (int[] row : matrix) {
			System.out.println(Arrays.toString(row));
		}
	}
}
