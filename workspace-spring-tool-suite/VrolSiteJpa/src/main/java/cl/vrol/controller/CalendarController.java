package cl.vrol.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(name = "/Caledario")
public class CalendarController {
	
	@GetMapping("/Calendario/")
	public String verCalendario() {
		return "calendar";
	}
	

}
