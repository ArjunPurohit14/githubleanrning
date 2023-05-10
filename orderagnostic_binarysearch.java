public class orderagnostic_binarysearch {
    public static void main(String[] args) {
        int[] arr = {-18, -12, -5, 0, 2, 3, 4, 15, 16, 22, 45, 89};
        int target = 22;
        int start = 0;
        int end = arr.length - 1;
        boolean isAsc = arr[start] < arr[end];
        while (start < end) {
            int mid = start + (end - start) / 2;


            if (isAsc) {
                if (target < arr[mid]) {
                    end = start - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target > arr[mid]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
        System.out.println(start);
    }
}


