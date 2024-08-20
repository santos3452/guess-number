package ar.edu.utn.frc.tup.lc.iii.scaffolnding.Controllers;

import ar.edu.utn.frc.tup.lc.iii.scaffolnding.Models.Dummy;
import ar.edu.utn.frc.tup.lc.iii.scaffolnding.Models.User;
import ar.edu.utn.frc.tup.lc.iii.scaffolnding.Services.UserService;
import ar.edu.utn.frc.tup.lc.iii.scaffolnding.dtos.DummyDto;
import ar.edu.utn.frc.tup.lc.iii.scaffolnding.dtos.UserDto;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/guess-number/users")
public class UserCotroller {

    @Autowired
    private UserService userService;

    @Autowired
    private ModelMapper modelMapper;

    @PostMapping()
    public ResponseEntity<UserDto> CreateDummy(@RequestBody UserDto userDto) {
        User user =  userService.createUser(userDto.getUserName(), userDto.getEmail());
        UserDto userDtoCreated = modelMapper.map(user, UserDto.class);
        return ResponseEntity.ok(userDtoCreated);
    }
}
