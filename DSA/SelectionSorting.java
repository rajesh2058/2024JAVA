import java.util.*;
public class SelectionSorting {
    public static void printArr(int arr[]) {
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();  
    }
    public static void main(String[] args) {
        int arr[]= {5,8,1,2,3,9}; //time complexity is (n-1)*((n-1)+(n-2)----)=n^2
        for(int i=0;i<arr.length-1;i++){
            int smallest = i;//suru ma smallest no fix garam
            for(int j=i+1;j<arr.length;j++){
                if(arr[smallest]>arr[j]){
                    
                smallest =j; //smallest no lai override garam and compare gardai gayam
                }
            }
            int temp = arr[smallest]; //finally euta smallest ayo vane teslai original i sanga swap garam
            arr[smallest] = arr[i]; //yesari initial smallest sanga new smallest swap huna  bho 
            arr[i]=temp;
        }
    
 printArr(arr);
}
}
