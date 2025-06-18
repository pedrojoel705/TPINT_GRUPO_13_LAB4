package entidad;

import java.time.LocalDate;

public class Cliente {

	private int idCliente;
	private Usuario usuario;
	private String dni;
	private String cuil;
	private String nombre;
	private String apellido;
	private String sexo;
	private String nacionalidad;
	private LocalDate fechaNacimiento;
	private String direccion;
	private String localidad;
	private String provincia;
	private String mail;
	private String telefono;
	private boolean estado;
	
	public Cliente() {};
	
	
	public Cliente(int idCliente, Usuario usuario, String dni, String cuil, String nombre, String apellido, String sexo,
			String nacionalidad, LocalDate fechaNacimiento, String direccion, String localidad, String provincia,
			String mail, String telefono) {
		this.idCliente = idCliente;
		this.usuario = usuario;
		this.dni = dni;
		this.cuil = cuil;
		this.nombre = nombre;
		this.apellido = apellido;
		this.sexo = sexo;
		this.nacionalidad = nacionalidad;
		this.fechaNacimiento = fechaNacimiento;
		this.direccion = direccion;
		this.localidad = localidad;
		this.provincia = provincia;
		this.mail = mail;
		this.telefono = telefono;
		this.estado = true;
	}

	public int getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getCuil() {
		return cuil;
	}

	public void setCuil(String cuil) {
		this.cuil = cuil;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getNacionalidad() {
		return nacionalidad;
	}

	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}

	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(LocalDate string) {
		this.fechaNacimiento = string;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getLocalidad() {
		return localidad;
	}

	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}

	public String getProvincia() {
		return provincia;
	}

	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public boolean isEstado() {
		return estado;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}


	public void setFechaNacimiento1(String string) {
			//asumo que la fecha está en formato "yyyy-MM-dd"
		if (string != null && !string.isEmpty()) { //si el string no es nulo o vacío
			String[] parts = string.split("-"); // dividir el string por el guión
			if (parts.length == 3) { // si hay tres partes dia, mes y año
				int year = Integer.parseInt(parts[0]); // convirto la primera parte a entero (año)
				int month = Integer.parseInt(parts[1]);// convirto la segunda parte a entero (mes)
				int day = Integer.parseInt(parts[2]); // convvierto la tercera parte a entero (día)
				this.fechaNacimiento = LocalDate.of(year, month, day);// creo un objeto LocalDate con el año, mes y día
			} else { 
				throw new IllegalArgumentException("Fecha de nacimiento debe estar en formato yyyy-MM-dd"); //sino, excepción
			}
		} else {
			this.fechaNacimiento = null; //
		}
		
	}


	
}
