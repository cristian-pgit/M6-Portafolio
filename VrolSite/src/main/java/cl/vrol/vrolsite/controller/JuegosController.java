package cl.vrol.vrolsite.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class JuegosController {

	@RequestMapping(value="/juegos")
	public ModelAndView test(HttpServletResponse response) throws IOException{
		return new ModelAndView("juegos");
	}
}