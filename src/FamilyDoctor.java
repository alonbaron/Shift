public class FamilyDoctor extends Employee {
    private int averagePatientsPerDay;

    public FamilyDoctor(String firstName, String lastName, int startingYear, int averagePatientsPerDay) {
        super(firstName, lastName, startingYear);
        this.averagePatientsPerDay = averagePatientsPerDay;
    }

    public int getAveragePatientsPerDay() {
        return averagePatientsPerDay;
    }

    public void setAveragePatientsPerDay(int averagePatientsPerDay) {
        this.averagePatientsPerDay = averagePatientsPerDay;
    }

    public String toString(){
        return "Name: " + this.getFullName() + "\n" + "Seniority: " + getSeniority() + "\n" + "Average patients per day: " + getAveragePatientsPerDay();
    }
}
