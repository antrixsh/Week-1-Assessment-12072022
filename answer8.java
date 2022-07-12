import java.util.*;
public class answer8 {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        int arr1[]={1,2,3,4};
        int arr2[]={5,6,7,8};
        int len = arr1.length+arr2.length;
        int arr3[]=new int[len];
        int k=0;
        System.out.print("arr1[] = ");
        for(int i=0;i<arr1.length;i++){
            arr3[k++]=arr1[i];
            System.out.print(arr1[i]+" ");
        }

        System.out.print("arr2[] = ");
        
        for(int i=0;i<arr2.length;i++)
        {
            arr3[k++]=arr2[i];
            System.out.print(arr2[i]+" ");
        }
        System.out.println();
        System.err.print("arr3[] = ");
        for(int l=0;l<len;l++){
           System.out.print(arr3[l]+" ");
        }
        

    }
}