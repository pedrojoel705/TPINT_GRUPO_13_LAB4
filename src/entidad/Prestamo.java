package entidad;

import java.time.LocalDate;

public class Prestamo {
	private int idPrestamo;
	private Cliente cliente;
	private Cuenta cuentaDestino;
	private LocalDate fechaAlta;
	private float montoPedido;
	private int duracionMeses;
	private float montoCuota;
	private int cantidadCuotas;
	private String estado;
	
	public Prestamo(int idPrestamo, Cliente cliente, Cuenta cuentaDestino, LocalDate fechaAlta, float montoPedido,
			int duracionMeses, float montoCuota, int cantidadCuotas) {
		this.idPrestamo = idPrestamo;
		this.cliente = cliente;
		this.cuentaDestino = cuentaDestino;
		this.fechaAlta = fechaAlta;
		this.montoPedido = montoPedido;
		this.duracionMeses = duracionMeses;
		this.montoCuota = montoCuota;
		this.cantidadCuotas = cantidadCuotas;
		this.estado = "solicitado";
	}

	public int getIdPrestamo() {
		return idPrestamo;
	}

	public void setIdPrestamo(int idPrestamo) {
		this.idPrestamo = idPrestamo;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Cuenta getCuentaDestino() {
		return cuentaDestino;
	}

	public void setCuentaDestino(Cuenta cuentaDestino) {
		this.cuentaDestino = cuentaDestino;
	}

	public LocalDate getFechaAlta() {
		return fechaAlta;
	}

	public void setFechaAlta(LocalDate fechaAlta) {
		this.fechaAlta = fechaAlta;
	}

	public float getMontoPedido() {
		return montoPedido;
	}

	public void setMontoPedido(float montoPedido) {
		this.montoPedido = montoPedido;
	}

	public int getDuracionMeses() {
		return duracionMeses;
	}

	public void setDuracionMeses(int duracionMeses) {
		this.duracionMeses = duracionMeses;
	}

	public float getMontoCuota() {
		return montoCuota;
	}

	public void setMontoCuota(float montoCuota) {
		this.montoCuota = montoCuota;
	}

	public int getCantidadCuotas() {
		return cantidadCuotas;
	}

	public void setCantidadCuotas(int cantidadCuotas) {
		this.cantidadCuotas = cantidadCuotas;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}
	
}
