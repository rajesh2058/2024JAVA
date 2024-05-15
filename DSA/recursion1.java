public class recursion1 {
    public static void PrintNum(int n){
        if(n==0){      //this is base case
            return ;   //where to stop case
        } 
        System.out.println(n);
        PrintNum(n-1);
    }
    public static void main(String[] args) {
        int n=5;
      PrintNum(n);
    }
}
