package cl.vrol.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import cl.vrol.model.entity.Jugador;
import cl.vrol.model.entity.Mesa;
import cl.vrol.models.service.IJugadorService;
import cl.vrol.models.service.IMesaService;

@Controller
@RequestMapping("/views/jugadores")
public class JugadorController {
	
	@Autowired
	private IJugadorService playerService;
	
	@Autowired
	private IMesaService mesaService;
	
	@GetMapping("/")
	public String listarJugadores(Model model) {
		List<Jugador> listaInscritos = playerService.listarTodos();
		model.addAttribute("titulo", "Lista de Inscritos");
		model.addAttribute("inscritos", listaInscritos);
		return "/views/jugadores/listarinscritos";
	}
	
	@GetMapping("/nuevoinscrito")
	public String crearInscrito(Model model) {
		
		Jugador jugador = new Jugador();
		List<Mesa> listaMesas = mesaService.listaMesas();
		
		model.addAttribute("titulo", "Inscribir - Nuvo Jugador");
		model.addAttribute("jugador", jugador);
		model.addAttribute("mesas", listaMesas);
		
		return "/views/jugadores/frmInscrito";
	}
	
	@PostMapping("/inscribir")
	public String inscribir(@ModelAttribute Jugador jugador) {
		playerService.guardar(jugador);
		return "redirect:/views/jugadores/";
	}

}
