package ie.atu.healthpatientproject;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PatientService {

    private final PatientRepository patientRepository;

    public PatientService(PatientRepository patientRepository) {
        this.patientRepository = patientRepository;
    }

    //save a patients details
    public void savePatient(Patient patient)
    {
        patientRepository.save(patient);
    }

    //retreive patients details by their id
    public Patient getPatientByPatientId(String patientId)
    {
        return patientRepository.findByPatientId(patientId);
    }

    public List<Patient> getAllPatients()
    {
        return patientRepository.findAll();
    }
}
