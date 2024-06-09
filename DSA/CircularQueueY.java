public class CircularQueueY {
    static class Queue {
        private int[] arr;
        private int size;
        private int rear;
        private int front;
        private int count;

        Queue(int n) {
            this.size = n;
            arr = new int[size];
            rear = -1;
            front = -1;
            count = 0;
        }

        public boolean isEmpty() {
            return count == 0;
        }

        public boolean isFull() {
            return count == size;
        }

        // Enqueue
        public void add(int data) {
            if (isFull()) {
                System.out.println("Queue is full");
                return;
            }
            rear = (rear + 1) % size;
            arr[rear] = data;
            if (front == -1) {
                front = rear;
            }
            count++;
        }

        // Dequeue
        public int remove() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }
            int result = arr[front];
            front = (front + 1) % size;
            count--;
            if (count == 0) {
                front = rear = -1;
            }
            return result;
        }

        // Peek
        public int peek() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }
            return arr[front];
        }

        // Get current size of the queue
        public int size() {
            return count;
        }

        // Print remaining elements in the queue
        public void printQueue() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return;
            }
            System.out.print("Queue: ");
            for (int i = 0; i < count; i++) {
                System.out.print(arr[(front + i) % size] + " ");
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
        System.out.println("We have removed " + q.remove()); // Output: 1
        q.printQueue(); // Output: Queue: 2 3
        System.out.println("1st element in queue is " + q.peek()); // Output: 2
        q.add(4);
        q.add(5);
        q.add(6);
        q.printQueue(); // Output: Queue: 2 3 4 5 6
        q.add(8);
        System.out.println("Remove is " + q.remove()); // Output: 2
        q.printQueue(); // Output: Queue: 3 4 5 6
        System.out.println("1st is " + q.peek()); // Output: 3
        while (!q.isEmpty()) {
            System.out.print(q.remove());
        }
    }
}
