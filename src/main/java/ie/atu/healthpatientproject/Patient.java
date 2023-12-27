package ie.atu.healthpatientproject;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Patient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long patientId;
    @NotBlank
    private String name;

    @NotBlank
    private String lastName;

    @NotBlank
    private String gender;

    @Min(18)
    private int age;

    @NotBlank
    private String contactNum;

    @Email
    private String email;

    @NotBlank
    private String address;

}
