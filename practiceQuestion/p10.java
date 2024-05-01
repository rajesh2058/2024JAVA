//Write a program to print Fibonacci series 
//of n terms where n is input by user :
//0 1 1 2 3 5 8 13 21 ..... 
//In the Fibonacci series, a number is the sum 
//of the previous 2 numbers that came before it.
import java.util.Scanner;

public class p10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of terms in the Fibonacci series: ");
        int n = scanner.nextInt();
        
        int first = 0;
        int second = 1;
        
        System.out.println("Fibonacci Series:");
        System.out.print(first + " " + second + " ");
        
        for (int i = 2; i < n; i++) {
            int next = first + second;
            System.out.print(next + " ");
            first = second;
            second = next;
        }
        
        scanner.close();
    }
}


