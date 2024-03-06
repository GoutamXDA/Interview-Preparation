package dp;

public class EqualSubsetSum {

	public static void main(String[] args) {
		int[] nums= {1,5,11,5};
		System.out.println(canPartition(nums));
	}
	 public static boolean canPartition(int[] nums) {
		 int sum=0;
		 int n=nums.length;
		 for (int i = 0; i < n; i++) {
			sum=sum+nums[i];
		}
		 if(sum%2!=0) return false;
		 else if (sum%2==0) return subsetSum(nums,sum/2,n);
		 return false;
	 }
	private static boolean subsetSum(int[] nums, int sum, int n) {
		boolean[][]t=new boolean[n+1][sum+1];
		for (int i = 0; i < n+1; i++) {
			for (int j = 0; j < sum+1; j++) {
				if(i==0) t[i][j]=false;
				if(j==0) t[i][j]=true;
				if(i>0 && j>0) {
					if(nums[i-1]<=j) {
						t[i][j]=t[i-1][j-nums[i-1]]||t[n-1][j];
					}
					else {
						t[i][j]=t[n-1][j];
					}
				}
			}
		}
		return t[n][sum];
	}
}
