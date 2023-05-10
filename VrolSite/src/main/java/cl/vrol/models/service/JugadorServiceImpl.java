package cl.vrol.models.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.vrol.models.entity.Jugador;
import cl.vrol.models.entity.Mesa;
import cl.vrol.models.repository.JugadorRepository;

@Service
public class JugadorServiceImpl implements IJugadorService {
	
	@Autowired
	private JugadorRepository playerRepository;

	@Override
	public List<Jugador> listarTodos() {
		return (List<Jugador>) playerRepository.findAll();
	}

	@Override
	public void guardar(Jugador jugador) {
		playerRepository.save(jugador);
	}

	@Override
	public Jugador buscarPorId(Long idInscrito) {
		return playerRepository.findById(idInscrito).orElse(null);
	}

	@Override
	public void eliminar(Long idInscrito) {
		playerRepository.deleteById(idInscrito);
	}

	@Override
	public List<Jugador> findAllbyOrderIdAsc() {
		return playerRepository.findAllByOrderByIdInscritoAsc();
	}

	@Override
	public List<Jugador> findAllbyOrderIdDes() {
		return playerRepository.findAllByOrderByIdInscritoDesc();
	}

	@Override
	public List<Jugador> findAllByMesa(Mesa mesa) {
		return playerRepository.findAllByMesa(mesa);
	}

	@Override
	public Long findByMesa(Long mesa) {
		return playerRepository.findByMesa(mesa);
	}

	
	
}
