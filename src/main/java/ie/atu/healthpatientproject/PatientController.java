package ie.atu.healthpatientproject;

import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/patient")
@RestController
public class PatientController {

    private final PatientService patientService;

    public PatientController(PatientService patientService) {
        this.patientService = patientService;
    }


    @GetMapping("/{patientId}")
    public ResponseEntity<?> getPatient(@PathVariable String patientId) {
        if (patientId.length() > 5 || patientId.isBlank()) {
            return ResponseEntity.badRequest().body("PatientId is invalid");
        }

        Patient patient = patientService.getPatientByPatientId(patientId);

        if (patient == null) {
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok(patient);
    }

    @GetMapping("/findAllPatients")
    public ResponseEntity<?> getAllPatients() {


        List<Patient> patient = patientService.getAllPatients();

        if (patient == null) {
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok(patient);
    }
    @PostMapping("/createPatient")
    public ResponseEntity<String>create(@Valid @RequestBody Patient patient) {
        patientService.savePatient(patient);
        return new ResponseEntity<>("Patient created successfully", HttpStatus.OK);
    }

}
