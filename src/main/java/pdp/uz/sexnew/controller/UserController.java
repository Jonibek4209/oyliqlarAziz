package pdp.uz.sexnew.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pdp.uz.sexnew.entity.User;
import pdp.uz.sexnew.entity.enums.Roles;
import pdp.uz.sexnew.payload.UserDto;
import pdp.uz.sexnew.repository.UserRepository;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    UserRepository userRepository;

    @PostMapping
    public String add(@RequestBody UserDto userDto) {
        boolean exists = userRepository.existsByPhoneNumberOrFullname(userDto.getPhoneNumber(), userDto.getFullname());
        if (exists) {
            return "Already by exists";
        }

        User user = new User();
        user.setFullname(userDto.getFullname());
        user.setRoles(userDto.getRoles());
        user.setPhoneNumber(userDto.getPhoneNumber());
        userRepository.save(user);
        return "Saved User";
    }
}
