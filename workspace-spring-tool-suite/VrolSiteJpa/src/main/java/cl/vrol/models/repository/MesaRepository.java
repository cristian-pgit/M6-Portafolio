package cl.vrol.models.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import cl.vrol.model.entity.Mesa;

@Repository
public interface MesaRepository extends JpaRepository<Mesa, Long>{
	
	@Query("SELECT COUNT(j) FROM Jugador j WHERE j.mesa.id = :idMesa")
	int countJugadoresByMesaId(@Param("idMesa") Long idMesa);
	
	

}
