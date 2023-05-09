package cl.vrol.models.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import cl.vrol.models.entity.Jugador;

@Repository
public interface JugadorRepository extends JpaRepository<Jugador, Long> {

	
	
}
