package pl.hospital.app;

import pl.hospital.logic.HospitalLogic;
import pl.hospital.model.Hospital;
import pl.hospital.model.Patient;

public class HospitalApp {
    public static void main(String[] args) {
        Hospital hospital = new Hospital(100);
        HospitalLogic hospitalLogic = new HospitalLogic();
        Patient patient = new Patient("Jan","Kowalski","92072903211");

        hospitalLogic.addPatientToQueue(hospital,patient);
        hospitalLogic.showPatientsInQueue(hospital);
        hospitalLogic.handleNextPatient(hospital);
    }
}
