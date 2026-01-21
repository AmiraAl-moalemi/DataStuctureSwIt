
package hospital;

public class Appointment {
    public int id;
    public int patientId;
    public int doctorId;
    public String date;
    public String time;

    public Appointment(int id, int patientId, int doctorId, String date, String time) {
        this.id = id;
        this.patientId = patientId;
        this.doctorId = doctorId;
        this.date = date;
        this.time = time;
    }

    @Override
    public String toString() {
        return "ID الموعد: " + id +
                " | PatientID: " + patientId +
                " | DoctorID: " + doctorId +
                " | التاريخ: " + date +
                " | الوقت: " + time;
    }
}
