package array;

public class IndexOfLargest {

	public static void main(String[] args) {
		int[] arr = { 5, 10, 0, 20, 15 };
		int ans = findLargestElement(arr);
		System.out.println(ans);
		int largestIndex=findLargestElementIndex(arr);
		System.out.println(largestIndex);
	}

	private static int findLargestElementIndex(int[] arr) {
		if(arr.length<1) return 0;
		int index=0;
		for(int i=1;i<arr.length;i++) {
			if(arr[i]>arr[index]) index=i;
		}
		return index;
	}

	public static int findLargestElement(int[] arr) {
		int largest = arr[0];

		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > largest) {
				largest = arr[i];
			}
		}

		return largest;
	}
}
