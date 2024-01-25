import java.util.Scanner;
public class startpattern {
    public static void main(String args[]){
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter number of star");
        int a=scanner.nextInt();
        for(int i=0;i<a;i++){
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println ();
        }

    }
}
