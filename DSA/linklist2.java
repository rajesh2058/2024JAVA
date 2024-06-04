import java.util.*;
public class linklist2 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();
        list.addFirst("A");
        list.addFirst("e");
        System.out.println(list);

        list.addLast("wow");
        list.add("rajesh"); //bydefault add will add at list
        System.out.println(list);
        System.out.println(list.size());
        
        for(int i =0;i<list.size();i++){
           // if(list.get(i)== value){}  to find value in list
            System.out.println(list.get(i)+" -> ");
        }
        System.out.println("null");
        list.removeFirst();
        System.out.println(list);
        list.removeLast();
        System.out.println(list);
        list.remove(1);
        System.out.println(list);
    }
}
