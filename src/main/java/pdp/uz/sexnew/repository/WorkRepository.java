package pdp.uz.sexnew.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pdp.uz.sexnew.entity.Work;

public interface WorkRepository extends JpaRepository<Work, Integer> {
}