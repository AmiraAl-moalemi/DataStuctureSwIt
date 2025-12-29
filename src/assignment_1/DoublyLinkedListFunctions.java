package assignment_1;
import java.util.*;

// DoublyLinkedListFunctions (Questions12–14)
// ==================================================
public class DoublyLinkedListFunctions {

    static class DNode {
        int data; DNode prev, next;
        DNode(int d) { data = d; }
    }

    // Q12: Remove duplicates from doubly linked list
    static void removeDuplicates(DNode head) {
        Set<Integer> set = new HashSet<>();
        DNode curr = head;
        while (curr != null) {
            if (set.contains(curr.data)) {
                curr.prev.next = curr.next;
                if (curr.next != null) curr.next.prev

                        = curr.prev;
            } else set.add(curr.data);
            curr = curr.next;
        }
    }

    // Q13: Traverse doubly linked list in reverse
    static void printReverse(DNode head) {
        while (head.next != null) head = head.next;
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.prev;
        }
        System.out.println();
    }

    // Q14: Search element in doubly linked list
    static boolean search(DNode head, int

            key) {
        while (head != null) {
            if (head.data == key) return true;
            head = head.next;
        }
        return false;
    }
}

//

