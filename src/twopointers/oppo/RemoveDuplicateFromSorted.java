package twopointers.oppo;

public class RemoveDuplicateFromSorted {
    public static void main(String[] args) {
    int[] nums={1,1,2,2,2,3,4,4};
    int len=removeDuplicates(nums);
        for (int i = 0; i < len; i++) {
            System.out.println(nums[i]+" ");

        }
    }
    public static int removeDuplicates(int[] nums) {
        if(nums==null) return 0;
        int slow=0;
        for(int fast=1;fast<nums.length;fast++){
            if(nums[slow]!=nums[fast]){
                nums[++slow]=nums[fast];
            }
        }
        return slow+1;
    }
}
