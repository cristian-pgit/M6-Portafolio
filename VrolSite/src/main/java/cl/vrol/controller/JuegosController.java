/*
 * 
 */
package cl.vrol.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

// TODO: Auto-generated Javadoc
/**
 * The Class JuegosController.
 */
@Controller
@RequestMapping(name = "/juegos")
public class JuegosController {
	
	
	/**
	 * Mostrar juegos.
	 *
	 * @return the string
	 */
	@GetMapping("/juegos/")
	public String mostrarJuegos() {
		return "juegos";
	}
	
	

}
