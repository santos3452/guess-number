package ar.edu.utn.frc.tup.lc.iii.scaffolnding.Services.impl;

import ar.edu.utn.frc.tup.lc.iii.scaffolnding.Entities.UserEntity;
import ar.edu.utn.frc.tup.lc.iii.scaffolnding.Models.User;
import ar.edu.utn.frc.tup.lc.iii.scaffolnding.Repositories.UserRepository;
import ar.edu.utn.frc.tup.lc.iii.scaffolnding.Services.UserService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private ModelMapper modelMapper;

    @Override
    public User createUser(String userName, String email) {
        Optional<UserEntity> userEntityOptional = userRepository.getByEmail(email);
        if (userEntityOptional.isPresent()) {
       //TODO: throw exception
            return null;
        }else {
            UserEntity userEntity = new UserEntity();
            userEntity.setEmail(email);
            userEntity.setUserName(userName);
            userRepository.save(userEntity);
            return modelMapper.map(userEntity, User.class);
        }

    }
}
