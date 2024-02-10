package array;

public class ProductOfArrayExceptSelf {

	public static int arrayMaxConsecutiveSum(int[] inputArray) {
		int max_sum=inputArray[0];
		int current_sum=max_sum;
		for (int i = 1; i < inputArray.length; i++) {
			current_sum=Math.max(inputArray[i]+current_sum,inputArray[i]);
			max_sum=Math.max(current_sum, max_sum);
		}
		return max_sum;
	}
	public static void main(String[] args) {
		int[] nums= {1,4,6,8};
		int result=arrayMaxConsecutiveSum(nums);
		System.out.println(result);
		
	}
}
