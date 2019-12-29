package pl.cms.ciastka.ciastkazon.Services.interfaces;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.cms.ciastka.ciastkazon.domain.ApplicationUser;

import java.util.List;
import java.util.Optional;

public interface UserRepository extends JpaRepository<ApplicationUser, Long> {
    ApplicationUser findByEmail(String email);

    Optional<ApplicationUser> findByUsernameOrEmail(String username, String email);

    List<ApplicationUser> findByIdIn(List<Long> userIds);

    ApplicationUser findByUsername(String username);

    Boolean existsByUsername(String username);

    Boolean existsByEmail(String email);

    @Override
    List<ApplicationUser> findAll();
}
