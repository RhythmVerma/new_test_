import java.util.Scanner;

// Base class
class Person {
    String name;
    String dateOfBirth;
    String gender;

    void inputPersonDetails(Scanner sc) {
        System.out.print("Enter Name: ");
        name = sc.nextLine();

        System.out.print("Enter Date of Birth: ");
        dateOfBirth = sc.nextLine();

        System.out.print("Enter Gender: ");
        gender = sc.nextLine();
    }

    void displayPersonDetails() {
        System.out.println("Name           : " + name);
        System.out.println("Date of Birth  : " + dateOfBirth);
        System.out.println("Gender         : " + gender);
    }
}

// Main class
public class Patient extends Person {
    int caseNumber;
    String disease;
    String dateOfAdmission;
    String dateOfDischarge;
    int billNumber;

    void inputPatientDetails(Scanner sc) {
        System.out.print("Enter Case Number: ");
        caseNumber = sc.nextInt();
        sc.nextLine(); // clear buffer

        System.out.print("Enter Disease: ");
        disease = sc.nextLine();

        System.out.print("Enter Date of Admission: ");
        dateOfAdmission = sc.nextLine();

        System.out.print("Enter Date of Discharge: ");
        dateOfDischarge = sc.nextLine();

        System.out.print("Enter Bill Number: ");
        billNumber = sc.nextInt();
    }

    void displayPatientDetails() {
        System.out.println("\n--- Patient Details ---");
        displayPersonDetails();
        System.out.println("Case Number       : " + caseNumber);
        System.out.println("Disease           : " + disease);
        System.out.println("Date of Admission : " + dateOfAdmission);
        System.out.println("Date of Discharge : " + dateOfDischarge);
        System.out.println("Bill Number       : " + billNumber);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Patient p = new Patient();

        System.out.println("Enter Person Details");
        p.inputPersonDetails(sc);

        System.out.println("\nEnter Patient Details");
        p.inputPatientDetails(sc);

        p.displayPatientDetails();

        sc.close();
    }
}
