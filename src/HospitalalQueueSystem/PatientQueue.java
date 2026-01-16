package HospitalalQueueSystem;

public class PatientQueue {

    private class Node {
        Patient data;
        Node next;

        Node(Patient data) {
            this.data = data;
        }
    }

    private Node front; // أول مريض
    private Node rear;  // آخر مريض
    private int size;

    // enqueue
    public void addPatient(Patient patient) {
        Node newNode = new Node(patient);

        if (isEmpty()) {
            front = rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
        size++;
    }

    // dequeue
    public Patient servePatient() {
        if (isEmpty()) return null;

        Patient served = front.data;
        front = front.next;
        size--;

        if (front == null) {
            rear = null;
        }
        return served;
    }

    // front
    public Patient getNextPatient() {
        return isEmpty() ? null : front.data;
    }

    // rear
    public Patient getLastPatient() {
        return isEmpty() ? null : rear.data;
    }

    // size
    public int getQueueSize() {
        return size;
    }

    // isEmpty
    public boolean isEmpty() {
        return front == null;
    }

    // traversal / display
    public void displayPatients() {
        if (isEmpty()) {
            System.out.println("No patients in queue.");
            return;
        }

        Node current = front;
        System.out.println("\n--- Patients in Queue ---");
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }
}