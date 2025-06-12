package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import entidad.Usuario;

public class UsuarioDao {

	private String host ="jdbc:mysql://localhost:3306/";
	private String user ="root";
	private String pass ="root";
	private String dbName ="banco_db";
	
	public int agregarUsuario(Usuario u) {
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e){
			e.printStackTrace();
		}
		
		Connection cn = null;
		int filas = 0;
		try {
			String query = "insert into Usuarios(nombreUsuario, contrasenaUsuario, tipoUsuario) values ('"+u.getNombreUsuario()+"','"+u.getContrasenaUsuario()+"', '"+u.getTipoUsuario()+"')"; 
			cn = DriverManager.getConnection(host+dbName, user, pass);
			Statement st = cn.createStatement();
			filas = st.executeUpdate(query);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return filas;
	}
	
	public int darDeBajaUsuario(Usuario u) {
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e){
			e.printStackTrace();
		}
		
		Connection cn = null;
		int filas = 0;
		try {
			String query = "update Usuarios set estado=0 where idUsuario="+u.getIdUsuario();
			cn = DriverManager.getConnection(host+dbName, user, pass);
			Statement st = cn.createStatement();
			filas = st.executeUpdate(query);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return filas;
	}

	public int modificarUsuario(Usuario u) {
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e){
			e.printStackTrace();
		}
		
		Connection cn = null;
		int filas = 0;
		try {
			String query = "update Usuarios set nombreUsuario='"+u.getNombreUsuario()+"', "
					+ "contrasenaUsuario='"+u.getContrasenaUsuario()+"', tipoUsuario='"+u.getTipoUsuario()+"', estado="+u.getEstado()+" where idUsuario="+u.getIdUsuario();
			cn = DriverManager.getConnection(host+dbName, user, pass);
			Statement st = cn.createStatement();
			filas = st.executeUpdate(query);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return filas;
	}

	public ArrayList<Usuario> listarUsuarios(){
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e){
			e.printStackTrace();
		}
		
		Connection cn = null;
		ArrayList<Usuario> listaUsuarios = new ArrayList<Usuario>();
		try {
			String query = "select * from Usuarios where estado=1";
			cn = DriverManager.getConnection(host+dbName, user, pass);
			Statement st = cn.createStatement();
			ResultSet rs = st.executeQuery(query);
			while(rs.next()){
				Usuario u = new Usuario();
				u.setNombreUsuario(rs.getString("nombreUsuario"));
				u.setContrasenaUsuario(rs.getString("contrasenaUsuario"));
				u.setTipoUsuario(rs.getString("tipoUsuario"));
				u.setIdUsuario(rs.getInt("idUsuario"));
				listaUsuarios.add(u);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		//System.out.println("Size: " + listaUsuarios.size());
		return listaUsuarios;
	}
	
}
