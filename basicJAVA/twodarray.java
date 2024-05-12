import java.util.*;
public class twodarray {
    public static void main(String[] args) {
        Scanner A= new Scanner(System.in);
        System.out.println("enter numbers of rows:");
        int a = A.nextInt(); 
        System.out.println("enter numbers of column:");
        int b = A.nextInt();
        int[][] Sushant = new int [a][b]; //syntax is type[][]arrayName=new type[rows][column]
        for(int i=0;i<a;i++){
            for(int j=0;j<b;j++)
            {
                System.out.println("enter value in position of "+(i+1)+" row and "+(j+1)+" column");
                Sushant[i][j] = A.nextInt();
                
            }
           
        }
        for(int i=0;i<a;i++){
            for(int j=0;j<b;j++)
            {
                System.out.print(Sushant[i][j]+" ");
            }
            System.out.println("");
        }
    } 
    
}
