package pdp.uz.sexnew.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pdp.uz.sexnew.entity.User;

public interface UserRepository extends JpaRepository<User,Integer> {
    boolean existsByPhoneNumberOrFullname(String phoneNumber, String fullname);

}
