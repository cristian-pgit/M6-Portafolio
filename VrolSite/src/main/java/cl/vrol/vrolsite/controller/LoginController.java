package cl.vrol.vrolsite.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import cl.vrol.vrolsite.dao.UsuarioDao;
import cl.vrol.vrolsite.model.Usuario;

@Controller
public class LoginController {

	@Autowired
	private UsuarioDao usuarioDao;
	
	
	@RequestMapping(value="/login", method = RequestMethod.POST)
	public ModelAndView loginIn(HttpServletRequest request, HttpServletResponse response) throws IOException{
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		try {
			Usuario user = usuarioDao.getUsuarioByUsernameAndPass(username, password);
			HttpSession session = request.getSession();
			session.setAttribute("username", username);
			String perfil = user.getPerfil();
			session.setAttribute("perfil", perfil);
			System.out.println("Se ha conectado: "+user.getUsername()+"  y su perfil es: "+perfil);
			return new ModelAndView("home");
		} catch (Exception e) {
			e.printStackTrace();
	        ModelAndView mav = new ModelAndView("home");
	        mav.addObject("message", "Nombre de usuario o password incorrecto");
	        return mav;
		}
		
	}
}
