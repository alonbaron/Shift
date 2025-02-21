public class SpecialistDoctor extends Employee {
    private int averagePatientsPerDay;
    private String expertise;

    public SpecialistDoctor(String firstName, String lastName, int startingYear, int averagePatientsPerDay, String expertise) {
        super(firstName, lastName, startingYear);
        this.averagePatientsPerDay = averagePatientsPerDay;
        this.expertise = expertise;
    }

    public int getAveragePatientsPerDay() {
        return averagePatientsPerDay;
    }

    public void setAveragePatientsPerDay(int averagePatientsPerDay) {
        this.averagePatientsPerDay = averagePatientsPerDay;
    }

    public String getExpertise() {
        return expertise;
    }

    public void setExpertise(String expertise) {
        this.expertise = expertise;
    }

    public String toString(){
        return "Name: " + getFullName() + "\n" + "Seniority: " + getSeniority() + "\n" + "Average patients per day: " + getAveragePatientsPerDay() + "\n" + "Field of expertise: " + getExpertise();
    }
}
