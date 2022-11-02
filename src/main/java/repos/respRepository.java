package repos;

import models.response;
import org.springframework.data.jpa.repository.JpaRepository;

public interface respRepository extends JpaRepository<response, Integer>  {
}
