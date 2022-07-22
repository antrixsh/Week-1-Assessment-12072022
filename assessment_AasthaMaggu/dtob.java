import java.util.*;

public class dtob {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int count = 0;
        int num = sc.nextInt();
        int number = num;
        int binary[] = new int[40];
        int ind = 0;
        while (num > 0) {
            binary[ind] = num % 2;
            ind += 1;
            num = num / 2;
        }
        System.out.print("Binary Representation of " + String.valueOf(number) + " is: ");
        for (int i = ind - 1; i >= 0; i--) {
            System.out.print(binary[i]);
            if (binary[i] == 0) {
                count += 1;
            }
        }
        System.out.println(" ");
        System.out.print("Number of zero bits : ");
        System.out.print(count);
        sc.close();
    }

}
