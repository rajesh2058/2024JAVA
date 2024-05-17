import java.util.*;
//fibonacci series 
public class recursion4 {
    public static void callFibonacci(int b,int d,int e){
        if (b==1||b==2) //1st and 2nd term are aleady fix
        {                //base case
     return ;
        }
        else{
            int f=d+e;
         System.out.print(f+" ");
         callFibonacci(b-1, e, f);// no of time for loop is fixed so coming from 5-1 or 1-5 is same

            }
        }
         //return f ;
        
    
        //System.out.println();
        
    public static void main(String[] args) {
        Scanner A = new Scanner(System.in);
        System.out.println("enter nth no for fibonacci series ");
        int b = A.nextInt();
        if(b==1){
            System.out.print("0");
        }
        else if(b==2){
            System.out.print("0 1");
        }
        else if(b==0){
            System.out.print("nothing");
        }
        else{
        System.out.print("0 1"+" "); //no line break 
        callFibonacci(b,0,1); //0 and 1 are fixed
        
        //for(int i=0;i<b;i++){
        
        //System.out.println(c);
        
        //}
        }
    
}
}

