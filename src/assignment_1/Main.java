package assignment_1;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        // ===== Arrays Tests =====
        int[] arr = {1,2,3,4};
        System.out.println(Arrays.toString(Array.cloneArray(arr)));

        System.out.println(Arrays.toString(Array.removeRandom(arr)));
        System.out.println(Arrays.toString(Array.removeSpecific(arr,2)));
        Array.reverseArray(arr);
        System.out.println(Arrays.toString(arr));

        // ===== Singly Linked List Tests =====
        SinglyLinkedListFunctions.Node a = new SinglyLinkedListFunctions.Node(1);
        a.next = new SinglyLinkedListFunctions.Node(2);
        a.next.next = new SinglyLinkedListFunctions.Node(3);
        System.out.println(SinglyLinkedListFunctions.search(a,2));

        // ===== Doubly Linked List Tests =====
        DoublyLinkedListFunctions.DNode d1 = new DoublyLinkedListFunctions.DNode(1);
        DoublyLinkedListFunctions.DNode d2 = new DoublyLinkedListFunctions.DNode(1);
        d1.next = d2; d2.prev = d1;
        DoublyLinkedListFunctions.removeDuplicates(d1);
        DoublyLinkedListFunctions.printReverse(d1);

        // ===== Circular Linked List Tests =====
        CircularLinkedListFunctions.Node ch = null;
        ch = CircularLinkedListFunctions.insert(ch,1,0);
        ch = CircularLinkedListFunctions.insert(ch,2,1);
        System.out.println(CircularLinkedListFunctions.search(ch,2));
    }
}

