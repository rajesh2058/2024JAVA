public class recursion2 {
    
        public static int PrintNum(int n){
            if(n==0){      //this is base case
                return 0 ;   //where to stop case
            } 
            else{
                return n + PrintNum(n-1);
            }
            
        }
        public static void main(String[] args) {
            int n=5;
         int sum = PrintNum(n);
         System.out.println(sum);
        }
    }
    

