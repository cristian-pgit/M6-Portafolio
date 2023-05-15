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
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import cl.vrol.models.entity.Jugador;
import cl.vrol.models.entity.Mesa;
import cl.vrol.models.service.IMesaService;
import jakarta.servlet.http.HttpSession;
import jakarta.validation.Valid;

// TODO: Auto-generated Javadoc
/**
 * The Class MesasController.
 */
@Controller
@RequestMapping("/mesas")
public class MesasController {
	
	/** The mesa service. */
	@Autowired
	private IMesaService mesaService;
	
	/**
	 * Listar jugadores.
	 *
	 * @param model the model
	 * @return the string
	 */
	@GetMapping("/")
	public String listarMesas(Model model) {
		List<Mesa> mesas = mesaService.listaMesas();
		model.addAttribute("titulo", "Mesas Disponibles");
		model.addAttribute("mesas", mesas);
		return "mesas";
	}
	
	/**
	 * Mostrar mesa.
	 *
	 * @param model the model
	 * @param id the id
	 * @return the string
	 */
	@GetMapping("/ver/{id}")
	public String mostrarMesa(Model model, @PathVariable Long id) {
	    Mesa mesa = mesaService.buscarPorMesaID(id);
	    int jugadoresInscritos = mesaService.getCuposDisponibles(id);
	    model.addAttribute("mesa", mesa);
	    model.addAttribute("jugadoresInscritos", jugadoresInscritos);
	    return "/views/mesas/mostrar_mesa";
	}
	
	@GetMapping("/nuevamesa")
	public String crearMesa(Model model, HttpSession session, RedirectAttributes attribute) {
		
		if (session.getAttribute("perfil") == null ) {
			System.out.println("entro");
	        // anadir error x login no autorizado
			attribute.addFlashAttribute("error", "No Tienes Permiso para ver esta página");
	        // Redirect to the root URL
	        return "redirect:/";
	    }
		
		Mesa mesa = new Mesa();
		
		model.addAttribute("titulo", "Registrar - Nueva Mesa");
		model.addAttribute("mesa", mesa);
		
		return "/views/mesas/frmMesa";
	}
	
	@PostMapping("/registrarmesa")
	public String registrarMesa(@Valid @ModelAttribute Mesa mesa, BindingResult result, 
			Model model, RedirectAttributes attribute) {
		
		if (result.hasErrors()) {
			model.addAttribute("titulo", "Registrar - Nueva Mesa");
			model.addAttribute("mesa", mesa);
			System.out.println("Hubo errores en el formulario");
			return "/views/jugadores/frmMesa";
		}
		
		mesaService.guardar(mesa);
		System.out.println("Jugador Inscrito");
		attribute.addFlashAttribute("success", "Mesa Registrada");
		return "redirect: mesas";
	}

}
