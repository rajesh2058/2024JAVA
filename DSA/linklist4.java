//Check if a Linked List is a palindrome
//palindrome means paxadi and adadi dekhi same
//Time complexity - O(n)
//Space complexity - O(1)  
    class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }
    public class linklist4 {
    
        public boolean isPalindrome(ListNode head) {
            if (head == null || head.next == null) {
                return true;
            }
    
            // Find the middle of the linked list
            ListNode slow = head, fast = head;
            while (fast != null && fast.next != null) {
                slow = slow.next;
                fast = fast.next.next;
            }
    
            // Reverse the second half of the linked list
            ListNode secondHalf = reverseList(slow);
            ListNode firstHalf = head;
    
            // Compare the first and second halves
            while (secondHalf != null) {
                if (firstHalf.val != secondHalf.val) {
                    return false;
                }
                firstHalf = firstHalf.next;
                secondHalf = secondHalf.next;
            }
            return true;
        }
    
        private ListNode reverseList(ListNode head) {
            ListNode prev = null;
            while (head != null) {
                ListNode nextNode = head.next;
                head.next = prev;
                prev = head;
                head = nextNode;
            }
            return prev;
        }
    
        public static void main(String[] args) {
            // Test case
            linklist4 pll = new linklist4();
            ListNode head = new ListNode(1);
            head.next = new ListNode(2);
            head.next.next = new ListNode(2);
            head.next.next.next = new ListNode(2);
    
            System.out.println(pll.isPalindrome(head)); // Output: true
        }
    }
