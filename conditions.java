import java.util.Scanner;
public class conditions {
    public static void main(String args[]){
        Scanner a = new Scanner(System.in);
        System.out.println("enter 1st number");
        int b=a.nextInt();
        System.out.println("enter 2nd number");
        int c=a.nextInt();
        if(b==c){
            System.out.println("numbers are equal");
        }
        else if (b>c){
            System.out.println("numbers is greater "+b);
        }
        else{
            System.out.println("numbers c is greater "+c); 
        }
        }
    }
    

