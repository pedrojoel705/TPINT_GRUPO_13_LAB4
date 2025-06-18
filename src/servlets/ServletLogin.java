package servlets;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.UsuarioDao;
import entidad.Usuario;

@WebServlet("/ServletLogin")
public class ServletLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public ServletLogin() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		if(request.getParameter("btnIniciarSesion")!=null) {
			UsuarioDao usuarioDao = new UsuarioDao();
			Usuario usuario = new Usuario();
			usuario.setNombreUsuario(request.getParameter("usuario"));
			usuario.setContrasenaUsuario(request.getParameter("contrasena"));
			
			String mensajeError = usuarioDao.verificarUsuario(usuario);
			
			if(mensajeError!=null) {
				request.setAttribute("mensajeError", mensajeError);
				RequestDispatcher rd = request.getRequestDispatcher("/login.jsp");
				rd.forward(request, response);
			} else {
	            HttpSession session = request.getSession();
	            session.setAttribute("usuario", usuario);
				
				RequestDispatcher rd = request.getRequestDispatcher("/home.jsp");
				rd.forward(request, response);
			}
		}
	}

}
