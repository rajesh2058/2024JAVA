//using log2(n) to minized the no of step so minimum amount of memory is occupy
//with stack height log n
//so log base 2 n = c where c is stack height
    import java.util.*;
public class recursion6 {
    public static double calculatePower(int x,int n){
        if(n == 0) {
            return 1;
            }
            if(n % 2 == 0) {
            return calculatePower(x, n/2) * calculatePower(x, n/2); //only half +1 space occupy
            }
            else {
            return x * calculatePower(x, n/2) * calculatePower(x, n/2);
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

