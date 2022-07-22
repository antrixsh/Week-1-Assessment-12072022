import java.util.*;

public class double1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number : ");
        double a = sc.nextDouble();
        System.out.println("Enter second number : ");
        double b = sc.nextDouble();
        if (a > 0 && a < 1 && b > 0 && b < 1) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
        sc.close();
    }

}
