package ar.edu.utn.frc.tup.lc.iii.scaffolnding.dtos;


import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.Email;
import lombok.*;

@Data
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor

public class UserDto {

    private Long id;

    @JsonProperty("username")
    private String userName;

    @Email
    private String email;
}
