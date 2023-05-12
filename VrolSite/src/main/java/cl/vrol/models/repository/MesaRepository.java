/*
 * 
 */
package cl.vrol.models.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import cl.vrol.models.entity.Mesa;

// TODO: Auto-generated Javadoc
/**
 * The Interface MesaRepository.
 */
@Repository
public interface MesaRepository extends JpaRepository<Mesa, Long>{
	
	/**
	 * Count jugadores by mesa id.
	 *
	 * @param idMesa the id mesa
	 * @return the int
	 */
	@Query("SELECT COUNT(j) FROM Jugador j WHERE j.mesa.id = :idMesa")
	int countJugadoresByMesaId(@Param("idMesa") Long idMesa);
	
	

}
