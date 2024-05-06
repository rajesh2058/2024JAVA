//Take an array of names as input from 
//the user and print them on the screen.
import java.util.*;
public class arrayP1 {
    public static void main(String[] args) {
        Scanner A = new Scanner(System.in);
        System.out.println("how many person are there for entry: ");
        int n = A.nextInt();
        String[] name = new String[n];
        for(int i=0;i<n;i++) //time complexity is O(n)
        {
            name[i]=A.next();
            System.out.println("name of "+(i+1)+ " is "+name[i]);
            
        }
    }
}
