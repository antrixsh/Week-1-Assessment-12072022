import java.util.*;

public class four {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number : ");
        int a = sc.nextInt();
        System.out.println("Enter the second number : ");
        int b = sc.nextInt();
        System.out.println("Enter the third number : ");
        int c = sc.nextInt();
        System.out.println("Enter the fourth number : ");
        int d = sc.nextInt();
        if (a < 0 || b < 0 || c < 0 || d < 0) {
            System.out.println("Enter valid numbers.");
        } else {
            if (a == b && b == c && c == d) {
                System.out.println("Numbers are equal!");
            } else {
                System.out.println("Numbers are not equal!");
            }
        }
        sc.close();
    }
}