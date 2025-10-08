package dp;

public class KnapsackZeroOne {
    public static void main(String[] args) {
        int[] wt  = {10, 20, 30};
        int[] val = {60, 100, 120};
        int W = 50;
        int n = wt.length;
        System.out.println("Max value = " + knapsack(wt, val, W, n)); // prints 220
    }
    public static int knapsack(int[] wt, int [] val, int w , int n){
        if(n==0 || w==0) return 0;
        if(wt[n-1] <= w){
            return Math.max(val[n-1]+ knapsack(wt,val,w-wt[n-1],n-1), knapsack(wt,val,w,n-1));
        }
        else
            return knapsack(wt,val,w,n-1);
    }
}
