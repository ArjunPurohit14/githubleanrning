import org.w3c.dom.ls.LSOutput;
//https://leetcode.com/problems/peak-index-in-a-mountain-array/
public class binarysearch_mountainarray_852_2 {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6,7, 4, 3, 2};
        int ans = search(arr);
        System.out.println(ans);
    }

    public static int search(int[] arr) {
        int start = 0;
        int end = arr.length-1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid + 1]) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        return start; //or end as both are =
    }
}

