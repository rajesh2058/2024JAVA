//Write a function to print the sum of all odd numbers from 1 to n.
import java.util.*;

public class p2 {
    public static void main(String[] args) {
        Scanner A=new Scanner(System.in);
        System.out.println("enter n number");
        int n=A.nextInt();
        int a=0;
        for(int i=1;i<=n;i++) //its time complexity is O(n)
        {
            if(i%2==0)
{
   
}
else
{
    a=a+i;
}
        }
        System.out.println(a);
    }
}
