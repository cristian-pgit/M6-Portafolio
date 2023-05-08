package cl.vrol.models.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import cl.vrol.model.entity.Authority;
import cl.vrol.util.AuthorityName;

public interface AuthorityRepository extends JpaRepository<Authority, Long>{
	
	Optional<Authority> findByName(AuthorityName name);
	

}
