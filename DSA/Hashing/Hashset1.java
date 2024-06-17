//we are doing hashset where using it is best for time comp
//complexity
//it will remove duplicates in the set
import java.util.HashSet;
import java.util.Iterator;
public class Hashset1 {
    public static void main(String[] args) {
        HashSet <Integer> set = new HashSet<>();
        //add value in hashset name set
        set.add(5);
        set.add(1);
        set.add(1);
        set.add(6);
        set.add(5);
        set.add(7);
        set.add(2);
       //search
       if(set.contains(1)){
        System.out.println("it has value 1");
       }
       if(!set.contains(3)){
        //first set.contains(3) will send false
        //and ! will make it true and print fn will run
        System.out.println("it doesnot have value 3");
       }
       System.out.println("size of set is "+set.size());
       set.remove(1);
       System.out.println("size of set is "+set.size());
       Iterator it = set.iterator();
       //it.hasnext will return t or f
       //does it has next value or not
       while(it.hasNext()){
        //it.next will initial be at null
        //and return value
        System.out.println(it.next());
       }
    }
}
