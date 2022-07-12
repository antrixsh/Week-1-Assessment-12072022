import java.util.*;

public class klargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of array : ");
        int n = sc.nextInt();
        int[] ar = new int[n];
        int[] br = new int[n];
        Arrays.fill(br, 0);
        int[] cr = new int[n];
        System.out.println("Enter the value of k : ");
        int k = sc.nextInt();
        if (k > n || k < 0) {
            System.out.println("Enter the valid value");
        } else {
            System.out.println("Enter the values : ");
            for (int i = 0; i < n; i++) {
                ar[i] = sc.nextInt();
            }
            for (int i = 0; i < n; i++) {
                cr[i] = ar[i];
            }
            for (int i = 0; i < k; i++) {

                int maxi = Integer.MIN_VALUE;
                int ind = 0;
                for (int j = 0; j < n; j++) {
                    if (maxi < ar[j]) {
                        maxi = ar[j];
                        ind = j;
                    }
                }

                br[ind] = 1;
                ar[ind] = Integer.MIN_VALUE;
            }

            for (int i = n - 1; i > 0; i--) {
                if (br[i] == 1)
                    System.out.print(cr[i] + " ");
            }
        }
        sc.close();
    }

}