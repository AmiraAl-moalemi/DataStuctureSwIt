
package hospital;

import java.util.Scanner;

public class HospitalManagementSystem {
    static Scanner sc = new Scanner(System.in);

    static int readInt(String msg) {
        System.out.print(msg);
        return Integer.parseInt(sc.nextLine());
    }

    static String readLine(String msg) {
        System.out.print(msg);
        return sc.nextLine();
    }

    public static void main(String[] args) {

        SinglyLinkedList patients = new SinglyLinkedList();
        SinglyLinkedList doctors = new SinglyLinkedList();
        SinglyLinkedList appointments = new SinglyLinkedList();
        EmergencyQueue emergency = new EmergencyQueue();

        while (true) {
            System.out.println("\n===== Hospital Management System =====");
            System.out.println("1) المرضى");
            System.out.println("2) الأطباء");
            System.out.println("3) المواعيد");
            System.out.println("4) الطوارئ");
            System.out.println("0) خروج");

            int choice = readInt("اختر: ");

            if (choice == 0) break;

            // المرضى
            if (choice == 1) {
                System.out.println("1) إضافة  2) حذف  3) عرض");
                int c = readInt("اختر: ");

                if (c == 1) {patients.add(new Patient(
                            readInt("ID: "),
                            readLine("الاسم: "),
                            readInt("العمر: "),
                            readLine("الهاتف: "),
                            readLine("الحالة: ")
                    ));
                } else if (c == 2) {
                    patients.removeById(readInt("ID للحذف: "));
                } else if (c == 3) {
                    patients.displayAll();
                }
            }

            // الأطباء
            else if (choice == 2) {
                System.out.println("1) إضافة  2) حذف  3) عرض");
                int c = readInt("اختر: ");

                if (c == 1) {
                    doctors.add(new Doctor(
                            readInt("ID: "),
                            readLine("الاسم: "),
                            readLine("التخصص: "),
                            readLine("الهاتف: ")
                    ));
                } else if (c == 2) {
                    doctors.removeById(readInt("ID للحذف: "));
                } else if (c == 3) {
                    doctors.displayAll();
                }
            }

            // المواعيد
            else if (choice == 3) {
                System.out.println("1) إضافة  2) حذف  3) عرض");
                int c = readInt("اختر: ");

                if (c == 1) {
                    appointments.add(new Appointment(
                            readInt("ID الموعد: "),
                            readInt("PatientID: "),
                            readInt("DoctorID: "),
                            readLine("التاريخ: "),
                            readLine("الوقت: ")
                    ));
                } else if (c == 2) {
                    appointments.removeById(readInt("ID للحذف: "));
                } else if (c == 3) {
                    appointments.displayAll();
                }
            }

            // الطوارئ
            else if (choice == 4) {
                System.out.println("1) إدخال  2) التالي  3) عرض");
                int c = readInt("اختر: ");

                if (c == 1) {
                    int id = readInt("PatientID: ");
                    Patient p = (Patient) patients.findById(id);
                    if (p != null) emergency.enqueue(p);
                    else System.out.println("المريض غير موجود.");
                } else if (c == 2) {
                    Patient p = emergency.dequeue();
                    System.out.println(p == null ? "لا يوجد أحد." : p);
                } else if (c == 3) {
                    emergency.display();
                }
            }
        }

        System.out.println("تم الخروج من النظام.");
    }
}