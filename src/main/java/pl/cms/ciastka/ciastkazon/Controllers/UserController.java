package pl.cms.ciastka.ciastkazon.Controllers;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.cms.ciastka.ciastkazon.Exceptions.UsernameAlreadyExists;
import pl.cms.ciastka.ciastkazon.domain.ApplicationUser;
import pl.cms.ciastka.ciastkazon.Services.interfaces.UserRepository;
@RestController
@RequestMapping("/users")
public class UserController {
    private UserRepository applicationUserRepository;
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    public UserController(UserRepository applicationUserRepository,
                          BCryptPasswordEncoder bCryptPasswordEncoder) {
        this.applicationUserRepository = applicationUserRepository;
        this.bCryptPasswordEncoder = bCryptPasswordEncoder;
    }

    @PostMapping("/sign-up")
    public String signUp(@RequestBody ApplicationUser user) throws UsernameAlreadyExists {

        if(applicationUserRepository.findByUsername(user.getUsername())!=null){
          return "UsernameAlreadyExists";
        }
        user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
        applicationUserRepository.save(user);
        return "Success";
    }
}
