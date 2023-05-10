//import java.security.spec.RSAOtherPrimeInfo;
//BROOTFORCE SOLUTION
public class binarysearch_again_firstandlast_position_2 {
    public static void main(String[] args) {
        int[] arr = {5, 7, 7, 8, 8, 10};
        int i, j;
        int k = -1;

        int l = -1;
        int target = 16;
        for (i = 0; i < arr.length; i++) {

            if (arr[i] == target) {
                k = i;
                break;
            }
        }
            for (j = arr.length-1; j >= 0; j--) {
                if (arr[j] == target) {
                    l = j;
                    break;
                }
            }
                System.out.println(k);
                System.out.println(l);
            }
        }
//public class binarysearch_again_firstandlast_position_2 {
//
//}









