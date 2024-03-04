package recursion;
// recusrive solutioin
public class Knapsack {

	public static void main(String[] args) {
		int[] wt = { 10, 20, 30 };
		int[] val = { 60, 100, 120 };
		int w = 50;
		int n = wt.length;
		
		System.out.println(maxProfit(wt, val, w, n));
	}

	public static int maxProfit(int[] wt, int[] val, int w, int n) {
		if(n==0 || w==0) return 0;
		if(wt[n-1]<=w) {
			return Math.max(val[n-1]+maxProfit(wt, val, w-wt[n-1], n-1), maxProfit(wt, val, w, n-1));
		}
		else {
			return maxProfit(wt, val, w, n-1);
		}
		
	}
}
