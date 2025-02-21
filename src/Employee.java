public abstract class Employee {
    private String firstName;
    private String lastName;
    private int seniority;

    public Employee(String firstName, String lastName, int startingYear) {
        this.firstName = firstName;
        this.lastName = lastName;
        int currentYear = 2025;
        this.seniority = currentYear - startingYear;
    }

    public String getFullName() {
        return this.firstName + " " + this.lastName;
    }
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getSeniority() {
        return seniority;
    }
    public void setSeniority(int seniority) {
        this.seniority = seniority;
    }
    @Override
    public abstract String toString();
}
