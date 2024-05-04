//Write a function that takes in the radius as input
// and returns the circumference of a circle.
import java.util.*;
public class p5 {
    public static double circle(int a){
     double circumference = 2 * 3.14 * a ;
     return circumference;
    }
    public static void main(String[] args) { //O(1)
      Scanner A= new Scanner(System.in);
      System.out.println("enter radius of circle");
      int a = A.nextInt();
       double answer= circle(a);
       System.out.println("circumference of circle is "+ answer);
    }
}
