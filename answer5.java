public class answer5 {
  public static void main(String[] args){
    
            int arr[]={10,20,30,22,21};
            int temp;
            System.out.println("Orignal Arry");
            for(int q=0;q<arr.length;q++)
            System.out.print(" "+arr[q]);
            System.out.println("");
            for (int i = 0; i <arr.length; i++) {     
                for (int j = i+1; j <arr.length; j++) {     
                    if(arr[i] < arr[j]) {     
                       temp = arr[i];    
                       arr[i] = arr[j];    
                       arr[j] = temp;    
                     }     
                  }   
                
              }    
              for(int k=0;k<3;k++)
              System.out.print(" "+arr[k]);
            
    }
}