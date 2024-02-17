
 
import java.util.Scanner;
public class binarypattern {
    public static void main(String args[]){
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter number of star");
        int a=scanner.nextInt();
   
        for(int i=0;i<a;i++){
            for(int j=0;j<=i;j++){
             int sum = i+j;
             if(sum % 2 == 0){
                System.out.print("1");
             }
             else {
                System.out.print("0");
             }
            }
            System.out.println ();
        }

    }
}

