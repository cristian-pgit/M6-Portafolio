package cl.vrol.models.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import cl.vrol.model.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
	Optional<User> findByUserName(String userName);

}
