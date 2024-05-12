import java.util.*; 
//sting builders
//use to modify sting in memory in less time where as strings are inchangable so sting buildes concept arise
public class string4 {
    public static void main(String[] args) {
        
    
    // String a = "ram";
     StringBuilder b = new StringBuilder("ramu");
    System.out.println("output must be ramu "+b);
    System.out.println("output must be r "+b.charAt(0)); //chatAt USED TO FIND CHARACTER AT POSITION
    b.insert(0,'p'); //modify or insert char  at position
    System.out.println("output must be pumu "+b);
    b.delete(0,2);
    System.out.println("output must be u "+b);
    // StringBuilder sb = new StringBuilder("Apna College");
    //  System.out.println(sb);
    StringBuilder c = new StringBuilder(); //append and insert are used 
    c.append("ram");                  //to insert data and string in stringbuilder
    c.append(" ");
    c.append("shahi");
    System.out.println("output must be ram shahi "+c);
}
}
