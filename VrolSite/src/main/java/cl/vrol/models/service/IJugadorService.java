/*
 * 
 */
package cl.vrol.models.service;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import cl.vrol.models.entity.Jugador;
import cl.vrol.models.entity.Mesa;

// TODO: Auto-generated Javadoc
/**
 * The Interface IJugadorService.
 */
public interface IJugadorService {
	
	/**
	 * Listar todos.
	 *
	 * @return the list
	 */
	public List<Jugador> listarTodos();
	
	/**
	 * Guardar.
	 *
	 * @param jugador the jugador
	 */
	public void guardar(Jugador jugador);
	
	/**
	 * Buscar por id.
	 *
	 * @param idInscrito the id inscrito
	 * @return the jugador
	 */
	public Jugador buscarPorId(Long idInscrito);
	
	/**
	 * Eliminar.
	 *
	 * @param idInscrito the id inscrito
	 */
	public void eliminar(Long idInscrito);
	
	/**
	 * Find allby order id asc.
	 *
	 * @return the list
	 */
	public List<Jugador> findAllbyOrderIdAsc();
	
	/**
	 * Find allby order id des.
	 *
	 * @return the list
	 */
	public List<Jugador> findAllbyOrderIdDes();
	
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
	 * @param idMesa the id mesa
	 * @return the long
	 */
	public Long findByMesa(Long idMesa);
	

}
