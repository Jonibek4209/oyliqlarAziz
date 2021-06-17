package pdp.uz.sexnew.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pdp.uz.sexnew.entity.Price;

public interface PriceRepository extends JpaRepository<Price, Integer> {
}