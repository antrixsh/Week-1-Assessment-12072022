
import java.util.Scanner;
public class Reverse {
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
int row=sc.nextInt();
int col=sc.nextInt();
int arr1[][]=new int[row][col];
int arr2[][]=new int[col][row];
System.out.println("original array: ");
for(int i=0;i<row;i++) {
	for(int j=0;j<col;j++){
    arr1[i][j]=sc.nextInt();
	}
	}
	System.out.println("Changed array");
	for(int i=0;i<row;i++) {
	for(int j=0;j<col;j++)  {
	arr2[i][j]=arr1[j][i];
	System.out.println(arr2[i][j]+"");
	}
	System.out.println();
	}
}
}
