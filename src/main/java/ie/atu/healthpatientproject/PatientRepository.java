package ie.atu.healthpatientproject;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository extends JpaRepository<Patient, Long> {
    Patient findByPatientId(String patientId);

}

