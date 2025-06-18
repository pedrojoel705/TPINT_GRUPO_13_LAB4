package entidad;

import java.time.LocalDate;

public class Cuenta {

	private int idCuenta;
	private Cliente cliente;
	private TipoCuenta tipoCuenta;
	private String numeroCuenta;
	private String cbu;
	private LocalDate fechaCreacion;
	private boolean estado;
	private float saldo;
	
	public Cuenta(int idCuenta, Cliente cliente, TipoCuenta tipoCuenta, String numeroCuenta, String cbu,
			LocalDate fechaCreacion, float saldo) {
		this.idCuenta = idCuenta;
		this.cliente = cliente;
		this.tipoCuenta = tipoCuenta;
		this.numeroCuenta = numeroCuenta;
		this.cbu = cbu;
		this.fechaCreacion = fechaCreacion;
		this.estado = true;
		this.saldo = saldo;
	}

	public int getIdCuenta() {
		return idCuenta;
	}

	public void setIdCuenta(int idCuenta) {
		this.idCuenta = idCuenta;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public TipoCuenta getTipoCuenta() {
		return tipoCuenta;
	}

	public void setTipoCuenta(TipoCuenta tipoCuenta) {
		this.tipoCuenta = tipoCuenta;
	}

	public String getNumeroCuenta() {
		return numeroCuenta;
	}

	public void setNumeroCuenta(String numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}

	public String getCbu() {
		return cbu;
	}

	public void setCbu(String cbu) {
		this.cbu = cbu;
	}

	public LocalDate getFechaCreacion() {
		return fechaCreacion;
	}

	public void setFechaCreacion(LocalDate fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}

	public boolean isEstado() {
		return estado;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}
	
}
