/*
 * 
 */
package cl.vrol.models.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;

import cl.vrol.models.entity.Mesa;
import cl.vrol.models.repository.JugadorRepository;
import cl.vrol.models.repository.MesaRepository;

// TODO: Auto-generated Javadoc
/**
 * The Class MesaServiceImpl.
 */
@Service
public class MesaServiceImpl implements IMesaService{

	/** The mesa repository. */
	@Autowired
	private MesaRepository mesaRepository;
	
	/** The jugador repository. */
	@Autowired
	private JugadorRepository jugadorRepository;
	
	/**
	 * Lista mesas.
	 *
	 * @return the list
	 */
	@Override
	public List<Mesa> listaMesas() {
		
		return (List<Mesa>) mesaRepository.findAll();
	}

	/**
	 * Buscar por mesa ID.
	 *
	 * @param idMesa the id mesa
	 * @return the mesa
	 */
	@Override
	public Mesa buscarPorMesaID(Long idMesa) {

		return mesaRepository.findById(idMesa).orElse(null);
	}
	
	/**
	 * Gets the cupos disponibles.
	 *
	 * @param idMesa the id mesa
	 * @return the cupos disponibles
	 */
	@Override
	public int getCuposDisponibles(Long idMesa) {
	    Mesa mesa = buscarPorMesaID(idMesa);
	    if (mesa == null) {
	        // Si la mesa no existe, se puede lanzar una excepción o retornar un valor por defecto
	        return 0;
	    }
	    int jugadoresEnMesa = mesaRepository.countJugadoresByMesaId(idMesa);
	    int cuposDisponibles = mesa.getCupos() - jugadoresEnMesa;
	    return cuposDisponibles;
	}

	@Override
	public void guardar(Mesa mesa) {
		mesaRepository.save(mesa);
	}

	@Override
	public void eliminar(Long idMesa) {
		mesaRepository.deleteById(idMesa);
		
	}
	

}
