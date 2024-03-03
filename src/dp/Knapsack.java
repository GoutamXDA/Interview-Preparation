package dp;
public class Knapsack {

	public static void main(String[] args) {
		int[] w = { 10, 20, 30 };
		int[] val = { 60, 100, 120 };
		int capacity = 50;
		int n = w.length;
		
		System.out.println(maxProfit(w, val, capacity, n));
	}

	public static int maxProfit(int[] w, int[] val, int cap, int n) {
		if(n==0 || cap==0) return 0;
		if(w[n-1]<=cap) {
			return Math.max(val[n-1]+ maxProfit(w, val, cap-w[n-1], n-1),maxProfit(w, val, cap, n-1));
		}
		else return maxProfit(w, val, cap, n-1);
		
	}
}
