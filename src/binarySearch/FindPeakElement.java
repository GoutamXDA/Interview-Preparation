
public class FindPeakElement {
    public static void main(String[] args) {
        int[] arr={1,2,3,1};
        int peakElement=findPeakElement(arr);
        System.out.println(peakElement);
    }

    private static int findPeakElement(int[] arr) {
        int start=0;
        int end=arr.length-1;
        while (start<=end){
            int mid=start+(end-start)/2;
            if((mid==0 || arr[mid]>=arr[mid-1]) && (mid==arr.length-1 || arr[mid]>=arr[mid+1])){
                return mid;
            }
            if(mid>0 && arr[mid-1]>=arr[mid]){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return -1;
    }


/*
    private static int findPeakElement(int[] arr) {
        int start=0;
        int end=arr.length-1;
        while (start<end){
            int mid=start+(end-start)/2;
            if(arr[mid]>arr[mid+1]) end=mid;
            else start=mid+1;
        }
            return start;
    }
 */
}
