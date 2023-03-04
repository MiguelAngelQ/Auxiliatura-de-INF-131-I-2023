package Clase28022023;

public class Venta {
	private int idProd, cantidad;
	private String ci, fecha;

	public Venta() {
		idProd = cantidad = 0;
		fecha = ci = "";
	}

	public void leer() {
		System.out.println("Into ci, idProd, cantidad y fecha: ");
		ci = Leer.dato();
		idProd = Leer.datoInt();
		cantidad = Leer.datoInt();
		fecha = Leer.dato();
	}

	public void mostrar() {
		System.out.println("[" + ci + ", " + idProd + ", " + cantidad + ", " + fecha + "]");
	}

	public String getCi() {
		return ci;
	}

	public void setCi(String ci) {
		this.ci = ci;
	}

	public int getIdProd() {
		return idProd;
	}

	public void setIdProd(int idProd) {
		this.idProd = idProd;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

}
