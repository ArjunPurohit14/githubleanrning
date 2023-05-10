import org.w3c.dom.ls.LSOutput;

public class bianrysearch_brootforce {
    public static void main(String[] args) {
        int[] arr = {5, 7, 7, 7, 7, 8, 8, 10};
        int s = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 7) {
                s = i;
                break;
            }
        }


        int f = 0;
        for (int j = arr.length-1; j > 0; j--) {
            if (arr[j] == 7) {
                f = j;
                break;
            }

        }
        System.out.println(s);
        System.out.println(f);

    }
}



