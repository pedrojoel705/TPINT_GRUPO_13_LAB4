package entidad;

public class Usuario {
	
	private int idUsuario;
	private String nombreUsuario;
	private String contrasenaUsuario;
	private String tipoUsuario;
	boolean estado;
	
	public Usuario() {
		
	}
	
	public Usuario(int idUsuario, String nombreUsuario, String contrasenaUsuario, String tipoUsuario) {
		this.idUsuario = idUsuario;
		this.nombreUsuario = nombreUsuario;
		this.contrasenaUsuario = contrasenaUsuario;
		this.tipoUsuario = tipoUsuario;
		this.estado = true;
	}

	public int getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getNombreUsuario() {
		return nombreUsuario;
	}

	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}

	public String getContrasenaUsuario() {
		return contrasenaUsuario;
	}

	public void setContrasenaUsuario(String contrasenaUsuario) {
		this.contrasenaUsuario = contrasenaUsuario;
	}

	public String getTipoUsuario() {
		return tipoUsuario;
	}

	public void setTipoUsuario(String tipoUsuario) {
		this.tipoUsuario = tipoUsuario;
	}

	public boolean getEstado() {
		return estado;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}
	
}
