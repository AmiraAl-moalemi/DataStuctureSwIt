package HospitalalQueueSystem;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        HospitalSystem system = new HospitalSystem();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n=== Hospital Queue System ===");
            System.out.println("1) Register patient");
            System.out.println("2) Call next patient");
            System.out.println("3) Show next patient");
            System.out.println("4) Show last patient");
            System.out.println("5) Show all patients");
            System.out.println("6) Queue size");
            System.out.println("7) Is queue empty?");
            System.out.println("0) Exit");
            System.out.print("Choose: ");

            int choice = sc.nextInt();
            sc.nextLine(); // clear buffer

            switch (choice) {

                case 1:
                    System.out.print("Patient name: ");
                    String name = sc.nextLine();

                    System.out.print("Condition: ");
                    String condition = sc.nextLine();

                    system.registerPatient(name, condition);
                    break;

                case 2:
                    system.callNextPatient();
                    break;

                case 3:
                    system.showNextPatient();
                    break;

                case 4:
                    system.showLastPatient();
                    break;

                case 5:
                    system.showAllPatients();
                    break;

                case 6:
                    system.showQueueSize();
                    break;

                case 7:
                    system.checkEmpty();
                    break;

                case 0:
                    System.out.println("System closed.");
                    return;

                default:
                    System.out.println("Invalid choice, try again.");
            }
        }
    }
}