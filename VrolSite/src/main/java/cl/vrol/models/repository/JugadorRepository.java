/*
 * 
 */
package cl.vrol.models.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import cl.vrol.models.entity.Jugador;
import cl.vrol.models.entity.Mesa;


// TODO: Auto-generated Javadoc
/**
 * The Interface JugadorRepository.
 */
public interface JugadorRepository extends JpaRepository<Jugador, Long> {

	/**
	 * Find all by order by id inscrito asc.
	 *
	 * @return the list
	 */
	public List<Jugador> findAllByOrderByIdInscritoAsc();
	
	/**
	 * Find all by order by id inscrito desc.
	 *
	 * @return the list
	 */
	public List<Jugador> findAllByOrderByIdInscritoDesc();
	
	/**
	 * Find all by mesa.
	 *
	 * @param mesa the mesa
	 * @return the list
	 */
	public List<Jugador> findAllByMesa(Mesa mesa);
	
	/**
	 * Find by mesa.
	 *
	 * @param mesa the mesa
	 * @return the long
	 */
	@Query("SELECT COUNT(j)  FROM Jugador j JOIN j.mesa m WHERE m.idMesa =:idMesa")
	public Long findByMesa(@Param("idMesa") Long mesa);
	
}
