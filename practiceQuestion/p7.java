//Write a program to enter the numbers till the user 
//wants and at the end it should display the count of 
//positive, negative and zeros entere
import java.util.*;

public class p7 {
    public static void main (String[]args )
    {
        int counterpositive= 0;
        int counternegative= 0;
        int counterzero= 0;
        int n=1;
        for(int i=0;n>i;n++)
        {
        Scanner A= new Scanner(System.in);
        System.out.println("click 1 to enter value and 2 for exit");
        int button = A.nextInt();
       
        switch(button){
            case 1:
                Scanner B= new Scanner(System.in);
                System.out.println("enter number");
                int a = B.nextInt();
         
                if(a>0){
                    counterpositive=counterpositive +1;
                }
                else if (a==0){
                    counterzero=counterzero+1;
                }
                else
                {
                    counternegative=counternegative+1;
                }
        break;
        case 2:
        System.out.println("number of zeros are "+counterzero);
        System.out.println("number of postives are "+counterpositive);
        System.out.println("number of negatives are "+counternegative);
        i=n+3;
         break ;
         default:
         System.out.println("number of zeros are "+counterzero);
         System.out.println("number of postives are "+counterpositive);
         System.out.println("number of negatives are "+counternegative);
         i=n+3;

        }
    }
        
    }
    
}
