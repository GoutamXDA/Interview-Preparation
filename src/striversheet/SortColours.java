package striversheet;

import java.util.Arrays;

//https://leetcode.com/problems/sort-colors/
public class SortColours {
	
	public static void main(String[] args) {
		int[] nums= {2,0,2,1,1,0};
		sortColors(nums);
		System.out.println(Arrays.toString(nums));
	}
	 public static void sortColors(int[] nums) {
		 int start=0;
		 int end=nums.length-1;
		 
		 int i=0;
		 while (i<=end) {
			if(nums[i]==0) {
				swap(nums,i,start);
				start++;
				i++;
			}
			else if(nums[i]==2) {
				swap(nums,i,end);
				end--;
			}
			else {
				i++;
			}
		}
	 }
	private static void swap(int[] nums, int i, int j) {
		int temp=nums[i];
		nums[i]=nums[j];
		nums[j]=temp;
	}

}
