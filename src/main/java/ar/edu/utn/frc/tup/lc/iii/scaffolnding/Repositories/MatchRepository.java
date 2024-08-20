package ar.edu.utn.frc.tup.lc.iii.scaffolnding.Repositories;

import ar.edu.utn.frc.tup.lc.iii.scaffolnding.Entities.MatchEntity;
import ar.edu.utn.frc.tup.lc.iii.scaffolnding.Entities.UserEntity;
import ar.edu.utn.frc.tup.lc.iii.scaffolnding.Models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MatchRepository extends JpaRepository<MatchEntity, Long> {
}
