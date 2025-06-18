package entidad;

import java.time.LocalDate;

public class Movimiento {
	
	private int idMovimiento;
	private TipoMovimiento tipoMovimiento;
	private Cuenta cuentaOrigen;
	private Cuenta cuentaDestino;
	private LocalDate fecha;
	private String detalle;
	private float monto;
	
	public Movimiento(int idMovimiento, TipoMovimiento tipoMovimiento, Cuenta cuentaOrigen, Cuenta cuentaDestino,
			LocalDate fecha, String detalle, float monto) {
		this.idMovimiento = idMovimiento;
		this.tipoMovimiento = tipoMovimiento;
		this.cuentaOrigen = cuentaOrigen;
		this.cuentaDestino = cuentaDestino;
		this.fecha = fecha;
		this.detalle = detalle;
		this.monto = monto;
	}

	public int getIdMovimiento() {
		return idMovimiento;
	}

	public void setIdMovimiento(int idMovimiento) {
		this.idMovimiento = idMovimiento;
	}

	public TipoMovimiento getTipoMovimiento() {
		return tipoMovimiento;
	}

	public void setTipoMovimiento(TipoMovimiento tipoMovimiento) {
		this.tipoMovimiento = tipoMovimiento;
	}

	public Cuenta getCuentaOrigen() {
		return cuentaOrigen;
	}

	public void setCuentaOrigen(Cuenta cuentaOrigen) {
		this.cuentaOrigen = cuentaOrigen;
	}

	public Cuenta getCuentaDestino() {
		return cuentaDestino;
	}

	public void setCuentaDestino(Cuenta cuentaDestino) {
		this.cuentaDestino = cuentaDestino;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	public String getDetalle() {
		return detalle;
	}

	public void setDetalle(String detalle) {
		this.detalle = detalle;
	}

	public float getMonto() {
		return monto;
	}

	public void setMonto(float monto) {
		this.monto = monto;
	}
	
}
