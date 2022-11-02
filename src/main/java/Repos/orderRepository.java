package Repos;

import Models.order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface orderRepository extends JpaRepository<order, Integer> {
}
