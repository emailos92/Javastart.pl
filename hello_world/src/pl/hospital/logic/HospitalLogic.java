package pl.hospital.logic;

import pl.hospital.model.Hospital;
import pl.hospital.model.Patient;

public class HospitalLogic {

    public void addPatientToQueue(Hospital hospital, Patient patient) {
        if (hospital.getPatientsNumInQueue() < hospital.getPatientNumMax()) {  //wolne miejsca
            if (hospital.getPatientNumCurr() == hospital.getPatientNumLast()) {
                System.out.println("Kolejka jest pusta");
            }
            System.out.println("Dodaje pacjenta: ");

            //get pointer to patients from hospital
            Patient[] patients = hospital.getPatients();
            patients[hospital.getPatientNumLast()] = patient;
            patients[hospital.getPatientNumLast()].printInfo();

            //increment patients in queue
            hospital.setPatientsNumInQueue(hospital.getPatientsNumInQueue() + 1);

            //set new pointer to last patient
            if(hospital.getPatientNumLast() != hospital.getPatientNumMax() - 1) {
                hospital.setPatientNumLast(hospital.getPatientNumLast() + 1);
            } else {
                hospital.setPatientNumLast(0);
            }

            System.out.println("Pacjent dodany do kolejki, ilość osób oczekujących to: " + hospital.getPatientsNumInQueue());
        } else {
            System.out.println("Brak miejsca w kolejce");
        }
    }

    public void showPatientsInQueue(Hospital hospital) {
       /* for (int i = 0; i < hospital.getPatientNumMax(); i++) {
            if(hospital.getPatients()[i].getFirstName() != null) {
                System.out.println(i + ": " + hospital.getPatients()[i].getFirstName() + " "
                        + hospital.getPatients()[i].getLastName() + " "
                        + hospital.getPatients()[i].getPesel()
                );
            }
        }*/

        System.out.println("Aktualny pacjent: " + hospital.getPatientNumCurr());
        System.out.println("Ostatni pacjent: " + hospital.getPatientNumLast());
        System.out.println("Osób w kolejce: " + hospital.getPatientsNumInQueue());
    }

    public void handleNextPatient(Hospital hospital) {
        if (hospital.getPatientsNumInQueue() > 0) {

            Patient[] patients = hospital.getPatients();

            System.out.println("Obsługa pacjeta [" + hospital.getPatientNumCurr() + "]: ");
            patients[hospital.getPatientNumCurr()].printInfo();

            //set new pointer to last patient
            if(hospital.getPatientNumCurr() != hospital.getPatientNumMax() - 1) {
                hospital.setPatientNumCurr(hospital.getPatientNumCurr() + 1);
            } else {
                hospital.setPatientNumCurr(0);
            }
        }
    }
}
