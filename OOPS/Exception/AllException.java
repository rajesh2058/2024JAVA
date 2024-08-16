import java.util.Scanner;
class doit{
    int a;
    int b;
  void arthimaticException(int a,int b){
        this.a=a;
        this.b=b;

        try{
           int c=a/b; //throw exception if b=0
           System.out.println("value of c is:"+c);
        }
        catch(Exception e){
         //System.out.println("sorry we can't do it:");
          System.out.println("exception cause:"+e.getMessage());
        }
    }
   

}
public class AllException {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter value of a and b:");
        
        int a=scanner.nextInt();
       int b=scanner.nextInt();
       
        doit r=new doit();
       r.arthimaticException(a,b);
         
       int[] numbers = { 10, 20, 30 };

       try {
           // Accessing elements at valid indices
           System.out.println("Element at index 0: " + numbers[0]);
           System.out.println("Element at index 1: " + numbers[1]);
           System.out.println("Element at index 2: " + numbers[2]);

           // Accessing an element at an invalid index
         System.out.println("Element at index 3: " + numbers[3]); // Throws ArrayIndexOutOfBoundsException
       } catch (Exception e) {
           System.out.println("Exception caught: " + e.getMessage());
       }
         
  


    }
    
}