import java.util.*;
public class Queueframework {
        public static void main(String args[]) {
           //Queue<Integer> q = new LinkedList<>();
           //Queue is interface whereas linklist is class
           //or
           Queue<Integer> q = new ArrayDeque<>();
           //arraydeque is class too
            q.add(1);
            q.add(2);
            q.add(3);
            q.add(4);
            q.add(5);
              
     
            while(!q.isEmpty()) {
                System.out.println(q.peek());
                q.remove();
            }
        }
     
    }
    