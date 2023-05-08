package cl.vrol.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import cl.vrol.model.entity.Jugador;
import cl.vrol.model.entity.Mesa;
import cl.vrol.models.service.IJugadorService;
import cl.vrol.models.service.IMesaService;
import jakarta.validation.Valid;

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
	public String inscribir(@Valid @ModelAttribute Jugador jugador, BindingResult result, 
			Model model, RedirectAttributes attribute) {
		List<Mesa> listaMesas = mesaService.listaMesas();
		
		if (result.hasErrors()) {
			model.addAttribute("titulo", "Inscribir - Nuevo Jugador");
			model.addAttribute("jugador", jugador);
			model.addAttribute("mesas", listaMesas);
			System.out.println("Hubo errores en el formulario");
			return "/views/jugadores/frmInscrito";
		}
		
		playerService.guardar(jugador);
		System.out.println("Jugador Inscrito");
		attribute.addFlashAttribute("success", "Jugador Inscrito!");
		return "redirect:/views/jugadores/";
	}
	
	@GetMapping("/edit/{id}")
	public String editarInscrito(@PathVariable("id") Long idInscrito, 
			Model model, RedirectAttributes attribute) {
		
		Jugador jugador = null;
		
		if(idInscrito> 0) {
			jugador = playerService.buscarPorId(idInscrito);
			
			if(jugador == null) {
				System.out.println("Error: El ID de Jugador no exste!");
				attribute.addFlashAttribute("error", "ATENCIÓN: El ID de Jugador no exIste!");
				return "redirect:/views/jugadores/";
			}
		}else {
			System.out.println("Error: Error con ID de Jugador");
			attribute.addFlashAttribute("error", "ATENCIÓN: El ID de Jugador no exIste!");
			return "redirect:/views/jugadores/";
		}
		
		List<Mesa> listaMesas = mesaService.listaMesas();
		
		model.addAttribute("titulo", "Editar Jugador");
		model.addAttribute("jugador", jugador);
		model.addAttribute("mesas", listaMesas);
		
		return "/views/jugadores/frmInscrito";
	}
	
	@GetMapping("/delete/{id}")
	public String eliminarInscrito(@PathVariable("id") Long idInscrito
			, RedirectAttributes attribute) {
		
		Jugador jugador = null;
		
		if(idInscrito> 0) {
			jugador = playerService.buscarPorId(idInscrito);
			
			if(jugador == null) {
				System.out.println("Error: El ID de Jugador no exste!");
				attribute.addFlashAttribute("error", "ATENCIÓN: El ID de Jugador no exste!");
				return "redirect:/views/jugadores/";
			}
		}else {
			System.out.println("Error: Error con ID de Jugador");
			attribute.addFlashAttribute("error", "ATENCIÓN: El ID de Jugador no exste!");
			return "redirect:/views/jugadores/";
		}
		
		playerService.eliminar(idInscrito);
		System.out.println("Inscrito Eliminado con Exito");
		attribute.addFlashAttribute("warning", "Jugador Eliminado con Exito!");
		
		return "redirect:/views/jugadores/";
	}

}
