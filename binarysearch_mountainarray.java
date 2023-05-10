public class binarysearch_mountainarray {
//    https://leetcode.com/problems/peak-index-in-a-mountain-array/
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 4,3,2,1};
        int start = 0;
        int end = arr.length - 1;
        int ans= binarysearch(arr,start,end);
        System.out.println(ans);
    }
    static int binarysearch(int[] arr,int start,int end){
        while(start<end){
            int mid = start+(end-start)/2;
            if(arr[mid]>arr[mid+1]){
                end=mid;
            }else if(arr[mid]<arr[mid+1]){
                start=mid+1;
            }else{
                return mid;
            }
        }
        return start;
    }
}
