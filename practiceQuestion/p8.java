//Two numbers are entered by the user, x and n.
// Write a function to find the value of one number 
//raised to the power of another i.e. x^n.
import java.util.*;
public class p8 {
    public static void main(String[] args) {
        Scanner A = new Scanner( System.in);
        System.out.print("enter value of x:");
        int x = A.nextInt();
        System.out.print("enter value of n:");
        int n= A.nextInt();
        int a=1;
        for(int i=0;i<n;i++){
            a = a*x;
        }
        System.out.println("value of a according to given function x^n is "+a);
    }
}
