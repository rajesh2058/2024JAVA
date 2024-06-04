//scratch code of link list but the are already define in java
public class Linklist1 {
    Node head; //create head
    private int size ;
    Linklist1(){
        this.size = 0;
    }
    class Node{
        String data ;
        Node next ;
        //create a new node
        //next store address of next data
        Node(String data){
            this.data = data;
            this.next = null; 
            size++;
            //every new node next is null 
            // so it refer as last in list
        }

    }
    // add - fist and last 
    public void addFirst(String data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        //if list already exit
        newNode.next = head;
        head = newNode;
    }
    public void addLast(String data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        Node currNode = head; //new pointer instead of head
        while(currNode.next != null){
          currNode = currNode.next;
        }
        currNode.next = newNode;
    }
    //print
    public void printList(){
        if(head == null){
            System.out.println("list is empty");
            return;
        }
        Node currNode = head; //treat head as constant
        while(currNode!= null){
            System.out.print(currNode.data + " -> ");
          currNode = currNode.next;
        }
        System.out.println("null"); 
    }
    //delete first
    public void deleteFirst(){
        if(head == null){
            System.out.println("list is empty");
            return;
        }
        size--;
        head = head.next;
    }

    //delete last
    public void deleteLast(){
        if(head == null)//corner case
        {
            System.out.println("The list is empty");
            return;
        }
        size --;
        if(head.next ==null)//cprner case
        {
            head = null;
            return;
        }
        //yeha size lekhna mildina
//suru ko lai secondlast manam and second lai last 
//sardai gayam jaha lastnode null veto teslai delete garna vayam
// ra secondlast node lai null banuna
        Node secondLast = head;
        Node lastNode = head.next;
        while(lastNode.next != null){
            lastNode = lastNode.next ;
            secondLast = secondLast.next;
        }
        secondLast.next = null ;
    }
    public int getSize(){
       return size; 
    }

    public static void main(String[] args) {
        Linklist1 list = new Linklist1();
        list.addFirst("a");
        list.addFirst("is ");
        list.printList();
        list.addLast("list");
        list.printList();
        list.addFirst("this");
        list.printList();
        list.deleteFirst();
        list.printList();
        list.deleteLast();
        list.printList(); 
        System.out.println(list.getSize());
        list.addFirst("this");
        System.out.println(list.getSize());
    }
}
