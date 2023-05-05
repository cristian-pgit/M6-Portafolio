package cl.vrol.models.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cl.vrol.model.entity.Mesa;

@Repository
public interface MesaRepository extends JpaRepository<Mesa, Long>{
	
	

}
