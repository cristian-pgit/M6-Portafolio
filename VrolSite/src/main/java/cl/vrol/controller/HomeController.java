/*
 * 
 */
package cl.vrol.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

// TODO: Auto-generated Javadoc
/**
 * The Class HomeController.
 */
@Controller
public class HomeController {

	/**
	 * Home.
	 *
	 * @return the string
	 */
	@GetMapping("/")
	public String home() {
		return "home";
	}
}
