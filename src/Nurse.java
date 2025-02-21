public class Nurse extends Employee {
    private boolean isHeadNurse;

    public Nurse(String firstName, String lastName, int startingYear, boolean isHeadNurse) {
        super(firstName, lastName, startingYear);
        this.isHeadNurse = isHeadNurse;
    }

    public boolean isHeadNurse() {
        return isHeadNurse;
    }

    public void setHeadNurse(boolean headNurse) {
        isHeadNurse = headNurse;
    }

    public String toString() {
        return "Name: " + this.getFullName() + "\n" + "Head nurse: " + this.isHeadNurse + "\n" + "Seniority: " + getSeniority();
    }
}
