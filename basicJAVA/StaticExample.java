
   public class StaticExample {
        static int x; //static variable 
        static {
            System.out.println("Static block 1");  //static block
            x = 10;
        }
        static {
            System.out.println("Static block 2");
        }
        static void display(){
            System.out.println("value of x is "+x);
        }
        public static void main(String[] args) { //static no need object and when class is loaded static run after it
         StaticExample.display();  //no need of object to call static method
        }
    }
