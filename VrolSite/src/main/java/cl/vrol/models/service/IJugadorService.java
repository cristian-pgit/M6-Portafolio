package cl.vrol.models.service;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import cl.vrol.models.entity.Jugador;
import cl.vrol.models.entity.Mesa;

public interface IJugadorService {
	
	public List<Jugador> listarTodos();
	public void guardar(Jugador jugador);
	public Jugador buscarPorId(Long idInscrito);
	public void eliminar(Long idInscrito);
	public List<Jugador> findAllbyOrderIdAsc();
	public List<Jugador> findAllbyOrderIdDes();
	public List<Jugador> findAllByMesa(Mesa mesa);
	public Long findByMesa(Long idMesa);
	

}
