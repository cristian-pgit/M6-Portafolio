/*
 * 
 */
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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import cl.vrol.models.entity.Jugador;
import cl.vrol.models.entity.Mesa;
import cl.vrol.models.service.IJugadorService;
import cl.vrol.models.service.IMesaService;
import jakarta.servlet.http.HttpSession;
import jakarta.validation.Valid;

// TODO: Auto-generated Javadoc
/**
 * The Class JugadorController.
 */
@Controller
@RequestMapping("/views/jugadores")
public class JugadorController {
	
	/** The player service. */
	@Autowired
	private IJugadorService playerService;
	
	/** The mesa service. */
	@Autowired
	private IMesaService mesaService;
	
	/**
	 * Listar jugadores.
	 *
	 * @param model the model
	 * @param session the session
	 * @param attribute the attribute
	 * @return the string
	 */
	@GetMapping("/")
	public String listarJugadores(Model model, HttpSession session, RedirectAttributes attribute) {
		
		if (session.getAttribute("perfil") == null ) {
			System.out.println("entro");
	        // anadir error x login no autorizado
			attribute.addFlashAttribute("error", "No Tienes Permiso para ver esta página");
	        // Redirect to the root URL
	        return "redirect:/";
	    }
		
		List<Jugador> listaInscritos = playerService.listarTodos();
		model.addAttribute("titulo", "Lista de Inscritos");
		model.addAttribute("inscritos", listaInscritos);
		return "/views/jugadores/listarinscritos";
	}
	
	/**
	 * Crear inscrito.
	 *
	 * @param model the model
	 * @param session the session
	 * @param attribute the attribute
	 * @return the string
	 */
	@GetMapping("/nuevoinscrito")
	public String crearInscrito(Model model, HttpSession session, RedirectAttributes attribute) {
		

		
		Jugador jugador = new Jugador();
		List<Mesa> listaMesas = mesaService.listaMesas();
		
		model.addAttribute("titulo", "Inscribir - Nuvo Jugador");
		model.addAttribute("jugador", jugador);
		model.addAttribute("mesas", listaMesas);
		
		return "/views/jugadores/frmInscrito";
	}
	
