package ar.edu.utn.frc.tup.lc.iii.scaffolnding.Models;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
public class User {

    private Long id;
    private String userName;
    private String email;
}
