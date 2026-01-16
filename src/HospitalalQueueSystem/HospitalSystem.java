package HospitalalQueueSystem;

public class HospitalSystem {

    private PatientQueue queue = new PatientQueue();
    private int patientIdCounter = 1;

    public void registerPatient(String name, String condition) {
        Patient p = new Patient(patientIdCounter++, name, condition);
        queue.addPatient(p);
        System.out.println("Patient registered successfully.");
    }

    public void callNextPatient() {
        Patient p = queue.servePatient();
        if (p == null)
            System.out.println("No patients waiting.");
        else
            System.out.println("Now serving: " + p);
    }

    public void showNextPatient() {
        Patient p = queue.getNextPatient();
        System.out.println(p == null ? "Queue empty." : "Next patient: " + p);
    }

    public void showLastPatient() {
        Patient p = queue.getLastPatient();
        System.out.println(p == null ? "Queue empty." : "Last patient: " + p);
    }

    public void showAllPatients() {
        queue.displayPatients();
    }

    public void showQueueSize() {
        System.out.println("Patients waiting: " + queue.getQueueSize());
    }

    public void checkEmpty() {
        System.out.println(queue.isEmpty() ? "Queue is empty." : "Queue is not empty.");
    }
}