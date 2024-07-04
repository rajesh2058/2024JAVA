//intersection problem
//setkey of anyarray so double vako number ni single vayara
//key ma basos so compare garna sajilo hos

import java.util.HashSet;

public class problem3 {
    public static int intersection(int arr1[],int arr2[]){
        HashSet<Integer> set = new HashSet<>();
        int count = 0;
        for(int i = 0; i<arr2.length;i++){
            set.add(arr2[i]);
        }
        for(int j =0 ;j<arr1.length;j++){
            if(set.contains(arr1[j])){
                count++;
                System.out.print(arr1[j]+" ");
                set.remove(arr1[j]);
            }
        }
        System.out.println();
        return count ;//intersection
    }
    public static void main(String[] args) {
        int arr1[] = {7, 3, 9};
        int arr2[] = {6, 3, 9, 2, 9, 4};
        System.out.println(intersection(arr1, arr2));
        //total number in union
    }
}
