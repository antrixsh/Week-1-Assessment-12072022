import java.util.*;

public class concat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length 1 : ");
        int len1 = sc.nextInt();
        System.out.println("Enter the length 2 : ");
        int len2 = sc.nextInt();
        if (len1 < 0 || len2 < 0) {
            System.out.println("Enter a valid number");
        } else {
            int[] arr1 = new int[len1];
            int[] arr2 = new int[len2];
            int[] arr3 = new int[len1 + len2];
            System.out.println("Enter the values for array 1 : ");
            for (int i = 0; i < len1; i++) {
                arr1[i] = sc.nextInt();
            }
            System.out.println("Enter the values for array 2 : ");
            for (int i = 0; i < len2; i++) {
                arr2[i] = sc.nextInt();
            }
            int pos = 0;
            for (int ele : arr1) {
                arr3[pos++] = ele;
            }
            for (int ele1 : arr2) {
                arr3[pos++] = ele1;
            }
            System.out.println("New array  : ");
            for (int i = 0; i < arr3.length; i++) {
                System.out.print(arr3[i] + " ");
            }
        }

    }
}
