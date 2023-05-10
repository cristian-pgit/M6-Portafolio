package cl.vrol.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(name = "/Juntas")
public class JuntasController {

	@GetMapping("/Juntas/")
	public String verJuntas() {
		return "juntas";
	}
	
}
