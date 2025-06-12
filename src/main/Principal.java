package main;

import dao.UsuarioDao;
import entidad.Usuario;

public class Principal {

	public static void main(String[] args) {
		Usuario usuario = new Usuario();
		usuario.setContrasenaUsuario("perro");
		usuario.setEstado(true);
		usuario.setNombreUsuario("Vicky");
		usuario.setTipoUsuario("administrador");
		usuario.setIdUsuario(2);
		
		UsuarioDao udao = new UsuarioDao();
		
		udao.darDeBajaUsuario(usuario);
		
		//UsuarioDao udao = new UsuarioDao();
		//udao.agregarUsuario(usuario);

	}

}
