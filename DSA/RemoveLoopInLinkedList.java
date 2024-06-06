
    class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }
    
    public class RemoveLoopInLinkedList {
    
        // Function to detect and remove loop in the linked list
        public void removeLoop(ListNode head) {
            if (head == null || head.next == null) {
                return;
            }
    
            ListNode slow = head, fast = head;
            boolean hasLoop = false;
    
            // Detect loop using Floyd's Cycle Detection algorithm
            while (fast != null && fast.next != null) {
                slow = slow.next;
                fast = fast.next.next;
                if (slow == fast) {
                    hasLoop = true;
                    break;
                }
            }
    
            // If loop exists
            if (hasLoop) {
                slow = head;
    
                // If the loop is at the head
                if (slow == fast) {
                    while (fast.next != slow) {
                        fast = fast.next;
                    }
                } else {
                    // Move both pointers at the same speed to find the start of the loop
                    while (slow.next != fast.next) {
                        slow = slow.next;
                        fast = fast.next;
                    }
                }
    
                // Removing the loop
                fast.next = null;
            }
        }
    
        public static void main(String[] args) {
            RemoveLoopInLinkedList rll = new RemoveLoopInLinkedList();
    
            // Creating a linked list with a loop for testing
            ListNode head = new ListNode(1);
            head.next = new ListNode(2);
            head.next.next = new ListNode(3);
            head.next.next.next = new ListNode(4);
            head.next.next.next.next = new ListNode(5);
            
            // Creating a loop for testing
            head.next.next.next.next.next = head.next.next; // Loop here
    
            // Removing loop
            rll.removeLoop(head);
    
            // Print the list after removing the loop
            ListNode curr = head;
            while (curr != null) {
                System.out.print(curr.val + " ");
                curr = curr.next;
            }
        }
    }
    
