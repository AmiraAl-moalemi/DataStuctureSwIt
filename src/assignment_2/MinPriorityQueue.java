package assignment_2;
import java.util.PriorityQueue;

public class MinPriorityQueue {

    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        pq.add(10);
        pq.add(5);
        pq.add(20);

        while (!pq.isEmpty()) {
            System.out.println(pq.poll());
        }
    }
}
