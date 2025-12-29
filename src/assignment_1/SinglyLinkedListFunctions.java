package assignment_1;

// SinglyLinkedListFunctions (Questions 5–11)
// ==================================================
public class SinglyLinkedListFunctions {

    static class Node {

        int data; Node next;
        Node(int d) { data = d; }
    }

    // Q5: Concatenate two singly linked lists
    static Node concatenate(Node h1, Node h2) {
        if (h1 == null) return h2;
        Node t = h1;
        while (t.next != null) t = t.next;
        t.next = h2;
        return h1;
    }

    // Question 6: Rotate singly linked list to the right by k
// Note: Question (7) in the PDF is a continuation of this question, not a new one
    static Node rotateRight(Node head, int k) {

        if (head == null || k == 0) return head;
        Node curr = head;
        int len = 1;
        while (curr.next != null) { curr = curr.next; len++; }
        curr.next = head;
        k %= len;
        for (int i = 0; i < len - k; i++) curr = curr.next;
        Node newHead = curr.next;
        curr.next = null;
        return newHead;
    }

    // Question 8, 9, 10: Search element in singly linked list and return its index
// If the element is not found, return -1
    static int search(Node head, int key) {
        int pos = 0;
        while (head != null) {
            if (head.data == key) return pos;

            head = head.next; pos++;
        }
        return -1;
    }

    // Q11: Remove node at specific position
    static Node removeAt(Node head, int pos) {
        if (pos == 0) return head.next;
        Node curr = head;
        for (int i = 0; i < pos - 1; i++) curr = curr.next;
        curr.next = curr.next.next;
        return head;
    }
}

