package assignment_1;

// CircularLinkedListFunctions (Questions 15–18)
// ==================================================
public class CircularLinkedListFunctions {

    static class Node {
        int data; Node next;

        Node(int d) { data = d; }
    }

    // Q15: Insert node at specific position
    static Node insert(Node head, int data, int pos) {
        Node n = new Node(data);
        if (pos == 0) {
            if (head == null) { n.next = n; return n; }
            Node t = head;
            while (t.next != head) t = t.next;
            t.next = n; n.next = head;
            return n;
        }
        Node curr = head;
        for (int i = 0; i < pos - 1; i++) curr = curr.next;
        n.next = curr.next;
        curr.next = n;
        return head;

    }

    // Q16: Delete node at specific position
    static Node delete(Node head, int pos) {
        if (pos == 0) {
            Node t = head;
            while (t.next != head) t = t.next;
            t.next = head.next;
            return head.next;
        }
        Node curr = head;
        for (int i = 0; i < pos - 1; i++) curr = curr.next;
        curr.next = curr.next.next;
        return head;
    }

    // Q17: Search element in circular linked list
    static boolean search(Node head, int key) {

        Node curr = head;
        do {
            if (curr.data == key) return true;
            curr = curr.next;
        } while (curr != head);
        return false;
    }

    // Q18: Split circular linked list into two halves
    static Node[] split(Node head) {
        Node slow = head, fast = head;
        while (fast.next != head && fast.next.next != head) {
            slow = slow.next; fast = fast.next.next;
        }
        Node head2 = slow.next;
        slow.next = head;
        Node t = head2;
        while (t.next != head) t = t.next;

        t.next = head2;
        return new Node[]{head, head2};
    }
}

