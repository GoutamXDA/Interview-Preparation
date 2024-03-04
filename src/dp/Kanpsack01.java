package dp;

public class Kanpsack01 {
	static int[][] t = new int[102][1002];

	public static void main(String[] args) {

		for (int i = 0; i < t.length; i++) {
			for (int j = 0; j < t[0].length; j++) {
				t[i][j] = -1;
			}
		}
		int[] wt = { 10, 20, 30 };
		int[] val = { 60, 100, 120 };
		int w = 50;
		int n = wt.length;
		System.out.println(knapsack(wt, val, w, n));
	}

	public static int knapsack(int[] wt, int[] val, int w, int n) {
		if (n == 0 || w == 0)
			return 0;

		if (t[n][w] != -1)
			return t[n][w];

		if (wt[n - 1] <= w) {
			t[n][w] = Math.max(val[n - 1] + knapsack(wt, val, w - wt[n - 1], n - 1), knapsack(wt, val, w, n - 1));
		} else {
			t[n][w] = knapsack(wt, val, w, n - 1);
		}

		return t[n][w];
	}
}
