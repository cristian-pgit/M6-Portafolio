/*
 * 
 */
package cl.vrol.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

// TODO: Auto-generated Javadoc
/**
 * The Class JuntasController.
 */
@Controller
@RequestMapping(name = "/Juntas")
public class JuntasController {

	/**
	 * Ver juntas.
	 *
	 * @return the string
	 */
	@GetMapping("/Juntas/")
	public String verJuntas() {
		return "juntas";
	}
	
}
