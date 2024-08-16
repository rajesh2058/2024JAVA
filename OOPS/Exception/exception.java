import java.util.Scanner;
public class exception {
    public static void main(String[]args){
        //int a syntax error cause there is no semi colon
        Scanner scanner=new Scanner(System.in); 
        System.out.println("enter value of b "5); 
        int b=scanner.nextInt();
        for(int i=0;i<5;i++)
        {
            System.out.println("prime no is "+(2*i+1)); //logical error cause every result isn't prime
        }
          System.out.println("sum is "+(b+5));  //if we insert float then its run time exception
    }
}
