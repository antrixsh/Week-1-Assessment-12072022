import java.util.*;
public class Answer1 {
public static void main(String args[]) {
Scanner sc=new Scanner(System.in);
System.out.println("Input first number:");
int i1=sc.nextInt();
System.out.println("Input second number:");
int i2=sc.nextInt();
System.out.println("Input third number:");
int i3=sc.nextInt();
System.out.println("Input fourth number:");
int i4=sc.nextInt();
if(i1==i2&&i2==i3&&i3==i4)
System.out.println("equal");
else
System.out.println("not equal");
}
}

