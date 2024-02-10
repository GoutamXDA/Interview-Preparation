package array;

public class UnOrderdPairs {

	public static void main(String[] args) {
		
		int[] array= {1,2,3,4};
		printUnorderdPairs(array);
	}
	//inner loop starts at i+1
	// time complexity O(n^2)
	// space complexity O(1)
	public static void printUnorderdPairs(int[]array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = i+1; j < array.length; j++) {
				System.out.println(array[i]+","+array[j]);
			}
		}
	}
}
