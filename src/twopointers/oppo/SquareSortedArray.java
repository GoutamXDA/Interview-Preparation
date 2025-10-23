package twopointers.oppo;

import java.util.Arrays;

public class SquareSortedArray {
    private static int[] nums;

    public static void main(String[] args) {
        int[] nums = {-7, 3, 0, 2, 5};
        System.out.println(Arrays.toString(soretedSquareElement(nums)));
    }
    public static int[] soretedSquareElement(int[] nums){
        int n=nums.length-1;
        int[] result=new int[n];
        int left=0;
        int right =n;
        int idx=n;
        while(left<=right){
            int lVal=nums[left];
            int rVal=nums[right];
            int alVal=lVal<0 ? -lVal:lVal;
            int arVal=rVal<0 ? -rVal:rVal;
            if(alVal>arVal){
                result[idx]=alVal;
                left++;
            }
            else {
                result[idx]=arVal;
                right--;
            }
            idx--;
        }
        return result;
    }
}