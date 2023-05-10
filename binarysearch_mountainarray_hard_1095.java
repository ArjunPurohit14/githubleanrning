public class binarysearch_mountainarray_hard_1095 {
    ////   BROOTFORCE APPROACH
////    public static void main(String[] args) {
////        int[] arr = {1, 2, 3, 4, 5, 6, 4, 3, 2, 1};
////        int target = 5;
////        int i, j;
////        int k=0;
////        int l=0;
////        for (i = 0; i < arr.length; i++) {
////            if (arr[i] == target) {
////                k = i;
////                break;
////            }
////        }
////        for (j = arr.length-1; j >= 0; j--) {
////                if (arr[j] == target) {
////                    l = j;
////                    break;
////                }
////            }
////        System.out.println(Math.min(k, l));
////            }
////        }
//
    public static int main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 4, 3, 2};
        int target = 3;
        int peak = peakIndexmountain(arr);
        int firstTry = orderagnosticarray(arr, target, 0, peak);
        if (firstTry != -1) {
            System.out.println(firstTry);
        } else {
            System.out.println(orderagnosticarray(arr, target, peak + 1, arr.length - 1));
        }


        public static int peakIndexmountain ( int[] arr){
            int start = 0;
            int end = arr.length - 1;
            while (start < end) {
                int mid = start + (end - start) / 2;
                if (arr[mid] > arr[mid + 1]) {
                    end = mid;
                } else {
                    start = mid + 1;
                }

            }
            return start;
        }

        public static int orderagnosticarray ( int[] arr, int target, int start, int end){

            boolean isAsc = arr[start] < arr[end];
            while (start < end) {
                int mid = start + (end - start) / 2;
                if (isAsc) {
                    if (target < arr[mid]) {
                        end = mid - 1;
                    } else {
                        start = mid + 1;
                    }
                } else {
                    if (target > arr[mid]) {
                        start = end + 1;
                    } else {
                        end = mid - 1;
                    }
                }
            }
            return -1;
        }
    }
}




