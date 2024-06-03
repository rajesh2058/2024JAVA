import java.util.Collections;
import java.util.ArrayList;
import java.util.Scanner;
//import java.util.* ; increase time by additional file
public class Arraylist1 {
    public static void main(String[] args) {
        //in arraylist we use class of Integer, Float 
        //with capital letter
        ArrayList<Integer> list = new ArrayList<Integer>();
       //add elements
       // ArrayList<String> list2 = new ArrayList<String>();
       list.add(0); // added element type int in list
       list.add(1);
         System.out.println(list);

         //get elements
// Scanner A = new Scanner(System.in);
// System.out.println("enter the position of number to get:");
// int a = A.nextInt();
         int element = list.get(1);
         System.out.println(element);

         // add element in between
         list.add(1,5);
         System.out.println(list);

         //set element
         list.set(0,4);
         System.out.println(list);

         //delete element
         list.remove(2);
         System.out.println(list);

         //size
         int size = list.size();
         System.out.println(size);

         //loop
         for(int i =0 ; i<list.size();i++)
         {
           System.out.print(list.get(i));
         }
         System.out.println();

         //sorting
         Collections.sort(list);
         System.out.println(list);
    }
}
