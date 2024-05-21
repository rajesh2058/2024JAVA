//tower of hanoi
public class recursion7 {
    public static void TOH(int r, String source,String helper, String destination) {
      if(r==1){
        System.out.println("the "+r+" disk move from "+source+" "+destination);
        return ;
      }
      System.out.println("the "+r+" disk move from "+source+" "+destination);
      //act diff for different call so
      TOH(r-1, source, destination, helper);
       
      TOH(r-1,helper,source,destination);
   
    }
    public static void main(String[] args) {
        int r = 5;

        TOH(r,"s","h","d");

    }
  }


  // TOH(3, "A", "B", "C") calls TOH(2, "A", "C", "B").
// TOH(2, "A", "C", "B") calls TOH(1, "A", "B", "C").
// TOH(1, "A", "B", "C"): Base case, move disk 1 from A to C.
// Return to TOH(2, "A", "C", "B").

// Move disk 2 from A to B.
// TOH(2, "A", "C", "B") calls TOH(1, "C", "A", "B").
// TOH(1, "C", "A", "B"): Base case, move disk 1 from C to B.
// Return to TOH(3, "A", "B", "C").

// Move disk 3 from A to C.
// TOH(3, "A", "B", "C") calls TOH(2, "B", "A", "C").
// TOH(2, "B", "A", "C") calls TOH(1, "B", "C", "A").
// TOH(1, "B", "C", "A"): Base case, move disk 1 from B to A.
// Return to TOH(2, "B", "A", "C").

// Move disk 2 from B to C.
// TOH(2, "B", "A", "C") calls TOH(1, "A", "B", "C").
// TOH(1, "A", "B", "C"): Base case, move disk 1 from A to C.