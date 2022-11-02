package repos;

import models.basket;
import org.springframework.data.jpa.repository.JpaRepository;

public interface basketRepository extends JpaRepository<basket, Integer> {
}
