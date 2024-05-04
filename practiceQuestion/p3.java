//Write a function which takes in 2 numbers and returns the greater of those two.
import java.util.*;

public class p3 {
    public static void main(String[] args) {
        Scanner A=new Scanner(System.in);
        System.out.println("enter value of a and b");
        int a=A.nextInt();
        int b=A.nextInt();
            if(a<b) //its time complexity is 0(1)
{
    System.out.println("greater "+b);
}
else
{
    System.out.println("greater "+a);
}
    }
}

