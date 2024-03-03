package striversheet;

public class PascalTriangle {

	public static int[][] pascalTriangle(int N) {
		int[][] triangle = new int[N][];

		for (int i = 0; i < N; i++) {
			triangle[i] = new int[i + 1];
			triangle[i][0] = 1;

			for (int j = 1; j < i; j++) {
				triangle[i][j] = triangle[i - 1][j - 1] + triangle[i - 1][j];
			}

			triangle[i][i] = 1;
		}

		return triangle;
	}

	public static void main(String[] args) {
		int N = 5; 

		int[][] result = pascalTriangle(N);

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < i + 1; j++) {
				System.out.print(result[i][j] + " ");
			}
			System.out.println();
		}
	}
}
