/*
 * 
 */
package cl.vrol.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import cl.vrol.models.entity.Contacto;
import cl.vrol.models.service.IContactoService;

// TODO: Auto-generated Javadoc
/**
 * The Class ContactoController.
 */
@Controller
@RequestMapping("/views/contacto")
public class ContactoController {
	
	/** The contacto service. */
	@Autowired
	private IContactoService contactoService;
	
	/**
	 * Contacto.
	 *
	 * @param model the model
	 * @return the string
	 */
	@GetMapping("/")
	public String contacto(Model model) {
		Contacto contacto = new Contacto(); 
		model.addAttribute("titulo", "Nuevo Mensaje");
		model.addAttribute("contacto", contacto);
		return "/views/contacto/contacto";
	}
	
	/**
	 * Enviar msj.
	 *
	 * @param contacto the contacto
	 * @param attribute the attribute
	 * @return the string
	 */
	@PostMapping("/enviar")
	public String enviarMsj(@ModelAttribute Contacto contacto, RedirectAttributes attribute) {
		contactoService.guardar(contacto);
		System.out.println("Contacto Enviado: "+contacto);
		attribute.addFlashAttribute("success", "Mensaje enviado con Exito!");
		return "redirect:/views/contacto/";
	}

}
