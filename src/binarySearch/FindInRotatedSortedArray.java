package binarySearch;
public class FindInRotatedSortedArray {
    public static void main(String[] args) {
        int[] arr={10,20,30,40,8,9};
        int target=30;
        int result=searchInRotated(arr,target);
        System.out.println(result);
    }
    public static int searchInRotated(int[] arr, int target){
        int start=0;
        int end=arr.length-1;
        while (start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]==target) return mid;
            if(arr[start]<=arr[mid]){
                if(target>=arr[start] && target<=arr[mid]){
                    end=mid-1;
                }else{
                    start=mid+1;
                }
            }else{
                if(target>=arr[mid+1] && target<=arr[end]){
                    start=mid+1;
                }else{
                    end=mid-1;
                }
            }
        }
        return -1;
    }
}
