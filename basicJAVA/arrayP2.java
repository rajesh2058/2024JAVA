//Find the maximum & minimum number in an array of integers.
import java.util.*;
public class arrayP2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      int size = sc.nextInt();
      int numbers[] = new int[size];
      //input
      for(int i=0; i<size; i++) {
          numbers[i] = sc.nextInt();
      }
      int max = Integer.MIN_VALUE; //Integer.MIN_VALUE is -2222222 stg so value 
      //in array greater then this will override and stored as max
      
      int min = Integer.MAX_VALUE; //Integer.MIN_VALUE is 2222222 stg so value in
      // array smaller then this will override and stored as min
     
       for(int i=0; i<numbers.length; i++) {
           if(numbers[i] < min) {
               min = numbers[i]; //compare each value with min
           }
           if(numbers[i] > max) {
               max = numbers[i]; //compare each value with max
           }
    }
    System.out.println("Largest number is : " + max);
    System.out.println("Smallest number is : " + min);
}
}


