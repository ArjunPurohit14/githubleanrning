public class binarysearch_kk_cieling {

        public static void main(String[] args)
        {
            int[] arr={2,4,6,13,22,34,46,57,89,97};
            int target=55;
            int ans=cieling(arr,target);
            System.out.println(ans);
        }
//        return the index of smallest element>=target
        static int cieling(int[] arr, int target)
        {
            int start=0;
            int end= arr.length-1;
            int mid;
            while (start<=end)
            {
//                find middle element
                mid=start+(end-start)/2;
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
