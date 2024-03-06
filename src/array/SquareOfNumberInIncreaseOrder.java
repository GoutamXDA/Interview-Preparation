package array;

import java.util.Arrays;

public class SquareOfNumberInIncreaseOrder {

	public static void main(String[] args) {
		int[] arr = { 4, -1, 0, 3, 8, 5 };
		System.out.println(Arrays.toString(square(arr)));
	}

	public static int[] square(int[] arr) {
		int left=0;
		int right=arr.length-1;
		int[] result=new int[arr.length];
		for(int i=arr.length-1;i>=0;i--) {
			if(Math.abs(arr[left])>Math.abs(arr[right])) {
				result[i]=arr[left]*arr[left];
				left++;
			}
			else {
				result[i]=arr[right]*arr[right];
				right--;
			}
		}
		return result;
	}
}
