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

@RestController
@RequestMapping("/listarJ")
public class ListarJController {
	
	@Autowired
	private IJugadorService playerService;
	
	
	@GetMapping("/")
	public List<Jugador> listarJugadores(Model model) {
		List<Jugador> listaInscritos = playerService.listarTodos();
		return listaInscritos;
	}
	
	@GetMapping("/{id}")
    public Jugador jugadaorXId(@PathVariable("id") Long idInscrito){
        Jugador player = playerService.buscarPorId(idInscrito);
        return player;
    }
	
	

}
