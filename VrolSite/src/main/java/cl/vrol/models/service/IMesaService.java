/*
 * 
 */
package cl.vrol.models.service;

import java.util.List;

import cl.vrol.models.entity.Mesa;

// TODO: Auto-generated Javadoc
/**
 * The Interface IMesaService.
 */
public interface IMesaService {
	
	/**
	 * Lista mesas.
	 *
	 * @return the list
	 */
	List<Mesa> listaMesas();
	
	/**
	 * Buscar por mesa ID.
	 *
	 * @param idMesa the id mesa
	 * @return the mesa
	 */
	Mesa buscarPorMesaID(Long idMesa);

	/**
	 * Gets the cupos disponibles.
	 *
	 * @param idMesa the id mesa
	 * @return the cupos disponibles
	 */
	int getCuposDisponibles(Long idMesa);
	
	
}
