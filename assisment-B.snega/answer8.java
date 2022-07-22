import java.util.*;
class answer8{
public static void main(String args[])
{
int a[]={1,3,4,5};
int b[]={2,4,6,8};
int ci=0;
int c[]= new int[a.length + b.length];
for(int i=0;i<a.length;i++)
{
c[ci]=a[i];
ci++;
}
for(int i=0;i<b.length;i++)
{
c[ci]=b[i];
ci++;
}
System.out.println(Arrays.toString (c));
}
}