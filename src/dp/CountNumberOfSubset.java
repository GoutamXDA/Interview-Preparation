package dp;

public class CountNumberOfSubset {

	public static void main(String[] args) {
		int[] arr= {2,3,5,6,8,10};
		int sum=10;
		System.out.println(countSubset(arr, sum));
	}
	public static int countSubset(int[] arr,int sum) {
		int n=arr.length;
		int[][] t=new int[n+1][sum+1];
		for(int i=0;i<n+1;i++) {
			for(int j=0;j<sum+1;j++) {
				if(i==0) t[i][j]=0;
				if(j==0) t[i][j]=1;
				if(i>0 && j>0) {
					if(arr[i-1]<=j) {
						t[i][j]=t[i-1][j-arr[i-1]]+t[i-1][j];
					}else {
						t[i][j]=t[i-1][j];
					}
				}
			}
		}
		return t[n][sum];
	}
}
