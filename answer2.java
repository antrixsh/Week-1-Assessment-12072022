import java.util.*;
public class Answer2{
public static void main(String args[]) {
Scanner sc=new Scanner(System.in);
System.out.println("Input first number: ");
double a=sc.nextDouble();
System.out.println("Input second number: ");
double b=sc.nextDouble();
if(a>=0 && a<=1&&b>=0&&b<=1)
System.out.println("true");
else
System.out.println("false");
}
}