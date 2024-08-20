package ar.edu.utn.frc.tup.lc.iii.scaffolnding.Entities;


import jakarta.persistence.*;
import lombok.Cleanup;
import lombok.Data;

@Entity
@Data
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;


    @Column(name = "username", nullable = false)
    private  String userName;

    @Column(name = "email", nullable = false)
    private String email;

}
