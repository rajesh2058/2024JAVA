public class simplify {
    public static void main(String args[]){
        int a=10;
        int b=5;
        int simplify1=a*b/a-b; //java doesn't follow badmos rule instead it is based on prority
        int simplify2=a*b-a/b; //it proritized * / % more then - +
        int simplify3=(a*b)/(a-b);//here bracker it done 1st and java done from left to right for calx
        //but output will be 0,48,10
        System.out.println("value of simplify1 must be 10 but "+simplify1);
        System.out.println("value of simplify2 must be 9 but "+simplify2);
        System.out.println("value of simplify3 must be 10 but "+simplify3);
    }
}
