public class quicksort {
    public static int partition(int arr[], int low, int high)
    {
     int pivot = arr[high];
     int i = low -1 ;

     for(int j = low; j<high; j++)
     {
        if(arr[j] < pivot)
        //if 1st no is less then pivot then swap
        {
            i++; //track empty place for element
            //swap
            //1st no is array no need to swap so i = -1 is imp
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            //except pivot all elements are arrange in order
        }
     }
     //if value is greater then pivot then it need to swap
     //with pivot
     //this is use to place pivot in right position
     i++;
     int temp = arr[i];
     arr[i] = pivot ;
     arr[high] = temp ;
     return i;
     //it return i as pivot position
    }
    public static void quickSort(int arr[],int low , int high)
    //array 1st el is low and last el is high
    //1st pivot can be 1st or last
 
    {
         if(low < high){
           int pidx = partition(arr,low,high);
           //save pivot position
           //divide array into two 
           //greater then pivot element 
           //and smaller then pivot element
           quickSort(arr, low, pidx-1);
           //new array will start from low to pivot element
           //pivot element = pidx
           quickSort(arr, pidx+1, high);
           //next array will start from next point of 
           //pivot to high so
         }
    }
 public static void main(String[] args) {
    int[] arr = {5,1,6,2,8,7,9};
    int n = arr.length;

    quickSort(arr,0,n-1);
    for (int i=0;i<n-1;i++)
    {
        System.out.print(arr[i]+" ");
    }
 System.out.println();
}   
}
