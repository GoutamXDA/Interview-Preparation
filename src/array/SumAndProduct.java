package array;

public class SumAndProduct {

	public static void main(String[] args) {
		
		int[] array= {0,0,0,1,1};
		foo(array);
	}
	// time complexity of the below code is: O(n)
	
	// space complexity is O(1)
	public static void foo(int[] array) {
		int sum=0;
		int product=1;
		for (int i = 0; i < array.length; i++) {
			sum+=array[i];
		}
		for (int j = 0; j < array.length; j++) {
			product*=array[j];
		}
		System.out.println("sum:"+sum+" "+"product:"+product);
	}
}
