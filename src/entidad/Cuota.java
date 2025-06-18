package entidad;

import java.time.LocalDate;

public class Cuota {

	private int idCuota;
	private Prestamo prestamo;
	private int numeroCuota;
	private float monto;
	private LocalDate fechaVencimiento;
	private LocalDate fechaPago;
	private String estado;
	
	public Cuota(int idCuota, Prestamo prestamo, int numeroCuota, float monto, LocalDate fechaVencimiento,
			LocalDate fechaPago) {
		this.idCuota = idCuota;
		this.prestamo = prestamo;
		this.numeroCuota = numeroCuota;
		this.monto = monto;
		this.fechaVencimiento = fechaVencimiento;
		this.fechaPago = fechaPago;
		this.estado = "pendiente";
	}

	public int getIdCuota() {
		return idCuota;
	}

	public void setIdCuota(int idCuota) {
		this.idCuota = idCuota;
	}

	public Prestamo getPrestamo() {
		return prestamo;
	}

	public void setPrestamo(Prestamo prestamo) {
		this.prestamo = prestamo;
	}

	public int getNumeroCuota() {
		return numeroCuota;
	}

	public void setNumeroCuota(int numeroCuota) {
		this.numeroCuota = numeroCuota;
	}

	public float getMonto() {
		return monto;
	}

	public void setMonto(float monto) {
		this.monto = monto;
	}

	public LocalDate getFechaVencimiento() {
		return fechaVencimiento;
	}

	public void setFechaVencimiento(LocalDate fechaVencimiento) {
		this.fechaVencimiento = fechaVencimiento;
	}

	public LocalDate getFechaPago() {
		return fechaPago;
	}

	public void setFechaPago(LocalDate fechaPago) {
		this.fechaPago = fechaPago;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}
	
}


