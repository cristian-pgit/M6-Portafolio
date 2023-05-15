/*
 * 
 */
package cl.vrol.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cl.vrol.models.entity.Jugador;
import cl.vrol.models.service.IJugadorService;

/**
 * The Class ListarJController.
 */
@RestController
@RequestMapping("/listarJ")
public class ListarJController {
	
	/** The player service. */
	@Autowired
	private IJugadorService playerService;
	
	
	/**
	 * Listar jugadores.
	 *
	 * @param model the model
	 * @return the list
	 */
	@GetMapping("/")
	public List<Jugador> listarJugadores(Model model) {
		List<Jugador> listaInscritos = playerService.listarTodos();
		return listaInscritos;
	}
	
	/**
	 * Jugadaor X id.
	 *
	 * @param idInscrito the id inscrito
	 * @return the jugador
	 */
	@GetMapping("/{id}")
    public Jugador jugadaorXId(@PathVariable("id") Long idInscrito){
        Jugador player = playerService.buscarPorId(idInscrito);
        return player;
    }
	
	

}
