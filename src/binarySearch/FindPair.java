package binarySearch;
public class FindPair {
    public static void main(String[] args) {
        int[] arr={2,5,8,12,30};
        int sum=17;
        boolean pair=isPairPresent(arr,sum);
        System.out.println(pair);
    }

    private static boolean isPairPresent(int[] arr, int sum) {
        int start=0;
        int end=arr.length-1;
        while (start<=end){
            if(arr[start]+arr[end]==sum) return true;
            else if(arr[start]+arr[end]<sum){
                start+=1;
            }else{
                end-=1;
            }
        }
        return false;
    }

 /*   private static boolean isPairPresent(int[] arr, int sum) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j <arr.length ; j++) {
                if(arr[i]+arr[j]==sum) return true;
            }
        }
        return false;
    } */
}
