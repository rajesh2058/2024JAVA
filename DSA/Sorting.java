import java.util.*;


class Sorting {
   public static void printArray(int arr[]) {
       for(int i=0; i<arr.length; i++) {
           System.out.print(arr[i]+" ");
       }
       System.out.println();
   }


   public static void main(String args[]) {
       int arr[] = {100,1,5,4,333,222,1421};


       //bubble sort
       for(int i=0; i<arr.length-1; i++) 
       //no of time it need to run which is n-1
       //no need to run last no cause it is fix
       {
           for(int j=0; j<arr.length-i-1; j++) 
           //no of time it need to compare and which will 
           //get decrease with no of time greater no get fixed
           {
               if(arr[j] > arr[j+1]) {
                   //swap
                   int temp = arr[j];
                   arr[j] = arr[j+1];
                   arr[j+1] = temp;
               }
           }
       }


       printArray(arr);
   }
}

