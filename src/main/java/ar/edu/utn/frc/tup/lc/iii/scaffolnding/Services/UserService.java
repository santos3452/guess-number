package ar.edu.utn.frc.tup.lc.iii.scaffolnding.Services;


import ar.edu.utn.frc.tup.lc.iii.scaffolnding.Models.User;
import org.springframework.stereotype.Service;

@Service
public interface UserService {

    User createUser(String userName, String email);
}
