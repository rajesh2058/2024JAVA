import java.util.Scanner;
public class detail {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter name is ");
        String name = scan.next();
        System.out.println("enter country name is ");
        String country = scan.next();
        System.out.println("enter contact number ");
        Long contact= scan.nextLong();
        System.out.println("enter email ");
        String Email = scan.next();
       System.out.println("name is "+name);
       System.out.println("country is "+country);
       System.out.println("contact number is "+contact);
       System.out.println("Email is "+Email);  
    }
}
