//x^n is given question using recursion 
//x^0 =1 and if x=0 then x^n=0 are base case
//using x^n = x*((x)^n-1) for recursion
//stack height is no of times calculatePower is called
import java.util.*;
public class recursion5 {
    public static double calculatePower(int x,int n){
        if(x==0){
            return 0;
        }
        else if(n==0){
            return 0;
        }
        else{
       double p =x*calculatePower(x, n-1); // occupy n no of memory or more
       return p;
        }
    }
    public static void main(String[] args) {
         Scanner A = new Scanner(System.in);
        System.out.println("enter value of x  ");
        int x = A.nextInt();
        System.out.println("enter value of power  ");
        int n = A.nextInt();
        double v = calculatePower(x, n);
        System.out.println("calculated value is "+ v);
    }
    
}
