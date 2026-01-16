package HospitalalQueueSystem;

public class Patient {
    int id;
    String name;
    String condition;

    public Patient(int id, String name, String condition) {
        this.id = id;
        this.name = name;
        this.condition = condition;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Condition: " + condition;
    }
}
