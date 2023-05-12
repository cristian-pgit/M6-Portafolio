/*
 * 
 */
package cl.vrol.models.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.vrol.models.entity.Jugador;
import cl.vrol.models.entity.Mesa;
import cl.vrol.models.repository.JugadorRepository;

// TODO: Auto-generated Javadoc
/**
 * The Class JugadorServiceImpl.
 */
@Service
public class JugadorServiceImpl implements IJugadorService {
	
	/** The player repository. */
	@Autowired
	private JugadorRepository playerRepository;

	/**
	 * Listar todos.
	 *
	 * @return the list
	 */
	@Override
	public List<Jugador> listarTodos() {
		return (List<Jugador>) playerRepository.findAll();
	}

	/**
	 * Guardar.
	 *
	 * @param jugador the jugador
	 */
	@Override
	public void guardar(Jugador jugador) {
		playerRepository.save(jugador);
	}

	/**
	 * Buscar por id.
	 *
	 * @param idInscrito the id inscrito
	 * @return the jugador
	 */
	@Override
	public Jugador buscarPorId(Long idInscrito) {
		return playerRepository.findById(idInscrito).orElse(null);
	}

	/**
	 * Eliminar.
	 *
	 * @param idInscrito the id inscrito
	 */
	@Override
	public void eliminar(Long idInscrito) {
		playerRepository.deleteById(idInscrito);
	}

	/**
	 * Find allby order id asc.
	 *
	 * @return the list
	 */
	@Override
	public List<Jugador> findAllbyOrderIdAsc() {
		return playerRepository.findAllByOrderByIdInscritoAsc();
	}

	/**
	 * Find allby order id des.
	 *
	 * @return the list
	 */
	@Override
	public List<Jugador> findAllbyOrderIdDes() {
		return playerRepository.findAllByOrderByIdInscritoDesc();
	}

	/**
	 * Find all by mesa.
	 *
	 * @param mesa the mesa
	 * @return the list
	 */
	@Override
	public List<Jugador> findAllByMesa(Mesa mesa) {
		return playerRepository.findAllByMesa(mesa);
	}

	/**
	 * Find by mesa.
	 *
	 * @param mesa the mesa
	 * @return the long
	 */
	@Override
	public Long findByMesa(Long mesa) {
		return playerRepository.findByMesa(mesa);
	}

	
	
}
