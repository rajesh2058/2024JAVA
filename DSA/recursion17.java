//firends paring
public class recursion17 {
    


        public static int pairFriends(int n) {
           if(n <= 1) {
               return 1;
           }
     
     
            return pairFriends(n-1) + (n-1) * pairFriends(n-2);
        }
     
     
        public static void main(String args[]) {
            int n = 4; //12 13 14 23 24 34 123 124 234 1234
            System.out.println(pairFriends(n));
        }
     }
     

