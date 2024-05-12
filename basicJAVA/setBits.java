import java.util.*;


public class setBits {
   public static void main(String args[]) {
      int n = 5; //0101
      int pos = 1; //postion is count from 0 from right hand side
      int bitMask = 1<<pos; // 0001 lai 1 position la left shift so 0010


      int newNumber = bitMask | n; //0101 or 0010 is 0 
      System.out.println(newNumber);
   }
}

