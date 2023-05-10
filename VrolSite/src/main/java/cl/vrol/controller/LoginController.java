package cl.vrol.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import cl.vrol.models.entity.Usuario;
import cl.vrol.models.service.IUsuarioService;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import jakarta.validation.Valid;

@Controller
@RequestMapping("/views/login")
public class LoginController {
	
	@Autowired
	private IUsuarioService userService;
	
	
	@GetMapping("/")
	public String irLogin(Model model) {
		Usuario user = new Usuario();
		model.addAttribute("titulo", "Ingreso al Sistema");
		model.addAttribute("usuario", user);
		return "views/login/frmLogin";
	}
	
	@PostMapping("/in")
	public String login(HttpServletRequest request, @RequestParam("userName") String userName,
			@RequestParam("password") String password, Model model, RedirectAttributes attribute) {
		
		Usuario user = null;
		if(userName != null) {
			user = userService.findByUserNameAndPassword(userName, password);
			
			if(user == null) {
				System.out.println("Error: El Usuario no existe");
				attribute.addFlashAttribute("error", "ATENCIÓN: El ID de Usuario no existe!");
				return "redirect:/views/login";
			}
		} else {
			System.out.println("Error: Nombre de Usuario y/o Password Incorrecto");
			attribute.addFlashAttribute("error", "ATENCIÓN: Error con el ID de Usuario");
			return "redirect:/views/login";
		}
		
		model.addAttribute("titulo", "Log-in");
		HttpSession session = request.getSession();
		String nick = user.getNick();
		String perfil = user.getPerfil();
		session.setAttribute("user", user);
		session.setAttribute("nick", nick);
		session.setAttribute("perfil", perfil);
		System.out.println("Se ha conectado: "+user.getNick()+"  y su perfil es: "+perfil);
		return "redirect:/";
	}
	
	@GetMapping("/logout")
	public String logout(HttpServletRequest request) {
		HttpSession session = request.getSession();
	    System.out.println("Se ha Deslogueado: "+ session.getAttribute("username"));
	    session.removeAttribute("user");
	    session.removeAttribute("username");
	    session.removeAttribute("perfil");
	    System.out.println("perfil actual:"+ session.getAttribute("perfil"));
	    return "redirect:/";
	}

}
