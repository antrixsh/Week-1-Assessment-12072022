import java.util.*;

public class remove_duplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        int[] dupli = new int[n];
        System.out.println("Enter the values.");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int j = 0;
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                dupli[j] = arr[i];
                j += 1;
            }
        }
        dupli[j++] = arr[n - 1];
        for (int i = 0; i < j; i++) {
            arr[i] = dupli[i];
        }
        for (int i = 0; i < j; i++) {
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }
}