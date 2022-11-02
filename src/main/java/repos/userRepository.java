package repos;

import models.user;
import org.springframework.data.jpa.repository.JpaRepository;


public interface userRepository extends JpaRepository<user, Integer> {

}
