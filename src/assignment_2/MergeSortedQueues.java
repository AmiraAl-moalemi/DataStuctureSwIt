package assignment_2;
import java.util.LinkedList;
import java.util.Queue;

public class MergeSortedQueues {

    public static Queue<Integer> merge(Queue<Integer> q1, Queue<Integer> q2) {
        Queue<Integer> result = new LinkedList<>();

        while (!q1.isEmpty() && !q2.isEmpty()) {
            if (q1.peek() <= q2.peek()) {
                result.add(q1.poll());
            } else {
                result.add(q2.poll());
            }
        }

        while (!q1.isEmpty()) result.add(q1.poll());
        while (!q2.isEmpty()) result.add(q2.poll());

        return result;
    }
}//O(n+m)
