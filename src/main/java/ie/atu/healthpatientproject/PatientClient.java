package ie.atu.healthpatientproject;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "appointment-service", url = "http://localhost:8081")
public interface PatientClient {
    @PostMapping("/confirm")
    String patientDetails(@RequestBody Patient patient);

}
