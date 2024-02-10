package array;

public class PrintPairs {

	public static void main(String[] args) {
		int[] array= {1,2,3,4};
		pairs(array);
	}
	// nested loop so time complexity is O(n^2)
	// space complexity is O(1)
	public static void pairs(int[] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				System.out.println(array[i] +","+array[j]);
			}
		}
	}
}
