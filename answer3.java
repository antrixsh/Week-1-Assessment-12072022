import java.util.*;
public class answer3{
public static void main(String args[]) {
Scanner sc=new Scanner(System.in);
boolean [][]array=new boolean[3][3];
for(int i=0;i<3;i++) {
	for(int j=0;j<3;j++){
	boolean d=sc.nextBoolean();
	array[i][j]=d;
}
}
for(int i=0;i<3;i++) {
	for(int j=0;j<3;j++) {
		if(array[i][j]==true)
		System.out.println("t");
		else
			System.out.println("f");
	}
}
}
}