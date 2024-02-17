
    import java.util.Scanner;
public class numberpattern {
    public static void main(String args[]){
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter number of star");
        int a=scanner.nextInt();
        int number =1;
        for(int i=0;i<a;i++){
            for(int j=0;j<=i;j++){
                System.out.print(number);
                number ++;
            }
            System.out.println ();
        }

    }
}

