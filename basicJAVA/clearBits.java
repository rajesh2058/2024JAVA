
import java.util.*;
public class clearBits {
  public static void main(String args[]) {
     int n = 5; //0101
     int pos = 2;
     int bitMask = 1<<pos; //syntax is  LHS value wanna shift and RHS no of shift wanted
     int newBitMask = ~(bitMask);
     int newNumber = newBitMask & n;
     System.out.println(newNumber);
  }
}


