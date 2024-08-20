package ar.edu.utn.frc.tup.lc.iii.scaffolnding.Repositories;

import ar.edu.utn.frc.tup.lc.iii.scaffolnding.Entities.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, Long> {

    Optional<UserEntity> getByEmail(String email);
}
