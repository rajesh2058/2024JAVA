import java.util.*;
public class searchtwodarray {
    public static void main(String[] args) {
        Scanner A= new Scanner(System.in);
        System.out.println("enter numbers of rows:");
        int c = A.nextInt(); 
        System.out.println("enter numbers of column:");
        int b = A.nextInt();
        int[][] Sushant = new int [c][b]; //syntax is type[][]arrayName=new type[rows][column]
        for(int i=0;i<c;i++){
            for(int j=0;j<b;j++)
            {
                System.out.println("enter value in position of "+(i+1)+" row and "+(j+1)+" column");
                Sushant[i][j] = A.nextInt();
                
            }
           
        }
        System.out.println("enter number you wanna search in matrix:");
        int x = A.nextInt(); 
        //boolean found =false;
        for(int i=0;i<c;i++){
            for(int j=0;j<b;j++)
            {
                if(x==Sushant[i][j])
{
   System.out.print("x is found at position row "+(i+1)+" and column "+(j+1));
   //found=true;
}  
else{
    System.out.println("Number " + x + " is not found in the matrix.");
        } 
}  
            }
        }
    } 
    



