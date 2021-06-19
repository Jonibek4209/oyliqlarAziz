package pdp.uz.sexnew.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pdp.uz.sexnew.entity.User;
import pdp.uz.sexnew.entity.enums.Roles;

import java.util.List;
import java.util.Optional;

public interface UserRepository extends JpaRepository<User,Integer> {
    boolean existsByPhoneNumberOrFullname(String phoneNumber, String fullname);

    List<User> findAllByRoles(Roles roles);
}
