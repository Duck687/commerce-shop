package Repos;

import Models.product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface prodRepository extends JpaRepository<product, Integer> {
}
