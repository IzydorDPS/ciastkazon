package pl.cms.ciastka.ciastkazon.Services.interfaces;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.cms.ciastka.ciastkazon.domain.ApplicationUser;

public interface  UserRepository extends JpaRepository<ApplicationUser, Long> {
    ApplicationUser findByUsername(String username);
}
