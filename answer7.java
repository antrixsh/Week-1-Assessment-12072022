public class answer7 {
    public static void main(String[] args){

         int[] arr={2,2,2,2,2};
        int arr1[]=new int[arr.length];
        int j=0;
        int len=arr.length;
        System.out.print("arr[] = ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        for(int i=0;i<len-1;i++)
            {
            if(arr[i]!=arr[i+1]){
                arr1[j++]=arr[i];
                }
        }
        arr1[j++]=arr[len-1];
        for(int k=0;k<j;k++){
            System.out.print(" "+arr1[k]);
        }


    }
    
}