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

import cl.vrol.models.entity.Usuario;
import cl.vrol.models.service.IUsuarioService;
import jakarta.validation.Valid;

@Controller
@RequestMapping("/views/usuarios")
public class UsuarioController {

	@Autowired
	private IUsuarioService userService;
	
	@GetMapping("/")
	public String listarUsuarios(Model model) {
		List<Usuario> listaUsuarios = userService.listarTodos();
		model.addAttribute("titulo", "Lista de Usuarios");
		model.addAttribute("usuarios", listaUsuarios);
		return "/views/usuarios/";
	}
	
	@GetMapping("nuevousuario")
	public String crearUsuario(Model model) {
		
		Usuario user = new Usuario();
		
		model.addAttribute("titulo", "Registrar Nuevo Usuario");
		model.addAttribute("usuario", user);
		
		return "/views/usuarios/frmUsuario";
	}
	
	@PostMapping("/registrar")
	public String registrar(@Valid @ModelAttribute Usuario user, BindingResult result,
			Model model, RedirectAttributes attribute) {
		
		if(result.hasErrors()) {
			model.addAttribute("titulo", "Registrar Nuevo Usuario");
			model.addAttribute("usuario", user);
			System.out.println("Hubo Errores en el formulario");
			return "/views/usuarios/frmUsuario";
		}
		
		userService.guardar(user);
		System.out.println("Usuario Registrado");
		attribute.addFlashAttribute("success", "Usuario Registrado!");
		return "redirect:/views/usuarios/";
		
	}
	
	@GetMapping("/edit/{id}")
	public String editarUsuario(@PathVariable("id") Long idUsuario,
			Model model, RedirectAttributes attribute) {
		Usuario user = null;
		
		if(idUsuario >0) {
			user = userService.buscarPorId(idUsuario);
			
			if(user == null) {
				System.out.println("Error: El ID de Usuario no existe");
				attribute.addFlashAttribute("error", "ATENCIÓN: El ID de Usuario no existe!");
				return "redirect:/views/usuarios/";
			}
		} else {
			System.out.println("Error: Error con el ID de Usuario");
			attribute.addFlashAttribute("error", "ATENCIÓN: Error con el ID de Usuario");
			return "redirect:/views/usuarios/";
		}
		
		model.addAttribute("titulo", "Editar Usuario");
		model.addAttribute("usuario", user);
		return "/views/usuarios/frmUsuario";
	}
	
	@GetMapping("/delete/{id}")
	public String eliminarUsuario(@PathVariable("id") Long idUsuario,
			Model model, RedirectAttributes attribute) {
		Usuario user = null;
		
		if(idUsuario >0) {
			user = userService.buscarPorId(idUsuario);
			
			if(user == null) {
				System.out.println("Error: El ID de Usuario no existe");
				attribute.addFlashAttribute("error", "ATENCIÓN: El ID de Usuario no existe!");
				return "redirect:/views/usuarios/";
			}
		} else {
			System.out.println("Error: Error con el ID de Usuario");
			attribute.addFlashAttribute("error", "ATENCIÓN: Error con el ID de Usuario");
			return "redirect:/views/usuarios/";
		}
		
		userService.eliminar(idUsuario);
		System.out.println("Usuario Eliminado con Exito");
		model.addAttribute("titulo", "Editar Usuario");
		return "/views/usuarios/frmUsuario";
	}
	
	
}
