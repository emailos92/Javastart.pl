package pl.hospital.model;

public class Hospital {
    private final int MAX_PATIENTS = 1000;
    private Patient[] patients;
    private int patientNumCurr;
    private int patientNumLast;
    private int patientNumMax;
    private int patientsNumInQueue;

    public Hospital(int patientNumMax) {
        if((patientNumMax > 0) && (patientNumMax <= MAX_PATIENTS)) {
            this.patients = new Patient[patientNumMax];
            this.patientNumCurr = 0;
            this.patientNumLast = 0;
            this.patientNumMax = patientNumMax;
            this.patientsNumInQueue = 0;
        }
        else
        {
            System.out.println("Wrong size of patientNumMax:" + patientNumMax);
        }
    }

    public Patient[] getPatients() {
        return patients;
    }

    public void setPatients(Patient[] patients) {
        this.patients = patients;
    }

    public int getPatientNumCurr() {
        return patientNumCurr;
    }

    public void setPatientNumCurr(int patientNumCurr) {
        this.patientNumCurr = patientNumCurr;
    }

    public int getPatientNumLast() {
        return patientNumLast;
    }

    public void setPatientNumLast(int patientNumLast) {
        this.patientNumLast = patientNumLast;
    }

    public int getPatientNumMax() {
        return patientNumMax;
    }

    public void setPatientNumMax(int patientNumMax) {
        this.patientNumMax = patientNumMax;
    }

    public int getPatientsNumInQueue() {
        return patientsNumInQueue;
    }

    public void setPatientsNumInQueue(int patientsNumInQueue) {
        this.patientsNumInQueue = patientsNumInQueue;
    }
}
