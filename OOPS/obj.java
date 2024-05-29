import java.util.*;
class Detail{
    public void all(String name){
        System.out.println("name is "+name);
        
    }
    Detail() // non parameterized constructor 
    {
        System.out.println("Detail called ");
    }
}
class Rollnumber //parameterized constructor
{
   int roll; //must be declare roll to use this roll
    Rollnumber(int roll) // non parameterized constructor 
    {
        this.roll = roll;
        System.out.println("roll called "+roll);
    }
}
class Symbolno //copy constructor
{
    int symbol ;

   Symbolno() //by default constructor used by s1
   {

   }
    Symbolno(Symbolno s2) // copy constructor
    //call object of s2 which will be s1 
    {
        this.symbol= s2.symbol;
        System.out.println("roll called "+s2.symbol);
    }
}
public class obj {
    public static void main(String[] args) {
        // Scanner A = new Scanner(System.in); 
        // System.out.println("enter name");
        // String b = A.next();
        Detail d = new Detail(); // d is object of class Detail
        //detail()itself is consuctor 
        d.all("ram"); // argument value pass
        Rollnumber c = new Rollnumber(5); //  same class called twice
        Rollnumber e= new Rollnumber(6);  
        Symbolno s1 = new Symbolno();
        s1.symbol = 11008; //we pass int value directly to symbol class 
        Symbolno s2 = new Symbolno(s1); //we don't need to pass value for object s2
        


    }
}
