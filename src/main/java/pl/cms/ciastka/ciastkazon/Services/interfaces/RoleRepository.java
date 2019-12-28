package pl.cms.ciastka.ciastkazon.Services.interfaces;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.cms.ciastka.ciastkazon.domain.Role;
import pl.cms.ciastka.ciastkazon.domain.RoleName;

import java.util.Optional;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(RoleName roleName);
}