package pl.cms.ciastka.ciastkazon.Services;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import pl.cms.ciastka.ciastkazon.Services.interfaces.UserRepository;
import pl.cms.ciastka.ciastkazon.domain.ApplicationUser;
import pl.cms.ciastka.ciastkazon.security.UserPrincipal;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {
    private UserRepository applicationUserRepository;

    public UserDetailsServiceImpl(UserRepository applicationUserRepository) {
        this.applicationUserRepository = applicationUserRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        ApplicationUser applicationUser = applicationUserRepository.findByUsername(username);
        if (applicationUser == null) {
            throw new UsernameNotFoundException(username);
        }
        return UserPrincipal.create(applicationUser);
    }

    public UserDetails loadUserById(Long id) {
        ApplicationUser applicationUser = applicationUserRepository.findById(id).orElseThrow(
                () -> new UsernameNotFoundException("User not found with id : " + id)
        );

        return UserPrincipal.create(applicationUser);

    }

}