package hospital;

class QNode {
    Patient data;
    QNode next;

    QNode(Patient data) {
        this.data = data;
    }
}
public class EmergencyQueue {
    private QNode front, rear;

    public boolean isEmpty() {
        return front == null;
    }

    public void enqueue(Patient p) {
        QNode node = new QNode(p);
        if (rear == null) {
            front = rear = node;
            return;
        }
        rear.next = node;
        rear = node;
    }

    public Patient dequeue() {
        if (front == null) return null;
        Patient p = front.data;
        front = front.next;
        if (front == null) rear = null;
        return p;
    }

    public void display() {
        if (front == null) {
            System.out.println("طابور الطوارئ فارغ.");
            return;
        }
        QNode cur = front;
        int i = 1;
        while (cur != null) {
            System.out.println(i++ + ") " + cur.data);
            cur = cur.next;
        }
    }
}
