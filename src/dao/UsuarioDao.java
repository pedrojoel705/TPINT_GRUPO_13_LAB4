package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import entidad.Usuario;

public class UsuarioDao {

	private String host ="jdbc:mysql://localhost:3306/";
	private String user ="root";
	private String pass ="root";
	private String dbName ="banco_db";
	
	public String verificarUsuario(Usuario usuario) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e){
			e.printStackTrace();
		}
		
		Connection cn = null;
		
		try {
			cn = DriverManager.getConnection(host+dbName, user, pass);
			String query = "SELECT contrasenaUsuario FROM Usuarios WHERE nombreUsuario = ?";
			PreparedStatement pst = cn.prepareStatement(query);
			pst.setString(1, usuario.getNombreUsuario());
			ResultSet rs = pst.executeQuery();
			if (!rs.next() ) {
			    return "El usuario no existe.";
			}
			
			String contrasena = rs.getString("contrasenaUsuario");
		    if (!contrasena.equals(usuario.getContrasenaUsuario())) {
		        return "La contraseña es incorrecta.";
		    }
		} catch (Exception e) {
			e.printStackTrace();
			return "Error de base de datos.";
		}
		
		return null;
	}

	public int agregarUsuario(Usuario u) {

		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e){
			e.printStackTrace();
		}
		
		Connection cn = null;
		int filas = 0;
		try {
			cn = DriverManager.getConnection(host+dbName, user, pass);
			String query = "INSERT INTO Usuarios(nombreUsuario, contrasenaUsuario, tipoUsuario) values (?,?,?)";
			PreparedStatement pst = cn.prepareStatement(query);
			pst.setString(1, u.getNombreUsuario());
			pst.setString(1, u.getContrasenaUsuario());
			pst.setString(1, u.getTipoUsuario());
			filas = pst.executeUpdate();
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
			cn = DriverManager.getConnection(host+dbName, user, pass);
			String query = "UPDATE Usuarios SET estado=0 WHERE idUsuario=?";
			PreparedStatement pst = cn.prepareStatement(query);
			pst.setInt(1, u.getIdUsuario());
			filas = pst.executeUpdate();
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
			cn = DriverManager.getConnection(host+dbName, user, pass);
			String query = "UPDATE Usuarios SET nombreUsuario=?, contrasenaUsuario=?, tipoUsuario=?, estado=? WHERE idUsuario=?";
			PreparedStatement pst = cn.prepareStatement(query);
			pst.setString(1, u.getNombreUsuario());
			pst.setString(2, u.getContrasenaUsuario());
			pst.setString(3, u.getTipoUsuario());
			pst.setBoolean(4, u.getEstado());
			pst.setInt(5, u.getIdUsuario());
			filas = pst.executeUpdate();
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
