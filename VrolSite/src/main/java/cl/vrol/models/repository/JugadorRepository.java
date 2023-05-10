package cl.vrol.models.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import cl.vrol.models.entity.Jugador;
import cl.vrol.models.entity.Mesa;


public interface JugadorRepository extends JpaRepository<Jugador, Long> {

	public List<Jugador> findAllByOrderByIdInscritoAsc();
	public List<Jugador> findAllByOrderByIdInscritoDesc();
	public List<Jugador> findAllByMesa(Mesa mesa);
	@Query("SELECT COUNT(j)  FROM Jugador j JOIN j.mesa m WHERE m.idMesa =:idMesa")
	public Long findByMesa(@Param("idMesa") Long mesa);
	
}
