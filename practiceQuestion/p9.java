//Write a function that calculates the 
//Greatest Common Divisor of 2 numbers. 
import java.util.*;

public class p9 {
    public static void main(String[] args) {
        Scanner B= new Scanner( System.in);
        System.out.print("enter value of x:");
        int x = B.nextInt();
        System.out.print("enter value of n:");
        int n= B.nextInt();
        int b=0;
        int a=1;
        for(int i=1;i<n;i++){
            if(n%a==0 && x%a==0){
              b=a;
            }
            a++;
        }
        System.out.println("greatest common divisor is "+b);
    }
}
