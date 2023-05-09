package cl.vrol.models.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.vrol.models.entity.Jugador;
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

}
