import java.util.*;
public class priorityQueue {
    public static void main(String[] args) {
        
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());

        pq.offer(100);
        pq.offer(20);
        pq.offer(30);
        pq.offer(70);

        System.out.println(pq);
        System.out.println(pq.peek());

        pq.poll();
        System.out.println(pq);

    }
}
