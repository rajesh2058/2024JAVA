//queue is fixed so check if it is full or not
//array queue
//problem queue limited with space
public class QueueY {
    static class Queue{
        static int arr[];
        static int size ;
        static int rear ;
        Queue(int n)
        {
            this.size = n ;
            arr = new int[size];
            rear = -1;

        }
        public static boolean isEmpty(){
            return rear == -1;
        }

        public static boolean isFull(){
            return rear == size-1 ;
        }
        //enqueue
      public static void add(int data){
        if(isFull()){
            System.out.println("overflow");
            return;
        }
        arr[++rear] = data ;
      }
      //dequeue
      public static int remove() //display value we want to remove
      {
        if(isEmpty()){
            System.out.println("empty queue");
            return -1;
        }
        int front = arr[0];
        for(int i =0;i<rear;i++){
            arr[i] = arr[i+1];
        }
        rear--;
        return front;
      }

      //peek
      public static int peek(){
        if(isEmpty()){
            System.out.println("empty queue");
            return -1;
        }
        return arr[0] ;
      }
       // Print remaining elements in the queue
       public static void printQueue() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }
        System.out.print("Queue: ");
        for (int i = 0; i <= rear; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
      }
public static void main(String[] args) {
    Queue q = new Queue(5);
    q.add(1);
        q.add(2);
        q.add(3);
        // Queue: 1 2 3
        System.out.println("we have removed "+q.remove()); // Output: 1
        q.printQueue();                 // Output: Queue: 2 3
        System.out.println("1st element in queue is "+q.peek());   // Output: 2
        q.add(4);
        q.add(5);
        q.add(6);
        q.printQueue();                 // Output: Queue: 2 3 4 5 6
        System.out.println("remove is "+q.remove()); // Output: 2
        q.printQueue();                 // Output: Queue: 3 4 5 6
        System.out.println("1st is "+q.peek());   // Output: 3
}
}
