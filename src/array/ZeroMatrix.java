package array;

public class ZeroMatrix {

	public static void main(String[] args) {
		int[][] matirx= {
				{1,2,3},
				{0,3,2},
				{1,2,3}
		};
		
		System.out.println("Before setZeros:");
		printMatrix(matirx);
		System.out.println("After setZeros:");
		setZeros(matirx);
		printMatrix(matirx);
	}

	public static void setZeros(int[][] matrix) {
		boolean[] row = new boolean[matrix.length];
		boolean[] column = new boolean[matrix[0].length];

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				if (matrix[i][j] == 0) {
					row[i] = true;
					column[j] = true;
				}
			}
		}

		for (int i = 0; i < row.length; i++) {
			if (row[i])
				rowSetZeros(matrix, i);
		}
		for (int i = 0; i < column.length; i++) {
			if (column[i])
				columnSetZeros(matrix, i);
		}
	}

	private static void columnSetZeros(int[][] matrix, int col) {

		for (int j = 0; j < matrix.length; j++) {
			matrix[j][col] = 0;
		}
	}

	private static void rowSetZeros(int[][] matrix, int row) {

		for (int j = 0; j < matrix[0].length; j++) {
			matrix[row][j] = 0;
		}
	}
	public static void printMatrix(int[][] matrix) {
		for (int[] row : matrix) {
			for (int cell : row) {
				System.out.print(cell+"");
			}
			System.out.println();
		}
	}
}
