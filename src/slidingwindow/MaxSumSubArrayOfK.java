
public class MaxSumSubArrayOfK {

	public static void main(String[] args) {
		int[] arr = { 1,10,2,4,8,9};
		int k = 3;
		/*
		 * 1+10+2=13
		 * 10+2+4=16
		 * 2+4+8=14
		 * 4+8+9=21
		 * 
		 */
		// among all max is 21,
		System.out.println(maxSubArraySum(arr, k));
	}

	public static int maxSubArraySum(int[] nums, int k) {
	int sum=0, max=0,i=0,j=0;
	while(j<nums.length) {
		sum=sum+nums[j];
		if(j-i+1<k) {
			j++;
		}
		else if(j-i+1==k) {
			max=Math.max(max, sum);
			sum=sum-nums[i];
			i++;
			j++;
		}
	}
	return max;
	}
}
