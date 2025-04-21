package backend.java.spring.boot.crud.project.repository;

import backend.java.spring.boot.crud.project.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
