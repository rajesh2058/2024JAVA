
//Enter 3 numbers from the user & make a function to print their average.
import java.util.* ;

public class p1 {
    public static int average(int a, int b, int c)
{
    int sum= (a+b+c)/3;
    return sum;
}

    public static void main(String[] args) {
        Scanner A= new Scanner(System.in);
        System.out.println("enter 3 number");
        int a = A.nextInt();
        int b = A.nextInt();
        int c = A.nextInt();
        int sum= average(a,b,c);
        System.out.println("average of the given number is "+sum);
    }
}
