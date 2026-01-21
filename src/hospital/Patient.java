
package hospital;

public class Patient {
    public int id;
    public String name;
    public int age;
    public String phone;
    public String disease;

    public Patient(int id, String name, int age, String phone, String disease) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.phone = phone;
        this.disease = disease;
    }

    @Override
    public String toString() {
        return "ID: " + id +
                " | الاسم: " + name +
                " | العمر: " + age +
                " | الهاتف: " + phone +
                " | الحالة: " + disease;
    }
}