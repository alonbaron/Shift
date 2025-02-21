public class Patient {
    private int id;
    private boolean isUrgent;
    private TreatmentType treatmentType;

    public Patient(int id, boolean isUrgent,TreatmentType treatmentType) {
        this.id = id;
        this.isUrgent = isUrgent;
        this.treatmentType = treatmentType;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isUrgent() {
        return isUrgent;
    }

    public void setUrgent(boolean urgent) {
        isUrgent = urgent;
    }

    public TreatmentType getTreatmentType() {
        return treatmentType;
    }

    public void setTreatmentType(TreatmentType treatmentType) {
        this.treatmentType = treatmentType;
    }

    public enum TreatmentType{
        NURSE_CHECK,
        FAMILY_DOCTOR_CHECK,
        SPECIALIST_CHECK;
    }

    public String toString() {
        return "ID: " + getId() + "\n" + "Is the appointment urgent: " + isUrgent() + "\n" + "Treatment Type: " + getTreatmentType();
    }
}
