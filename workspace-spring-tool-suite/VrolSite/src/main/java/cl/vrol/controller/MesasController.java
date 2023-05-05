package cl.vrol.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


import cl.vrol.model.entity.Mesa;
import cl.vrol.models.service.IMesaService;

@Controller
@RequestMapping("/mesas")
public class MesasController {
	
	@Autowired
	private IMesaService mesaService;
	
	@GetMapping("/")
	public String listarJugadores(Model model) {
		List<Mesa> mesas = mesaService.listaMesas();
		model.addAttribute("titulo", "Mesas Disponibles");
		model.addAttribute("mesas", mesas);
		return "mesas";
	}

}