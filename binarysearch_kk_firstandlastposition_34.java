import java.util.Arrays;

public class binarysearch_kk_firstandlastposition_34 {
    public static void main(String[] args) {
        int[] nums = {5, 7, 7, 7, 7, 8, 8, 10};
        int target = 8;
        int[] ans = {-1, -1};

        ans[0] = sort(nums, target, true);
        if (ans[0] != -1) {
            ans[1] = sort(nums, target, false);
            System.out.print(Arrays.toString(ans));
        }

    }

    static int sort(int[] nums,int target,boolean findstartindex) {
        int ans=-1;
       int start = 0;
       int end = nums.length - 1;
       while (start <=end) {
           int mid = start + (end - start) / 2;
           if (target < nums[mid]) {
               end = mid - 1;
           } else if (target > nums[mid]) {
               start = mid + 1;
           } else {
               ans=mid;
               if (findstartindex) {
                   end = mid - 1;
               } else {
                   start = mid + 1;
               }


           }
       }
       return ans;
   }
}




