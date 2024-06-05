//find the nth node from last
//we donot have pointer from behind so 
//to find nth from behind
//we use formula as = size-n+1
// previous node = size -1 so we use concept 
//prev.next = prev.next.next
//it will indicate no next node of nth node 
//so we can delete nth node
class ListNode{
    int val;
    ListNode next;
    ListNode(int val) {
      this.val = val;
      this.next = null;
    }
    
}
public class linklist3{
 public static ListNode removeNthFromEnd(ListNode head, int n){
    // if(head.next == null){
    //     return null;
    // }
    ListNode dummy = new ListNode(0);
    dummy.next = head;
    //initalized two pointer 
    ListNode first = dummy;
    ListNode second = dummy;

    //move the 1st pointer n+1 step ahead
    for (int i=0;i<=n;i++){
        first = first.next;
    }
// Move both pointers until the first pointer reaches the end
while (first != null) {
    first = first.next;
    second = second.next;
}

// Now, second pointer is at the node before the nth node from the end
second.next = second.next.next;

// Return the head of the modified list
return dummy.next;
}

// Helper method to print the linked list
public static void printList(ListNode head) {
ListNode current = head;
while (current != null) {
    System.out.print(current.val + " ");
    current = current.next;
}
System.out.println();
}

public static void main(String[] args) {
// Creating a linked list: 1 -> 2 -> 3 -> 4 -> 5
ListNode head = new ListNode(1);
head.next = new ListNode(2);
head.next.next = new ListNode(3);
head.next.next.next = new ListNode(4);
head.next.next.next.next = new ListNode(5);

// Print the original list
System.out.print("Original List: ");
printList(head);

// Remove the 2nd node from the end (which is node with value 4)
head = removeNthFromEnd(head, 2);

// Print the modified list
System.out.print("Modified List: ");
printList(head);
 } 
    
}
//time complexity o(n)
//and space complexity 0(1)