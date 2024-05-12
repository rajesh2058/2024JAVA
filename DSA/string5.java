
    import java.util.*; 
//sting builders
//use to modify sting in memory in less time where as strings are inchangable so sting buildes concept arise
public class string5 {
    public static void main(String[] args) {
        
    
    // String a = "ram";
     StringBuilder b = new StringBuilder("ramu shahi");
    System.out.println("output must be ramu "+b);
    System.out.println("output must be ramu "+b.length());
    System.out.println("output must be wow   shahi "+b.replace(0,5,"wow")); //chatAt USED TO FIND CHARACTER AT POSITION
    System.out.println("output must be ramu "+b.length()); //length will be reduced
    StringBuilder c = new StringBuilder();
    c.ensureCapacity(100); //managing capacity
}
}

