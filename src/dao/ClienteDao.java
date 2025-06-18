package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.sql.Date; 
import java.time.LocalDate;

import entidad.Cliente;
import entidad.Usuario;


public class ClienteDao {
	private String host ="jdbc:mysql://localhost:3306/";
	private String user ="root";
	private String pass ="root";
	private String dbName ="banco_db";
	
	public int agregarCliente(Cliente c) {
		int filas = 0;
		Connection cn = null;

		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e){
			e.printStackTrace();
		}
		
		try {
			cn = DriverManager.getConnection(host+dbName, user, pass);

			String query = "insert into Clientes(dni, cuil, nombre, apellido, sexo, nacionalidad, fechaNacimiento, direccion, "
					+ "localidad, provincia, mail, telefono, idUsuario) values ('"+c.getDni()+"','"+c.getCuil()+"', '"+c.getNombre()+"', '"+c.getApellido()+"',"
							+ "'"+c.getSexo()+"','"+c.getNacionalidad()+"','"+c.getFechaNacimiento()+"','"+c.getDireccion()+"','"+c.getLocalidad()+"',"
									+ "'"+c.getProvincia()+"','"+c.getMail()+"','"+c.getTelefono()+"', '"+c.getUsuario().getIdUsuario()+"')";
				
			PreparedStatement pst = cn.prepareStatement(query);
			pst.setString(1, c.getDni());
			pst.setString(2, c.getCuil());
			pst.setString(3, c.getNombre());
			pst.setString(4, c.getApellido());
			pst.setString(5, c.getSexo()); 
			pst.setString(6, c.getNacionalidad());
			
			if (c.getFechaNacimiento() != null) {
			    pst.setDate(7, java.sql.Date.valueOf(c.getFechaNacimiento())); 
			} else {
			    pst.setNull(7, java.sql.Types.DATE); // Si la fecha es nula, insertar NULL
			}
						
			pst.setString(8, c.getDireccion());
			pst.setString(9, c.getLocalidad());
			pst.setString(10, c.getProvincia());
			pst.setString(11, c.getMail()); 
			pst.setString(12, c.getTelefono());
			
			// que c.getUsuario() no sea null antes de llamar a getIdUsuario()
			if (c.getUsuario() != null) {
			    pst.setInt(13, c.getUsuario().getIdUsuario());
			} else {
			    throw new IllegalArgumentException("El objeto Usuario asociado al Cliente no puede ser nulo.");
			}
			
			filas = pst.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(cn != null) cn.close(); 
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return filas;
	}
	
	
	
	public int darDeBajaCliente(Cliente c) {
			
			try {
				Class.forName("com.mysql.jdbc.Driver");
			} catch (ClassNotFoundException e){
				e.printStackTrace();
			}
			
			Connection cn = null;
			int filas = 0;
			
			try {
				cn = DriverManager.getConnection(host+dbName, user, pass);
				String query = "update Cliente set estado=0 where idCliente="+c.getIdCliente();
				PreparedStatement pst = cn.prepareStatement(query);
				pst.setInt(1, c.getIdCliente());
				filas = pst.executeUpdate();
			} catch (Exception e) {
				e.printStackTrace();
			}
			return filas;
		}
	
	
	public int modificarCliente(Cliente c) {
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e){
			e.printStackTrace();
		}
		
		Connection cn = null;
		int filas = 0;
		try {
			String query = "update Cliente set nombre='"+c.getNombre()+"', "
					+ "apellido='"+c.getApellido()+"', dni='"+c.getDni()+"', cuil='"+c.getCuil()+"', sexo= '"+c.getSexo()+"', "
							+ "nacionalidad ='"+c.getNacionalidad()+"', fechaNacimiento= '"+c.getFechaNacimiento()+"',direccion= '"+c.getDireccion()+"', "
									+ "localidad= '"+c.getLocalidad()+"', provincia='"+c.getProvincia()+"', mail='"+c.getMail()+"', "
											+ "telefono='"+c.getTelefono()+"', where idCliente="+c.getIdCliente();
			cn = DriverManager.getConnection(host+dbName, user, pass);
			PreparedStatement pst = cn.prepareStatement(query);
			pst.setString(1, c.getNombre());
			pst.setString(2, c.getApellido());
			pst.setString(3, c.getDni());
			pst.setString(4, c.getCuil());
			pst.setString(5, c.getSexo());
			pst.setString(6, c.getNacionalidad());
			
			if (c.getFechaNacimiento() != null) {
			    pst.setDate(7, java.sql.Date.valueOf(c.getFechaNacimiento())); 
			} else {
			    pst.setNull(7, java.sql.Types.DATE);
			}
			
			pst.setString(8, c.getDireccion());
			pst.setString(9, c.getLocalidad());
			pst.setString(10, c.getProvincia());
			pst.setString(11, c.getMail()); 
			pst.setString(12, c.getTelefono());
			pst.setInt(13, c.getIdCliente());
			
			filas = pst.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(cn != null) cn.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return filas;
	}
	
		
	public ArrayList<Cliente> listarClientes(){
			
			try {
				Class.forName("com.mysql.jdbc.Driver");
			} catch (ClassNotFoundException e){
				e.printStackTrace();
			}
			
			Connection cn = null;
			ArrayList<Cliente> listaClientes = new ArrayList<Cliente>();
			
			try {
				String query = "select * from Cliente where estado=1";
				cn = DriverManager.getConnection(host+dbName, user, pass);
				
				Statement st = cn.createStatement();
				ResultSet rs = st.executeQuery(query);
				
				while(rs.next()){
					Cliente c = new Cliente();
					c.setIdCliente(rs.getInt("idCliente"));
					
					Usuario u = new Usuario();
					u.setIdUsuario(rs.getInt("idUsuario"));
					u.setNombreUsuario(rs.getString("nombreUsuario"));
					c.setUsuario(u);		
					c.setDni(rs.getString("dni"));
					c.setCuil(rs.getString("cuil"));
					c.setNombre(rs.getString("nombre"));
					c.setApellido(rs.getString("apellido"));
					c.setSexo(rs.getString("sexo"));
					c.setNacionalidad(rs.getString("nacionalidad"));
					Date sqlDate = rs.getDate("fechaNacimiento");
					if (sqlDate != null) {
					    c.setFechaNacimiento(sqlDate.toLocalDate()); 
					} else {
					    c.setFechaNacimiento(null);
					}
				
					c.setDireccion(rs.getString("direccion"));
					c.setLocalidad(rs.getString("localidad"));
					c.setProvincia(rs.getString("provincia"));
					c.setMail(rs.getString("mail"));
					c.setTelefono(rs.getString("telefono"));
					listaClientes.add(c);
				
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
			//System.out.println("Size: " + listaUsuarios.size());
			return listaClientes;
		}
		
	
	
		
}
