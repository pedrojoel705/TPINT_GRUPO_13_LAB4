package main;

import dao.ClienteDao;
import dao.UsuarioDao;
import entidad.Cliente;
import entidad.Usuario;

public class Principal {

	public static void main(String[] args) {
		Usuario usuario = new Usuario();
		usuario.setContrasenaUsuario("perro");
		usuario.setEstado(true);
		usuario.setNombreUsuario("Vicky");
		usuario.setTipoUsuario("administrador");
		//usuario.setIdUsuario(2);
		
		UsuarioDao udao = new UsuarioDao();
		udao.agregarUsuario(usuario);

		//udao.darDeBajaUsuario(usuario);
		//UsuarioDao udao = new UsuarioDao();
		
		int filasUsuario = udao.agregarUsuario(usuario);
		if (filasUsuario > 0) {
		    System.out.println("Usuario agregado correctamente.");
		   
		} else {
		    System.out.println("Error al agregar Usuario. ");
	
		}
		
		
		Cliente cliente = new Cliente();
		
		cliente.setDni("12345678");
		cliente.setCuil("20123456789");
		cliente.setNombre("Victoria");
		cliente.setApellido("Perez");
		cliente.setSexo("femenino");
		cliente.setNacionalidad("Argentina");
		cliente.setFechaNacimiento1("1990-01-01"); 
		cliente.setDireccion("Calle Falsa 123");
		cliente.setLocalidad("Buenos Aires");
		cliente.setProvincia("Buenos Aires");
		cliente.setMail("victoria@mail.com");
		cliente.setTelefono("1234567890");
		
		// Esto establece el vínculo entre el cliente y su usuario.
		// El 'usuario' creado arriba debe tener un ID válido para que funcione el INSERT.		
		cliente.setUsuario(usuario);
		ClienteDao cdao = new ClienteDao();
		int filasCliente = cdao.agregarCliente(cliente);
		
		if(filasCliente > 0) {
			System.out.println("Cliente agregado correctamente.");
		} else {
			System.out.println("Error al agregar cliente.");
		}
		
		

	}

}
