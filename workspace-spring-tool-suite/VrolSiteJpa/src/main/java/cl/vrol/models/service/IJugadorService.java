package cl.vrol.models.service;

import java.util.List;

import cl.vrol.model.entity.Jugador;

public interface IJugadorService {
	
	public List<Jugador> listarTodos();
	public void guardar(Jugador jugador);
	public Jugador buscarPorId(Long idInscrito);
	public void eliminar(Long idInscrito);
	

}
