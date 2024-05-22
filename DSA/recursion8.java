//print reverse string
import java.util.*;
public class recursion8 {
    public static String revString(String a)
    {
        if(a.length()==1){
            return a;
        }
        char currChar = a.charAt(0) ; //save charater at 0 index in currChar
        String nextString = revString(a.substring(1));//yesma yesla index 1 dekhi baki 
        //bolayo ra naya fn ko lagi a =0 vayo return a nai garo and go on like this 
        //last wala la h return garo and then s and r last ma
        //totally genius 
        return nextString + currChar;
    }
    public static void main(String[] args) {
        String a = "rajesh";
        String reversed = revString(a);
        System.out.println(reversed);
    }
    
}
