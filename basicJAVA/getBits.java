import java.util.*;
//getbits and it is bit manipulation

public class getBits {
   public static void main(String args[]) {
      int n = 5; //0101
      int pos = 2; 
      int bitMask = 1<<pos; //it mean 1 is 0001 and pos is 2 so bit mask is 0100 left side move bho
    


      if((bitMask & n) == 0) 
      // 0010 & 0101 = 0000 so 0
      {
          System.out.println("bit was zero");
      } else {
          System.out.println("bit was one");
      }
   }
}
