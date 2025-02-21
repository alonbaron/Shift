import java.util.ArrayList;
import java.util.List;

public class Shift {
    private List<Employee> employees;
    private List<Patient> patients;

    public Shift(List<Employee> employees, List<Patient> patients) {
        this.employees = new ArrayList<>();
        this.patients = new ArrayList<>();
    }

    public void addEmployee(Employee employee){
        employees.add(employee);
    }
    public void addPatient(Patient patient){
        patients.add(patient);
    }

    public String mostSenior(){
        Employee mostSeniorEmployee = employees.get(0);
        for (int i = 1; i < employees.size(); i++) {
            if (employees.get(i).getSeniority() > employees.get(0).getSeniority()){
                mostSeniorEmployee = employees.get(i);
            }
        }
        return mostSeniorEmployee.getFullName();
    }

    public Patient[] getUrgentPatientsByTreatment(int treatmentType){
        Patient.TreatmentType wantedType;
        switch (treatmentType){
            case 1:
                wantedType = Patient.TreatmentType.NURSE_CHECK;
                break;
            case 2:
                wantedType = Patient.TreatmentType.FAMILY_DOCTOR_CHECK;
                break;
            case 3:
                wantedType = Patient.TreatmentType.SPECIALIST_CHECK;
                break;
            default:
                throw new IllegalArgumentException("Invalid treatment type: " + treatmentType);
        }
        
        int count = 0;
        for (int i = 0; i < patients.size(); i++) {
            if (patients.get(i).isUrgent() && patients.get(i).getTreatmentType() == wantedType){
                count++;
            }
        }
        Patient[] result = new Patient[count];
        int index = 0;
        for (int i = 0; i <patients.size() ; i++) {
            if (patients.get(i).isUrgent() && patients.get(i).getTreatmentType() == wantedType){
                result[index] = patients.get(i);
                index++;
            }
        }
        return result;
    }

}
