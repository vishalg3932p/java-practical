import java.util.Deque;
import java.util.PriorityQueue;
import java.util.ArrayDeque;

class Practical20 {

    public static void main(String[] args) {

        // PriorityQueue
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        pq.add(30);
        pq.add(10);
        pq.add(20);

        System.out.println("Priority Queue:");

        while (!pq.isEmpty()) {
            System.out.println(pq.poll());
        }

        // Deque
        Deque<String> deque = new ArrayDeque<>();

        deque.add("A");
        deque.add("B");
        deque.add("C");

        System.out.println("\nDeque:");
        System.out.println(deque);

        // Remove from front
        System.out.println("Removed from front: " + deque.removeFirst());

        System.out.println("Deque after removal: " + deque);
    }
}