package hospital;

class Node {
    Object data;
    Node next;

    Node(Object data) {
        this.data = data;
        this.next = null;
    }
}
public class SinglyLinkedList {
    private Node head;

    public boolean isEmpty() {
        return head == null;
    }

    public void add(Object data) {
        Node node = new Node(data);
        if (head == null) {
            head = node;
            return;
        }
        Node cur = head;
        while (cur.next != null)
            cur = cur.next;
        cur.next = node;
    }

    public Object findById(int id) {
        Node cur = head;
        while (cur != null) {
            if (getId(cur.data) == id)
                return cur.data;
            cur = cur.next;
        }
        return null;
    }

    public boolean removeById(int id) {
        if (head == null) return false;

        if (getId(head.data) == id) {
            head = head.next;
            return true;
        }

        Node cur = head;
        while (cur.next != null && getId(cur.next.data) != id)
            cur = cur.next;

        if (cur.next == null) return false;
        cur.next = cur.next.next;
        return true;
    }

    private int getId(Object obj) {
        if (obj instanceof Patient) return ((Patient) obj).id;
        if (obj instanceof Doctor) return ((Doctor) obj).id;
        if (obj instanceof Appointment) return ((Appointment) obj).id;
        return -1;
    }

    public void displayAll() {
        if (head == null) {
            System.out.println("القائمة فارغة.");
            return;
        }
        Node cur = head;
        while (cur != null) {
            System.out.println(cur.data);
            cur = cur.next;
        }
    }
}