	/**
	 * Inscribir.
	 *
	 * @param jugador the jugador
	 * @param result the result
	 * @param model the model
	 * @param attribute the attribute
	 * @return the string
	 */
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
		return "redirect:/";
	}
	
	/**
	 * Editar inscrito.
	 *
	 * @param idInscrito the id inscrito
	 * @param model the model
	 * @param attribute the attribute
	 * @param session the session
	 * @return the string
	 */
	@GetMapping("/edit/{id}")
	public String editarInscrito(@PathVariable("id") Long idInscrito, 
			Model model, RedirectAttributes attribute, HttpSession session) {
		
		if (session.getAttribute("perfil") == null ) {
			System.out.println("entro");
	        // anadir error x login no autorizado
			attribute.addFlashAttribute("error", "No Tienes Permiso para ver esta página");
	        // Redirect to the root URL
	        return "redirect:/";
	    }
		
		Jugador jugador = null;
		
		if(idInscrito> 0) {
			jugador = playerService.buscarPorId(idInscrito);
			
			if(jugador == null) {
				System.out.println("Error: El ID de Jugador no exste!");
				attribute.addFlashAttribute("error", "ATENCIÓN: El ID de Jugador no existe!");
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
		attribute.addFlashAttribute("info", "Jugador Inscrito Editado con Exito!");
		
		return "/views/jugadores/frmInscrito";
	}
	
	/**
	 * Eliminar inscrito.
	 *
	 * @param idInscrito the id inscrito
	 * @param attribute the attribute
	 * @param session the session
	 * @param model the model
	 * @return the string
	 */
	@GetMapping("/delete/{id}")
	public String eliminarInscrito(@PathVariable("id") Long idInscrito
			, RedirectAttributes attribute, HttpSession session, Model model) {
		
		if (session.getAttribute("perfil") == null ) {
			System.out.println("entro");
	        // anadir error x login no autorizado
			attribute.addFlashAttribute("error", "No Tienes Permiso para ver esta página");
	        // Redirect to the root URL
	        return "redirect:/";
	    }
		
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

	
	/**
	 * Listar jugadores asc.
	 *
	 * @param model the model
	 * @param session the session
	 * @param attribute the attribute
	 * @return the string
	 */
	@GetMapping("/ordAsc")
	public String listarJugadoresAsc(Model model, HttpSession session, RedirectAttributes attribute) {
		
		if (session.getAttribute("perfil") == null ) {
			System.out.println("entro");
	        // anadir error x login no autorizado
			attribute.addFlashAttribute("error", "No Tienes Permiso para ver esta página");
	        // Redirect to the root URL
	        return "redirect:/";
	    }
		
		List<Jugador> listaInscritos = playerService.findAllbyOrderIdAsc();
		List<Mesa> listaMesas = mesaService.listaMesas();
		model.addAttribute("titulo", "Lista de Inscritos - Ascendente");
		model.addAttribute("inscritos", listaInscritos);
		model.addAttribute("mesas", listaMesas);
		return "/views/jugadores/listarordasc";
	}
	
	/**
	 * Listar jugadores desc.
	 *
	 * @param model the model
	 * @param session the session
	 * @param attribute the attribute
	 * @return the string
	 */
	@GetMapping("/ordDes")
	public String listarJugadoresDesc(Model model, HttpSession session, RedirectAttributes attribute) {
		
		if (session.getAttribute("perfil") == null ) {
			System.out.println("entro");
	        // anadir error x login no autorizado
			attribute.addFlashAttribute("error", "No Tienes Permiso para ver esta página");
	        // Redirect to the root URL
	        return "redirect:/";
	    }
		
		List<Jugador> listaInscritos = playerService.findAllbyOrderIdDes();
		List<Mesa> listaMesas = mesaService.listaMesas();
		model.addAttribute("titulo", "Lista de Inscritos - Descendente");
		model.addAttribute("inscritos", listaInscritos);
		model.addAttribute("mesas", listaMesas);
		return "/views/jugadores/listarorddes";
	}
	
	/**
	 * Listar jugadores by mesa id.
	 *
	 * @param mesaid the mesaid
	 * @param model the model
	 * @param session the session
	 * @param attribute the attribute
	 * @return the string
	 */
	@GetMapping("/bymesa")
	public String listarJugadoresByMesaId(@RequestParam(name = "idMesa") Long mesaid, Model model, 
			HttpSession session, RedirectAttributes attribute) {
		
		if (session.getAttribute("perfil") == null ) {
			System.out.println("entro");
	        // anadir error x login no autorizado
			attribute.addFlashAttribute("error", "No Tienes Permiso para ver esta página");
	        // Redirect to the root URL
	        return "redirect:/";
	    }
		
		Mesa mesa = mesaService.buscarPorMesaID(mesaid);
		List<Jugador> listaInscritos = playerService.findAllByMesa(mesa);
		List<Mesa> listaMesas = mesaService.listaMesas();
		model.addAttribute("titulo", "Lista de Inscritos - Por Mesa");
		model.addAttribute("inscritos", listaInscritos);
		model.addAttribute("mesas", listaMesas);
		model.addAttribute("mesaid", mesaid);
		return "/views/jugadores/bymesa";
	}
	
	/**
	 * Group by mesa.
	 *
	 * @param idMesa the id mesa
	 * @param model the model
	 * @param session the session
	 * @param attribute the attribute
	 * @return the string
	 */
	@GetMapping("/group")
    public String groupByMesa(@RequestParam(name = "idMesa") Long idMesa, Model model, 
    		HttpSession session, RedirectAttributes attribute) {
		
		if (session.getAttribute("perfil") == null ) {
			System.out.println("entro");
	        // anadir error x login no autorizado
			attribute.addFlashAttribute("error", "No Tienes Permiso para ver esta página");
	        // Redirect to the root URL
	        return "redirect:/";
	    }
		
        Long contar = playerService.findByMesa(idMesa);
        List<Mesa> listaMesas = mesaService.listaMesas();
        model.addAttribute("titulo", "Cantidad de Jugadores Inscritos por Mesa");
        model.addAttribute("contar", contar);
        model.addAttribute("mesas", listaMesas);
        model.addAttribute("idMesa", idMesa);
        return "/views/jugadores/group";
    }
	
	
}
