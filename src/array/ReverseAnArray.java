package array;

import java.util.Arrays;

public class ReverseAnArray {

	public static void main(String[] args) {
		int[] array= {1,2,3,4};
		System.out.println(Arrays.toString(array));
		reverse(array);
		System.out.println(Arrays.toString(array));
	}
	public static void reverse(int[] array) {
		for (int i = 0; i < array.length/2; i++) {
			int other=array.length-i-1;
			int temp=array[i];;
			array[i]=array[other];
			array[other]=temp;
		}
		/*
		 * for (int i = 0; i < array.length; i++) { System.out.println(array[i]); }
		 */
	}
}
