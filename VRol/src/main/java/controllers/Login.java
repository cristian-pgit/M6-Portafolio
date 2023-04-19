package controllers;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import DAO.UsuarioDAO;
import DAOImpl.UsuarioDAOImpl;
import models.Usuario;

import javax.servlet.RequestDispatcher;

/**
 * Servlet implementation class Login
 */
@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Login() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		String userName = request.getParameter("username");
		String pass = request.getParameter("password");
		
		boolean esUsuarioValido = validarUsuarioYPass(userName, pass);
		if (esUsuarioValido) {
			System.out.println("El usuario es correcto"+". Se ha conectado: "+userName);
			session.setAttribute("userName", userName);
			//session.setAttribute("perfil", perfil);
			RequestDispatcher rd = getServletContext().getRequestDispatcher("/index.jsp");
			rd.forward(request, response);
		} else {
			System.out.println("El usuario o pass Incorrecto"+". Se intento con: "+userName+" y "+pass);
			response.sendRedirect("index.jsp");
		}
	}

	private boolean validarUsuarioYPass(String userName, String pass) {
		if (obtenerUsuario(userName, pass) != null) {
			return obtenerUsuario(userName, pass) != null;
		} else {
			return false;
		}
	}
	
	private Usuario obtenerUsuario(String userName, String pass) {
		UsuarioDAO udao = new UsuarioDAOImpl();
		Usuario user = udao.getUsuarioByNameandPass(userName, pass);
		
		return user;
		
	}

}
