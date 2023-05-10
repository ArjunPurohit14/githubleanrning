//BROOTFORCE APOROACH
//public class bianrysearch {
//    public static void main(String[] arg) {
//        int arr[] = {2, 3, 5, 9, 11, 14, 16, 18};
//        int target = 4;
//        int n = arr.length;
//        for (int i = 0; i < n; i++) {
//            if (arr[i] >= target) {
//                System.out.println(arr[i]);
//                break;
//            } else {
//                continue;
//            }
//        }
//    }
//}
public class bianrysearch_ceiling_2 {
    public static void main(String[] arg){
        int arr[] = {2, 3, 5, 9, 11, 14, 16, 18};
        int  target = 14;
        System.out.println(ceiling(arr,target));
    }
    static int ceiling (int arr[],int target)
    {
        int start = 0;
        int end = arr.length-1;

        while ( start<=end) {
            int mid= start+(end-start)/2;
            if(target<arr[mid])
            {
                end=mid-1;
            }else if(target>arr[mid]){
                start=mid+1;
            }else{
                return mid;
            }

        }
        return start;
    }
}







