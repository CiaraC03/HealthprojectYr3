package ie.atu.healthpatientproject;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "appointment-service", url = "${feign.url}")
public interface PatientClient {
    @PostMapping("/appointment")
    String patientDetails(@RequestBody Patient patient);

}
