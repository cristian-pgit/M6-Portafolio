/*
 * 
 */
package cl.vrol.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

// TODO: Auto-generated Javadoc
/**
 * The Class CalendarController.
 */
@Controller
@RequestMapping(name = "/Caledario")
public class CalendarController {
	
	/**
	 * Ver calendario.
	 *
	 * @return the string
	 */
	@GetMapping("/Calendario/")
	public String verCalendario() {
		return "calendar";
	}
	

}
