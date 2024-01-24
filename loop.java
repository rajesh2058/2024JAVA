import java.util.Scanner;
public class loop {
    public static void main(String args[]){
        Scanner scanner=new Scanner (System.in);
        System.out.println("enter number of row of 1st matrix");
        int a=scanner.nextInt();
        System.out.println("enter number of column of 1st matrix");
        int b=scanner.nextInt();
        for(int i=0;i<a;i++){
            for (int j=0;j<b;j++){
                System.out.println("enter "+(i+1)+" row and in "+(j+1)+" column");  
                int c=scanner.nextInt();
                System.out.println("enter "+(i+1)+" row and in "+(j+1)+" column is "+(c++)); 

            }
        }

    }
    
}
