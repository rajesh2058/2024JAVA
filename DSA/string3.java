import java.util.*;
public class string3 {
    public static void main(String[] args) {
        Scanner A = new Scanner(System.in);
        System.out.println("enter 1st word");
        String b = A.next();//whole words
        //System.out.println(b);
        System.out.println("enter 2nd word");
        String c= A.next(); //single word next 
       // System.out.println(c);
        // int a =b.length();
        // int d =c.length();
    int result = b.compareTo(c); //compare length
    System.out.println(result);
    if(b.equals(c)){ //compare words
        System.out.println("same");
    }
    else{
        System.out.println("different");
    }
    String f = b.substring(0,4);//o dekhi suru huna and 4 vanda aghi samma
    
    System.out.println(f);


    }
}
