import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Shift shift = new Shift(new ArrayList<>(), new ArrayList<>());
        Nurse nurse1 = new Nurse("Sara", "Levi", 2010, false);  // ותק: 15
        Nurse nurse2 = new Nurse("Dana", "Cohen", 2005, true);    // ותק: 20
        FamilyDoctor doctor1 = new FamilyDoctor("David", "Kaplan", 2000, 20); // ותק: 25
        SpecialistDoctor specialist1 = new SpecialistDoctor("Yael", "Mizrahi", 2015, 15, "Cardiology"); // ותק: 10
        shift.addEmployee(nurse1);
        shift.addEmployee(nurse2);
        shift.addEmployee(doctor1);
        shift.addEmployee(specialist1);
        Patient patient1 = new Patient(1, true, Patient.TreatmentType.NURSE_CHECK);
        Patient patient2 = new Patient(2, false, Patient.TreatmentType.FAMILY_DOCTOR_CHECK);
        Patient patient3 = new Patient(3, true, Patient.TreatmentType.FAMILY_DOCTOR_CHECK);
        Patient patient4 = new Patient(4, true, Patient.TreatmentType.SPECIALIST_CHECK);
        Patient patient5 = new Patient(5, true, Patient.TreatmentType.NURSE_CHECK);
        shift.addPatient(patient1);
        shift.addPatient(patient2);
        shift.addPatient(patient3);
        shift.addPatient(patient4);
        shift.addPatient(patient5);
        System.out.println("Most Senior Employee: " + shift.mostSenior());
        System.out.println("\nUrgent Patients for Nurse Check:");
        String nurseOutput = Arrays.toString(shift.getUrgentPatientsByTreatment(1));
        nurseOutput = nurseOutput.replace(", ", "\n");
        System.out.println(nurseOutput);

        System.out.println("\nUrgent Patients for Family Doctor Check:");
        String familyOutput = Arrays.toString(shift.getUrgentPatientsByTreatment(2));
        familyOutput = familyOutput.replace(", ", "\n");
        System.out.println(familyOutput);

        System.out.println("\nUrgent Patients for Specialist Check:");
        String specialistOutput = Arrays.toString(shift.getUrgentPatientsByTreatment(3));
        specialistOutput = specialistOutput.replace(", ", "\n");
        System.out.println(specialistOutput);
    }
}