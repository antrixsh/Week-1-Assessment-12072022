import java.util.*;

public class reverse {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows : ");
        int rows = sc.nextInt();
        System.out.println("Enter the number of columns : ");
        int cols = sc.nextInt();
        if (rows < 0 || cols < 0) {
            System.out.println("Number is invalid, please put a positive number");
        } else {
            int[][] matrix = new int[rows][cols];
            System.out.println("Enter the values : ");
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    matrix[i][j] = sc.nextInt();
                }
            }
            System.out.println("New Array : ");
            int[][] res = new int[matrix[0].length][matrix.length];
            for (int i = 0; i < matrix[0].length; i++) {
                for (int j = 0; j < matrix.length; j++) {
                    res[i][j] = matrix[j][i];
                    System.out.print(res[i][j] + " ");
                }
                System.out.println(" ");
            }
            sc.close();
        }

    }

}
